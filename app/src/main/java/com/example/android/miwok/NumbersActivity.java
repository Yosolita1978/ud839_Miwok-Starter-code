package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> wordsOfNumbers = new ArrayList<Word>();

        wordsOfNumbers.add(new Word("one", "uno"));
        wordsOfNumbers.add(new Word("two", "dos"));
        wordsOfNumbers.add(new Word("three", "tres"));
        wordsOfNumbers.add(new Word("four", "cuatro"));
        wordsOfNumbers.add(new Word("five", "cinco"));
        wordsOfNumbers.add(new Word("six", "seis"));
        wordsOfNumbers.add(new Word("seven", "siete"));
        wordsOfNumbers.add(new Word("eight", "ocho"));
        wordsOfNumbers.add(new Word("nine", "nueve"));
        wordsOfNumbers.add(new Word("ten", "diez"));


        WordAdapter adapter = new WordAdapter(this, wordsOfNumbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);




    }

    }

