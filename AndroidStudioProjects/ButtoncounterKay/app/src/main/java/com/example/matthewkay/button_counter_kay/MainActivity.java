package com.example.matthewkay.button_counter_kay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counterValue = 0;
    private TextView CountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountText = (TextView)findViewById(R.id.CountText);
    }


    public void minusButtonClick(View view) {
        counterValue--;
        CountText.setText(String.valueOf(counterValue));
    }

    public void resetButtonClick(View view) {
        counterValue = 0;
        CountText.setText(String.valueOf(counterValue));
    }

    public void plusButtonClick(View view) {
        counterValue++;
        CountText.setText(String.valueOf(counterValue));
    }
}
