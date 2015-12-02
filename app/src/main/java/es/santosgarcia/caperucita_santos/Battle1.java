package es.santosgarcia.caperucita_santos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Battle1 extends AppCompatActivity {


    private TextView result;
    private Button mibtn;
    private Button mibtn2;
    int elecfnl=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle1);
        result = (TextView)findViewById(R.id.resultbattle);
        mibtn = (Button) findViewById(R.id.buttonrollingdice);
        mibtn2 = (Button) findViewById(R.id.buttoncont);
    }

    public void rollingdice(View view){

        Random rand = new Random();
        int n = rand.nextInt(10);
        String num = Integer.toString(n);
        result.setText("Has sacado un: " + num);

        mibtn.setVisibility(View.GONE);
        mibtn2.setVisibility(View.VISIBLE);

        ContBattle(view, n);

    }
    public void ContBattle(View view, int i){
       if (i>5){
           // abrir final bueno
       }
        else{
           // abrir final malo
       }
    }
}
