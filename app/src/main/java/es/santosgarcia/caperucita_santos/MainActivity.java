package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int time = 0 ;
    static final String STATE_TIME = "Estado";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.musica);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(90, 90);
        mediaPlayer.start();
        time = mediaPlayer.getCurrentPosition();
    }
    protected void onDestroy(){
        super.onDestroy();
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_TIME, time  );
        super.onSaveInstanceState(savedInstanceState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
    protected void onResume() {
        super.onResume();
    }

    protected void onPause(){
        super.onPause();
       /// mediaPlayer.pause();
    }


    public void onClick(View v){
        Intent intent = new Intent(this,Pantalla1.class);
        startActivity(intent);
    }
    public void onClickContinue(View v){
        Intent intent = new Intent(this,PantallaFinal.class);
        startActivity(intent);
    }

    public void onClickSettings(View v){
        Intent intent = new Intent(this,Settings.class);
        startActivity(intent);
    }

    public void goFacebook (View view){
        Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(i);
    }

}
