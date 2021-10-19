package com.catly.oledsaver.features.utils
import android.content.Intent
import android.os.Bundle
import android.app.Activity
import com.catly.oledsaver.features.floating_window.FloatingWindowService

// Wraps the service in an activity to be triggered by a shortcut
class FloatingWindowServiceToggleActivity: Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!FloatingWindowService.isRunning) {
            FloatingWindowService.startService(this)
        } else {
            FloatingWindowService.stopService(this)
        }
        finish()
    }
}

// Wraps the service in an activity to be triggered by a shortcut
class FloatingWindowServiceOnActivity: Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!FloatingWindowService.isRunning) {
            FloatingWindowService.startService(this)
        }
        finish()
    }
}
// Wraps the service in an activity to be triggered by a shortcut
class FloatingWindowServiceOffActivity: Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (FloatingWindowService.isRunning) {
            FloatingWindowService.stopService(this)
        }
        finish()
    }
}
