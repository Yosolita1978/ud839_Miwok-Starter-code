package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cristina on 3/8/18.
 */

public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Context context, ArrayList<Word> word) {
        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = (Word) getItem(position);

        TextView spanishTextView = (TextView) listItemView.findViewById(R.id.text_view_spanish);
        spanishTextView.setText(currentWord.getSpanishTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_view_default);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}