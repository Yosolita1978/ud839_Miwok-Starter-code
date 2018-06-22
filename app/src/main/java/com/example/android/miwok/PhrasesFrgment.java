package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFrgment extends Fragment {


    public PhrasesFrgment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_phrases, container, false);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "A dónde vas?", R.drawable.buble_phrase));
        words.add(new Word("What is your name?", "Cuál es tu nombre?", R.drawable.buble_phrase));
        words.add(new Word("My name is...", "Mi nombre es...", R.drawable.buble_phrase));
        words.add(new Word("How are you feeling?", "Cómo te sientes?", R.drawable.buble_phrase));
        words.add(new Word("Are you hungry", "Tienes hambre?", R.drawable.buble_phrase));
        words.add(new Word("Are you coming?", "Vienes?", R.drawable.buble_phrase));
        words.add(new Word("Let’s go!", "Vamos!", R.drawable.buble_phrase));
        words.add(new Word("What time it is?", "Qué hora es?", R.drawable.buble_phrase));
        words.add(new Word("Where is the restroom?", "Dónde está el baño?", R.drawable.buble_phrase));
        words.add(new Word("Come here", "Ven aquí", R.drawable.buble_phrase));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        return rootView;
    }

}
