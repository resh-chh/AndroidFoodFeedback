package com.xyz.foodfeedback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgFood;
    RatingBar rabFood;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgFood = (RadioGroup) findViewById(R.id.rgFood);
        rabFood = (RatingBar) findViewById(R.id.rabFood);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int s1 = rgFood.getCheckedRadioButtonId();
                RadioButton r1 = (RadioButton) findViewById(s1);
                String m1 = r1.getText().toString();

                String m2 = String.valueOf(rabFood.getRating());
                Toast.makeText(getApplicationContext(), m1 + " is so yummy that it gets " + m2 + " stars", Toast.LENGTH_LONG).show();

            }
        });

    }
}
