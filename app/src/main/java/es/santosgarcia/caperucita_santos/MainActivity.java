package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import es.santosgarcia.caperucita_santos.story.BookState;

/**
 *
 */
public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = "Main";

    MediaPlayer mediaPlayer;
    int time = 0;
    static final String STATE_TIME = "Estado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.musica);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(90, 90);
        mediaPlayer.start();
        time = mediaPlayer.getCurrentPosition();
        Log.v(LOG_TAG, "onCreate");


    }

    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            Log.v(LOG_TAG, "onDestroy");
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_TIME, time);
        super.onSaveInstanceState(savedInstanceState);
        Log.v(LOG_TAG, "onSaveInstanceState");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(LOG_TAG, "onRestoreInstanceState");
    }

    /**
     *
     */
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
        Log.v(LOG_TAG, "onResume");
    }

    protected void onPause() {
        super.onPause();
        // mediaPlayer.pause();
        Log.v(LOG_TAG, "onPause");
    }

    /**
     *
     * @param v
     */
    public void onClick(View v) {
        Intent intent = new Intent(this, BookPageActivity.class);
        intent.putExtra(BookPageFragment.SELECTED_PAGE, 0);
        startActivity(intent);
        Log.v(LOG_TAG, "onClick");
    }

    public void onClickContinue(View v) {
//        Intent intent = new Intent(this, PantallaFinal.class);
//        startActivity(intent);
        Intent intent = new Intent(this, BookPageActivity.class);
        try {
            intent.putExtra(BookPageFragment.SELECTED_PAGE, Integer.parseInt(BookState.readFromFile(this)));
        } catch (Exception e) {
            intent.putExtra(BookPageFragment.SELECTED_PAGE, 0);
        }
        startActivity(intent);
    }

    public void onClickSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void goFacebook(View view) {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(i);
        Log.v(LOG_TAG, "goFacebook");
    }

    public void ParaMusica() {


    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
