package br.com.fiap.alarmapp.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import br.com.fiap.alarmapp.R;

/**
 * Created by guilherme on 28/11/16.
 */

public class AlarmReceiver extends BroadcastReceiver {
    private MediaPlayer mp = null;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.alarm);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
    }

}
