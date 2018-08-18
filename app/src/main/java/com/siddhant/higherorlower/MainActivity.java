package com.siddhant.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int max = 20;
        int min =0;
        Random random = new Random();
        randomNumber = random.nextInt(max-min+1)+min;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void predict(View view) {
        EditText numberPad = findViewById(R.id.editText);
        int number = Integer.parseInt(numberPad.getText().toString());

        if (randomNumber== number){
            Toast.makeText(MainActivity.this,"Brilliant,you got it!",Toast.LENGTH_SHORT).show();
            }
            else if (randomNumber > number){
            Toast.makeText(MainActivity.this,"Higher",Toast.LENGTH_SHORT).show();
        }
            else
            Toast.makeText(MainActivity.this,"Lower",Toast.LENGTH_SHORT).show();
    }

   public void regenerateRandomNumber(View view) {
       int max = 20;
       int min =0;
       Random random = new Random();
       randomNumber = random.nextInt(max-min+1)+min;

    }
}
