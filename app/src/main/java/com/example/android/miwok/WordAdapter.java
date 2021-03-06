package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sandro on 06.11.2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> wordList) {
        super(context, 0, wordList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        Word word = getItem(position);

        //First Textview in XML
        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok_txt);

        //Set word in xml textview
        miwok.setText(word.getMiwokTranslation());

        // second textview in xml
        TextView defaultTxt = (TextView) listItemView.findViewById(R.id.englisch_txt);

        //set default word in textview
        defaultTxt.setText(word.getDefaultTranslation());

        return listItemView;


    }
}
