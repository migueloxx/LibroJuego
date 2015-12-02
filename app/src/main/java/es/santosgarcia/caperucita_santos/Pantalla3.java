package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pantalla3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
    }
    public void batalla(View view){
        Intent intent = new Intent(this,Battle1.class);
        startActivity(intent);
    }
}
