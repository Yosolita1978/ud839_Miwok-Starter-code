package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> wordsOfNumbers = new ArrayList<>(Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"));

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(int index = 0; index < wordsOfNumbers.size(); index++){
            TextView wordView = new TextView(this);
            wordView.setText(wordsOfNumbers.get(index));
            rootView.addView(wordView);

        }


    }

    }

