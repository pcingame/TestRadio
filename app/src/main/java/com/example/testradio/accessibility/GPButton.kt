package com.example.testradio.accessibility

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat


class GPButton : AppCompatTextView {

    /**
     * [GPButton] default constructor
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
     * [GPButton] default constructor
     * @param context is an activity [Context]
     * @param attrs is an [AttributeSet]
     */
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setupView()
    }

    /**
     * [GPButton] default constructor
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
            ViewCompat.setAccessibilityDelegate(host,
                object : AccessibilityDelegateCompat() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfoCompat
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        info.roleDescription = getState()
                    }
                })
        }
    }


    override fun setClickable(clickable: Boolean) {
        if (clickable == isClickable) return
        super.setClickable(clickable)
    }

    private fun getState(): String {
        return if (isClickable) {
            "button"
        } else {
            "dimmed button"
        }
    }
}