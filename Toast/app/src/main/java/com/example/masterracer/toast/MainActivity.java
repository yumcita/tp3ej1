package com.example.masterracer.toast;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(),"Ventana con mensaje escrito.", Toast.LENGTH_SHORT);
        toast1.show();
    }
}