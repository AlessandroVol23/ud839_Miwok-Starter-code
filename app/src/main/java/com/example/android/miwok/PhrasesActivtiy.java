package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //Arraylist with Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        //creating the words with translation
        words.add(new com.example.android.miwok.Word("Where are you going?", "minto wuksus"));
        words.add(new com.example.android.miwok.Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new com.example.android.miwok.Word("My name is...", "oyaaset..."));
        words.add(new com.example.android.miwok.Word("How are you feeling?", "michәksәs?"));
        words.add(new com.example.android.miwok.Word("I’m feeling good.", "kuchi achit"));
        words.add(new com.example.android.miwok.Word("Are you coming?", "әәnәs'aa?"));
        words.add(new com.example.android.miwok.Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new com.example.android.miwok.Word("I’m coming.", "әәnәm"));
        words.add(new com.example.android.miwok.Word("Let’s go.", "yoowutis"));
        words.add(new com.example.android.miwok.Word("Come here.", "әnni'nem"));

        //creating a new WordAdapter Object with and give him context and word list
        WordAdapter adapter = new WordAdapter(this,words);
        //find the listview and set the adapter
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
