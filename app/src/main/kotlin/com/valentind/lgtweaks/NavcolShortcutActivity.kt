package com.valentind.lgtweaks

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class NavcolShortcutActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent("com.lge.systemui.navigationbar.HOME_TOUCH_BUTTON_SETTING_MAIN"))
    }
}
