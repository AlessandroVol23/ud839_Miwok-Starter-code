package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Arraylist with Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        //creating the words with translation
        words.add(new com.example.android.miwok.Word("red", "weṭeṭṭi"));
        words.add(new com.example.android.miwok.Word("green", "chokokki"));
        words.add(new com.example.android.miwok.Word("brown", "ṭakaakki"));
        words.add(new com.example.android.miwok.Word("gray", "ṭopoppi"));
        words.add(new com.example.android.miwok.Word("black", "kululli"));
        words.add(new com.example.android.miwok.Word("white", "kelelli"));
        words.add(new com.example.android.miwok.Word("dusty yellow", "ṭopiisә"));
        words.add(new com.example.android.miwok.Word("mustard yellow", "chiwiiṭә"));

        //creating a new WordAdapter Object with and give him context and word list
        WordAdapter adapter = new WordAdapter(this,words);
        //find the listview and set the adapter
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
