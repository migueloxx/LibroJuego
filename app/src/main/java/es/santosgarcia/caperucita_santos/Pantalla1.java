package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Pantalla1 extends AppCompatActivity {

    private ImageView img;
    private TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
        img = (ImageView)findViewById(R.id.imgprincipal);
        txt = (TextView)findViewById(R.id.textoprincipal);
    }

    public void PulseButtonA(View view) {
        Intent intent = new Intent(this,Pantalla2.class);
        startActivity(intent);
    }

    public void PulseButtonB(View view){
        Intent intent = new Intent(this,Pantalla3.class);
        startActivity(intent);
        }
    }

