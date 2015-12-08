package es.santosgarcia.caperucita_santos;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class PantallaFinal2 extends AppCompatActivity {
    public static final String VIDEO_ID = "video_id";

    private VideoView mVideoView;

    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pantalla_final2);
        mVideoView =(VideoView)findViewById(R.id.videoView);
        Uri path = Uri.parse("android.resource://es.santosgarcia.caperucita_santos/"+ getIntent().getIntExtra(VIDEO_ID, 0));
        mVideoView.setVideoURI(path);
        mVideoView.start();
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}

//http://www.imaginaformacion.com/tutoriales/reproduccion-de-video-desde-raw-en-android/
