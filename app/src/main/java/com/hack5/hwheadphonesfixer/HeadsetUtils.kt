package com.hack5.hwheadphonesfixer

import android.media.AudioManager

object HeadsetUtils {
    fun speaker(audioManager: AudioManager) {
        audioManager.mode = AudioManager.MODE_NORMAL
        audioManager.isSpeakerphoneOn = true
        audioManager.mode = AudioManager.MODE_IN_COMMUNICATION
        audioManager.isSpeakerphoneOn = true
        //audioManager.isWiredHeadsetOn = false
        audioManager.mode = AudioManager.MODE_NORMAL
    }

    fun headset(audioManager: AudioManager) {
        audioManager.mode = AudioManager.MODE_NORMAL
        audioManager.isSpeakerphoneOn = false
        audioManager.mode = AudioManager.MODE_IN_COMMUNICATION
        audioManager.isSpeakerphoneOn = false
        //audioManager.isWiredHeadsetOn = false
        audioManager.mode = AudioManager.MODE_NORMAL
    }

}
