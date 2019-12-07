package fr.forum_thalie.tsumugi

import android.support.v4.media.session.PlaybackStateCompat
import fr.forum_thalie.tsumugi.alarm.RadioSleeper
import fr.forum_thalie.tsumugi.playerstore.PlayerStore
import java.util.*

class Tick  : TimerTask() {
    override fun run() {
        PlayerStore.instance.currentTime.postValue(PlayerStore.instance.currentTime.value!! + 500)
    }
}

