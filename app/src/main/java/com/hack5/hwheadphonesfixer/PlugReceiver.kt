package com.hack5.hwheadphonesfixer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.util.Log
import android.widget.Toast

class PlugReceiver : BroadcastReceiver() {
    private var audioManager: AudioManager? = null
    override fun onReceive(context: Context?, intent: Intent?) {
        if (audioManager == null) {
            audioManager = context!!.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        }
        val state = intent!!.getIntExtra("state", -1)
        /*when(state) {
            0 -> HeadsetUtils.speaker(audioManager!!)
            1 -> HeadsetUtils.headset(audioManager!!)
            else -> {
                Toast.makeText(
                    context!!,
                    "Bad stuff happened with the headset!!!",
                    Toast.LENGTH_LONG
                ).show()
                Log.e("PlugReceiver", "Unrecognised headset plug state!", Throwable())
            }
        }*/
        HeadsetUtils.headset(audioManager!!)
    }
}