/*
 * Copyright © OMRON HEALTHCARE Co., Ltd. 2020. All rights reserved.
 */

package com.example.testradio.accessibility

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Environment
import android.os.StatFs
import android.provider.Settings
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.example.testradio.R

@SuppressLint("StaticFieldLeak")
object AppUtils {

    private lateinit var context: Context
    var lastTimeInBackground = 0L

    /**
     * This is the method to set context for AppUtils
     */
    fun setup(context: Context) {
        AppUtils.context = context
    }

    /**
     * This is the method to get app name
     * @return String is name of app
     */
    fun getApplicationName(): String {
        val applicationInfo = context.applicationInfo
        val stringId = applicationInfo.labelRes
        // if id of string show app name is 0
        // set value default is return value else set it is return value
        return if (stringId == 0) applicationInfo.nonLocalizedLabel.toString() else context.getString(
            stringId
        )
    }

    /**
     * This is the method to get version name of app
     * @return String is version name
     */
    fun versionName(): String {
        val mgr = context.packageManager
        val info = mgr.getPackageInfo(context.packageName, PackageManager.GET_META_DATA)
        return info.versionName.replace(".", "_")
    }

    /**
     * This is the method to get list version of app
     * @return List
     */
    fun getListVersionApp(): List<String> {
        val divideVersion = if (versionName().contains("_")) "_" else "\\."
        return versionName().split(divideVersion.toRegex()).toList()
    }

    /**
     * This is the method to get major version of app
     * @return String is  major version
     */
    fun getMajorVersionLocal(): String {
        val versions = getListVersionApp()
        if (versions.isEmpty()) {
            return ""
        }
        return versions.first()
    }

    /**
     * This is the method to get minor version of app
     * @return String is  minor version
     */
    fun getMinorVersionLocal(): String {
        val versions = getListVersionApp()
        if (versions.size < 2) {
            return ""
        }
        return versions[1]
    }

    /**
     * This is the method to get revision version of app
     * @return String is revision version
     */
    fun getRevisionVersionLocal(): String {
        val versions = getListVersionApp()
        if (versions.size < 3) {
            return ""
        }

        val dataList = versions[2].split("-".toRegex()).toList()

        if (dataList.isEmpty()) {
            return ""
        }

        return dataList.first()
    }

    /**
     * This is the method to get value string in file string.xml
     * @param resId is id of string
     * @return String is value of string have id is resId
     */
    fun getString(@StringRes resId: Int): String {
        return context.getString(resId)
    }

    /**
     * This is the method to get the first part of the base url
     * @return String is first part of the base url
     */

    /**
     *
     * Gets the state of Airplane Mode.
     * @return true if enabled.
     */
    fun isAirplaneModeOn(): String {
        // return true if enabled to get text Airplane Mode "ON"
        // return false if unEnabled to get text  Airplane Model "OFF"
        val checkAirPlane = Settings.System.getInt(
            context.applicationContext.contentResolver,
            Settings.Global.AIRPLANE_MODE_ON,
            0
        )
        return getString(if (checkAirPlane != 0) R.string.gpaps00v06 else R.string.gpaps00v07)
    }

    /**
     *
     * Gets the state of Wifi Mode.
     * @return true if enabled.
     */
    fun isWifiModeOn(): String {
        // return true if enabled to get text wifi "ON"
        // return false if unEnabled to get text wifi "OFF"
        val checkWifiEnabled = Settings.System.getInt(
            context.applicationContext.contentResolver,
            Settings.Global.WIFI_ON,
            0
        )
        return getString(if (checkWifiEnabled != 0) R.string.gpaps00v06 else R.string.gpaps00v07)
    }

    /**
     *
     * This is the method check if the device android position mode is enabled
     * @return true if enabled
     */
    fun isGPSEnabled(): String {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        // return true if enabled to get text gsp "ON"
        // return false if unEnabled to get text gsp "OFF"
        val checkLocation = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
        return getString(
            if (checkLocation) R.string.gpaps00v06 else R.string.gpaps00v07
        )
    }

    /**
     * This is the method to format size
     * @param calculateSize to calculate the size
     */
    private fun formatSize(calculateSize: Long): String {
        var size = calculateSize
        var suffix: String? = null
        if (size >= 1024) {
            suffix = "KB"
            size /= 1024
            if (size >= 1024) {
                suffix = "MB"
                size /= 1024
            }
        }
        val resultBuffer = java.lang.StringBuilder(size.toString())
        var commaOffset = resultBuffer.length - 3
        while (commaOffset > 0) {
            resultBuffer.insert(commaOffset, ',')
            commaOffset -= 3
        }
        if (suffix != null) resultBuffer.append(suffix)
        return resultBuffer.toString()
    }

    /**
     * This is the method check Using SdCard
     * @param context
     */
    fun checkUsingSdCard(context: Context): String {
        val isUsingSdCard = ContextCompat.getExternalFilesDirs(context, null).size >= 2
        return getString(if (isUsingSdCard) R.string.TRUE else R.string.FALSE)
    }

    /**
     *
     * This is the method get used Disk Space In MB
     */
    fun getUsedMemorySize(): String {
        val path = Environment.getDataDirectory()
        val stat = StatFs(path.path)
        val blockSize = stat.blockSizeLong
        val totalBlocks = stat.blockCountLong - stat.availableBlocksLong
        return formatSize(totalBlocks * blockSize)
    }

    /**
     * This is the method get heap memory size
     */
    fun getHeapMemorySize(): String {
        val info = Runtime.getRuntime()
        // total size is total memory in internal
        val totalSize = info.maxMemory()
        return formatSize(totalSize)
    }

    /**
     *
     * This is the method get total Disk Space In MB
     */
    fun getTotalMemorySize(): String {
        val path = Environment.getDataDirectory()
        val stat = StatFs(path.path)
        val blockSize = stat.blockSizeLong
        val totalBlocks = stat.blockCountLong
        return formatSize(totalBlocks * blockSize)
    }

    /**
     *
     * This is the method get free Disk Space In MB
     */
    fun getAvailableStorage(): String {
        val path = Environment.getDataDirectory()
        val stat = StatFs(path.path)
        val blockSize = stat.blockSizeLong
        val availableBlocks = stat.availableBlocksLong
        return formatSize(availableBlocks * blockSize)
    }

    /**
     *
     * This is the method to check handle token has expried
     */


    /**
     * This is the method is used to get Blood and Urine text
     * @param isTestBlood is enable or not
     * @param isTestUrine is enable or not
     */
    fun getBloodUrineText(isTestBlood: Int?, isTestUrine: Int?): String {
        return if (isTestBlood == 1 && isTestUrine == 1) {
            getString(R.string.blood_and_urine)
        } else if (isTestBlood == 1) {
            getString(R.string.blood)
        } else if (isTestUrine == 1) {
            getString(R.string.urine)
        } else {
            ""
        }
    }

    fun isCycleOdd(
        timeStart: Long,
        timeEnd: Long,
        timeMeasureStart: Long,
        timeMeasureEnd: Long,
        cycleNumber: Int
    ): Boolean {
        if (timeMeasureStart <= timeMeasureEnd &&
            (timeStart != timeMeasureStart || timeEnd != timeMeasureEnd || cycleNumber == 0)
        ) {
            return false
        }
        return true
    }

}
