package com.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MinusButton_Click(View view) {
        TextView CountTextView = (TextView) findViewById(R.id.CountText);
        if (Integer.parseInt(CountTextView.getText().toString()) > 1)
            CountTextView.setText(String.valueOf(Integer.parseInt(CountTextView.getText().toString()) - 1));
    }

    public void PlusButton_Click(View view) {
        TextView CountTextView = (TextView) findViewById(R.id.CountText);
        if (Integer.parseInt(CountTextView.getText().toString()) < 5)
            CountTextView.setText(String.valueOf(Integer.parseInt(CountTextView.getText().toString()) + 1));
    }

}
