package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this,R.raw.musica);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(90, 90);
        mediaPlayer.start();

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

}
