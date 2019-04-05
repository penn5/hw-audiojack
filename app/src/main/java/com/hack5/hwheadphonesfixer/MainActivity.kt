package com.hack5.hwheadphonesfixer

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    var audioManager: AudioManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        BootReceiver().onReceive(this, Intent())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
    }
    fun click(v: View) {
        HeadsetUtils.headset(audioManager!!)
    }
    fun undo(v: View) {
        HeadsetUtils.speaker(audioManager!!)
    }
}
