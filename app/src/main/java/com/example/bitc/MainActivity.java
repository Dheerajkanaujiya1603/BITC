package com.example.bitc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button buttoncel;
    Button buttonfar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttoncel = findViewById(R.id.buttoncel);
        buttonfar = findViewById(R.id.buttonfar);
        buttoncel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editTextText);
                String inputInString = editText.getText().toString();
                Double inputInDouble = Double.parseDouble(inputInString);
                Double outputInFahrenheit = (inputInDouble * 9 / 5) + 32;
                Toast.makeText(MainActivity.this, " Temp in" + inputInDouble + "celsius is" + outputInFahrenheit+ "in Fahrenheit", Toast.LENGTH_SHORT).show();
            }
        });

        buttonfar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editTextText2);
                String inputInString = editText.getText().toString();
                Double inputInDouble = Double.parseDouble(inputInString);
                Double outputInFahrenheit = (inputInDouble-32)*5/9;
                Toast.makeText(MainActivity.this, " Temp in" + inputInDouble + "Fahrenheit is" + outputInFahrenheit+ "in Celsius", Toast.LENGTH_SHORT).show();
            }
        });


    }
}


