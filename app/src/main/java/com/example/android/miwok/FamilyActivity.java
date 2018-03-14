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

        wordsOfFamily.add(new Word("father", "padre", R.drawable.family_father));
        wordsOfFamily.add(new Word("mother", "madre", R.drawable.family_mother));
        wordsOfFamily.add(new Word("son", "hijo", R.drawable.family_son));
        wordsOfFamily.add(new Word("daughter", "hija", R.drawable.family_daughter));
        wordsOfFamily.add(new Word("grandmother", "abuela", R.drawable.family_grandmother));
        wordsOfFamily.add(new Word("grandfather", "abuelo", R.drawable.family_grandfather));
        wordsOfFamily.add(new Word("brother", "hermano", R.drawable.family_younger_brother));
        wordsOfFamily.add(new Word("sister", "hermana", R.drawable.family_younger_sister));
        wordsOfFamily.add(new Word("uncle", "tio", R.drawable.family_older_brother));
        wordsOfFamily.add(new Word("aunt", "tia", R.drawable.family_older_sister));


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
