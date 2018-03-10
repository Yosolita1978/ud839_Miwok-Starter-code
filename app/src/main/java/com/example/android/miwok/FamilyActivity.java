package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> wordsOfFamily = new ArrayList<Word>();

        wordsOfFamily.add(new Word("father", "padre"));
        wordsOfFamily.add(new Word("mother", "madre"));
        wordsOfFamily.add(new Word("son", "hijo"));
        wordsOfFamily.add(new Word("daughter", "hija"));
        wordsOfFamily.add(new Word("grandmother", "abuela"));
        wordsOfFamily.add(new Word("grandfather", "abuelo"));
        wordsOfFamily.add(new Word("brother", "hermano"));
        wordsOfFamily.add(new Word("sister", "hermana"));
        wordsOfFamily.add(new Word("uncle", "tio"));
        wordsOfFamily.add(new Word("aunt", "tia"));


        WordAdapter adapter = new WordAdapter(this, wordsOfFamily);

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
