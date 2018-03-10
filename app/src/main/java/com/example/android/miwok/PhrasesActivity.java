package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> wordsOfPhrases = new ArrayList<Word>();

        wordsOfPhrases.add(new Word("Where are you going?", "A dónde vas?"));
        wordsOfPhrases.add(new Word("What is your name?", "Cuál es tu nombre?"));
        wordsOfPhrases.add(new Word("My name is...", "Mi nombre es..."));
        wordsOfPhrases.add(new Word("How are you feeling?", "Cómo te sientes?"));
        wordsOfPhrases.add(new Word("Are you hungry", "Tienes hambre?"));
        wordsOfPhrases.add(new Word("Are you coming?", "Vienes?"));
        wordsOfPhrases.add(new Word("Let’s go!", "Vamos!"));
        wordsOfPhrases.add(new Word("What time it is?", "Qué hora es?"));
        wordsOfPhrases.add(new Word("Where is the restroom?", "Dónde está el baño?"));
        wordsOfPhrases.add(new Word("Come here", "Ven aquí"));


        WordAdapter adapter = new WordAdapter(this, wordsOfPhrases);

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
