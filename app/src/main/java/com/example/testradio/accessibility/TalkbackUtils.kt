package com.example.testradio.accessibility

import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.example.testradio.R

object TalkbackUtils {
    /**
     * This method is used to set accessibilityDelegate for view
     * @param view is View will be setup
     * @param text is text for talk back function
     */
    fun setAccessibilityDelegate(
        view: View?,
        text: String?,
        suffix: String? = null,
        removeClass: Boolean = false
    ) {
        try {
            val accessibilityDelegate: View.AccessibilityDelegate =
                object : View.AccessibilityDelegate() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfo
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        info.apply {
                            this.text = text
                            if (text.isNullOrEmpty().not()) {
                                contentDescription = ""
                                hintText = ""
                                error = ""
                            }
                            if (removeClass) {
                                className = ""
                                info.isSelected = false
                                isClickable = false
                                removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK)
                            }
                            suffix?.let {
                                val customClick = AccessibilityNodeInfo.AccessibilityAction(
                                    AccessibilityNodeInfo.ACTION_CLICK, suffix
                                )
                                addAction(customClick)
                            }
                        }
                    }
                }
            view?.accessibilityDelegate = accessibilityDelegate
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    /**
     * This method is used to set accessibilityDelegate for SYS/DIA text, Dr text & mmHg text
     * @param textView is TextView will be setup
     */
    fun setSpecialAccessibilityDelegate(textView: TextView) {
        val textString = textView.text.toString()
            .replace(
                AppUtils.getString(R.string.no_data_mmhg),
                AppUtils.getString(R.string.no_data)
            )
            .replace("/", AppUtils.getString(R.string.over))
        setAccessibilityDelegate(textView, textString)
    }

    /**
     * This method is used to set accessibilityDelegate for view
     * @param view is View will be setup
     */
    fun setTextOnlyAccessibilityDelegate(view: View?) {
        try {
            val accessibilityDelegate: View.AccessibilityDelegate =
                object : View.AccessibilityDelegate() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfo
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        info.className = ""
                        info.isClickable = false
                        info.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK)
                    }
                }
            view?.accessibilityDelegate = accessibilityDelegate
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    /**
     * This method is used to set suffix for accessibilityDelegate
     * @param view is View will be setup
     * @param suffix is String
     */
    fun setSuffixAccessibilityDelegate(view: View?, suffix: String?) {
        try {
            val accessibilityDelegate: View.AccessibilityDelegate =
                object : View.AccessibilityDelegate() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfo
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        val customClick = AccessibilityNodeInfo.AccessibilityAction(
                            AccessibilityNodeInfo.ACTION_CLICK, suffix
                        )
                        info.addAction(customClick)
                    }
                }
            view?.accessibilityDelegate = accessibilityDelegate
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    /**
     * This method is used to set Button accessibilityDelegate for TextView
     * @param view is View will be setup
     */
    fun setButtonAccessibilityDelegate(view: TextView?, suffix: String? = null) {
        setExtraTextAccessibilityDelegate(view, AppUtils.getString(R.string.Button), suffix)
    }

    /**
     * This method is used to set WebLink accessibilityDelegate for TextView
     * @param view is View will be setup
     * @param isBrowserLink is check if link is open with browser
     */
    fun setWebLinkAccessibilityDelegate(view: TextView?, isBrowserLink: Boolean) {
        setExtraTextAccessibilityDelegate(
            view,
            if (isBrowserLink) AppUtils.getString(R.string.Link) else AppUtils.getString(R.string.Button),
            AppUtils.getString(R.string.open_weblink)
        )
    }

    /**
     * This method is used to set WebLink accessibilityDelegate for ImageView
     * @param view is View will be setup
     * @param text is text for talk back function
     */
    fun setWebLinkAccessibilityDelegate(view: ImageView?, text: String) {
        try {
            val accessibilityDelegate: View.AccessibilityDelegate =
                object : View.AccessibilityDelegate() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfo
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        info.text = text + "\n" + AppUtils.getString(R.string.Link)
                        info.className = ""
                        val customClick = AccessibilityNodeInfo.AccessibilityAction(
                            AccessibilityNodeInfo.ACTION_CLICK,
                            AppUtils.getString(R.string.open_weblink)
                        )
                        info.addAction(customClick)
                    }
                }
            view?.accessibilityDelegate = accessibilityDelegate
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }


    /**
     * This method is used to set extras text accessibilityDelegate for TextView
     * @param view is View will be setup
     */
    private fun setExtraTextAccessibilityDelegate(
        view: TextView?,
        extraText: String,
        suffix: String? = null,
        isEnded: Boolean = true
    ) {
        try {
            val accessibilityDelegate: View.AccessibilityDelegate =
                object : View.AccessibilityDelegate() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfo
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        info.text = if (isEnded) {
                            view?.text.toString() + "\n" + extraText
                        } else {
                            extraText + "\n" + view?.text.toString()
                        }
                        suffix?.let {
                            val customClick = AccessibilityNodeInfo.AccessibilityAction(
                                AccessibilityNodeInfo.ACTION_CLICK, suffix
                            )
                            info.addAction(customClick)
                        }
                    }
                }
            view?.accessibilityDelegate = accessibilityDelegate
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    /**
     * This method is used to set talk back text for card
     * @param view is card will be setup
     */
    fun setCompletedCardTalkBack(view: View, talkBack: String) {
        view.contentDescription = talkBack + "\n" + AppUtils.getString(R.string.completeTask)
        setAccessibilityDelegate(view, "", null, true)
    }

    /**
     * This method is used to set talk back text for card
     * @param view is card will be setup
     */
    fun setInCompletedCardTalkBack(view: View, talkBack: String, isButton: Boolean) {
        view.contentDescription = talkBack +
            if (isButton) "\n" + AppUtils.getString(R.string.Button) else ""
        setAccessibilityDelegate(view, "", null, false)
    }

    /**
     * This method is used to get talk back string of View
     * @param view is card will be setup
     * @param prefix is prefix string of this card
     */
    fun getTalkBackOfView(view: View, prefix: String): String {
        var talkBackString = prefix
        if (view is ViewGroup) {
            for (index in 0 until view.childCount) {
                val nextChild = view.getChildAt(index)
                if (nextChild.visibility == View.VISIBLE) {
                    if (nextChild is ViewGroup) {
                        talkBackString = getTalkBackOfView(nextChild, talkBackString + "\n")
                    } else if (nextChild is TextView && nextChild.text.toString().isNotEmpty()) {
                        talkBackString += " ${nextChild.text}"
                    } else if (nextChild.contentDescription.isNullOrEmpty()
                            .not() && nextChild !is CheckBox
                    ) {
                        talkBackString += " ${nextChild.contentDescription}"
                    }
                }
            }
        }
        talkBackString = talkBackString
            .replace("/", AppUtils.getString(R.string.over))
        return talkBackString
    }

    fun setDimmedButtonTalkback(view: View, talkBack: String ,state: String){
        try {
            ViewCompat.setAccessibilityDelegate(view,
                object : AccessibilityDelegateCompat() {
                    override fun onInitializeAccessibilityNodeInfo(
                        v: View,
                        info: AccessibilityNodeInfoCompat
                    ) {
                        super.onInitializeAccessibilityNodeInfo(v, info)
                        info.roleDescription = talkBack + "\n" + state
                    }
                })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}