package com.example.testradio.accessibility

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import androidx.appcompat.widget.AppCompatCheckBox


class GPCheckBox : AppCompatCheckBox {

    var talkBackString: CharSequence? = null

    override fun getAccessibilityClassName(): CharSequence {
        return GPCheckBox::class.java.simpleName
    }

    /**
     * [GPCheckBox] default constructor
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
     * [GPCheckBox] default constructor
     * @param context is an activity [Context]
     * @param attrs is an [AttributeSet]
     */
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setupView()
    }

    /**
     * [GPCheckBox] default constructor
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
        override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            if (talkBackString.isNullOrEmpty() && host.contentDescription.isNullOrEmpty().not()) {
                talkBackString = host.contentDescription
            }

            info.apply {
                isCheckable = false
                // ...and then you can set whatever you want as a text
                hintText = "Check box" + " " + talkBackString.toString() + " " + getDescription()
            }
        }
    }

    override fun setChecked(checked: Boolean) {
        if (checked == isChecked) return
        super.setChecked(checked)
        // since we've disabled the checked/unchecked readouts
        // we are forced to manually announce changes to the state
        announceForAccessibility(getDescription())
    }

    private fun getDescription(): String {
        return if (isChecked) {
            "Checked"
        } else {
            "Not checked"
        }
    }

}