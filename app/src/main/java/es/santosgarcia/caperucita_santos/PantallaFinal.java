package es.santosgarcia.caperucita_santos;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class PantallaFinal extends AppCompatActivity {

    private VideoView mVideoView;

    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_final);
        mVideoView =(VideoView)findViewById(R.id.videoView);
        Uri path = Uri.parse("android.resource://es.santosgarcia.caperucita_santos/"+ R.raw.video);
        mVideoView.setVideoURI(path);
        mVideoView.start();
        //mVideoView.requestFocus();
    }

}

//http://www.imaginaformacion.com/tutoriales/reproduccion-de-video-desde-raw-en-android/
