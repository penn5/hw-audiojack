package com.hack5.hwheadphonesfixer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.widget.Toast

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (!done) {
            val filter = IntentFilter(Intent.ACTION_HEADSET_PLUG)
            val plugReceiver = PlugReceiver()
            context!!.registerReceiver(plugReceiver, filter)
            Toast.makeText(context, "Registered PlugReceiver", Toast.LENGTH_SHORT).show()
        }
    }
    companion object {
        var done = false
    }
}
