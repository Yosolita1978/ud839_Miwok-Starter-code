package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> wordsOfColors = new ArrayList<Word>();

        wordsOfColors.add(new Word("red", "rojo", R.drawable.color_red));
        wordsOfColors.add(new Word("green", "verde", R.drawable.color_green));
        wordsOfColors.add(new Word("brown", "cafe", R.drawable.color_brown));
        wordsOfColors.add(new Word("grey", "gris", R.drawable.color_gray));
        wordsOfColors.add(new Word("black", "negro", R.drawable.color_black));
        wordsOfColors.add(new Word("white", "blanco", R.drawable.color_white));
        wordsOfColors.add(new Word("yellow", "amarillo", R.drawable.color_dusty_yellow));
        wordsOfColors.add(new Word("blue", "azul"));
        wordsOfColors.add(new Word("purple", "morado"));
        wordsOfColors.add(new Word("orange", "naranja"));


        WordAdapter adapter = new WordAdapter(this, wordsOfColors);

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
