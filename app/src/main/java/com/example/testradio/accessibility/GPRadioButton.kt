package com.example.testradio.accessibility

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatRadioButton

class GPRadioButton : AppCompatRadioButton {

    var talkBackString: CharSequence? = null

    override fun getAccessibilityClassName(): CharSequence {
        return GPRadioButton::class.java.simpleName
    }

    /**
     * [GPRadioButton] default constructor
     * @param context is an activity [Context]
     * @param attrs is an [AttributeSet]
     * @param defStyle is [Int] value of style
     */
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        setupView()
    }

    /**
     * [GPRadioButton] default constructor
     * @param context is an activity [Context]
     * @param attrs is an [AttributeSet]
     */
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setupView()
    }

    /**
     * [GPRadioButton] default constructor
     * @param context is an activity [Context]
     */
    constructor(context: Context) : super(context) {
        setupView()
    }

    /**
     * This method is used to setup view's attributes
     */
    private fun setupView() {
        accessibilityDelegate = MyAccessibilityDelegate()
    }

    /**
     * Custom class AccessibilityDelegate
     */
    inner class MyAccessibilityDelegate : AccessibilityDelegate() {

        /**
         * Override function onInitializeAccessibilityNodeInfo of AccessibilityDelegate
         * @param host is [View]
         * @param info is [AccessibilityNodeInfo]
         */
        @RequiresApi(Build.VERSION_CODES.R)
        override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            if (talkBackString.isNullOrEmpty() && host.contentDescription.isNullOrEmpty().not()) {
                talkBackString = host.contentDescription
            }
            info.apply {
                contentDescription = ""
                hintText = talkBackString.toString()
                error = ""
                text = ""
            }
        }
    }
}