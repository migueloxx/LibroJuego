package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import es.santosgarcia.caperucita_santos.story.BookPage;
import es.santosgarcia.caperucita_santos.story.BookState;
import es.santosgarcia.caperucita_santos.story.StaticBook;

public class Battle1 extends AppCompatActivity {

    private final String LOG_TAG = "Battle";

    private int selectedPage;
    private int resultNumber;
    private TextView result;
    private Button mibtn;
    private Button mibtn2;
    int elecfnl=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle1);
        selectedPage = getIntent().getIntExtra(BookPageFragment.SELECTED_PAGE, 0);
        result = (TextView)findViewById(R.id.resultbattle);
        mibtn = (Button) findViewById(R.id.buttonrollingdice);
        mibtn2 = (Button) findViewById(R.id.buttoncont);
        Log.v(LOG_TAG, "onCreate");
    }

    public void rollingdice(View view){

        Random rand = new Random();
        int n = rand.nextInt(10);
        String num = Integer.toString(n);
        result.setText("Has sacado un: " + num);

        mibtn.setVisibility(View.GONE);
        mibtn2.setVisibility(View.VISIBLE);

        resultNumber = n;
        Log.v(LOG_TAG, "rolling");
    }
    public void ContBattle(View view){
        BookPage currentPage = StaticBook.getStaticBook().get(selectedPage);
       if (resultNumber>5){
           //Intent intent = new Intent(this,PantallaFinal.class);
           //startActivity(intent);
           selectedPage = currentPage.getOptionBNext();
       }
        else{
           //Intent intent = new Intent(this,PantallaFinal2.class);
           //startActivity(intent);
           selectedPage = currentPage.getOptionANext();
       }
        setBookPageContent();
    }

    private void setBookPageContent() {
        BookState.writeToFile(this, "" + selectedPage);
        BookPage currentPage = StaticBook.getStaticBook().get(selectedPage);

        finish();
        if (currentPage.getVideoId() > 0) {
            Intent intent = new Intent(this, PantallaFinal2.class);
            intent.putExtra(PantallaFinal2.VIDEO_ID, currentPage.getVideoId());
            startActivity(intent);
        } else if (currentPage.getTitleId() > 0){
            Intent intent = new Intent(this, BookPageActivity.class);
            intent.putExtra(BookPageFragment.SELECTED_PAGE, selectedPage);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, Battle1.class);
            intent.putExtra(BookPageFragment.SELECTED_PAGE, selectedPage);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        // your code.
    }
}
