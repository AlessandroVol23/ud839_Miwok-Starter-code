package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new com.example.android.miwok.Word("one", "lutti"));
        words.add(new com.example.android.miwok.Word("two", "otiiko"));
        words.add(new com.example.android.miwok.Word("three", "tolookosu"));
        words.add(new com.example.android.miwok.Word("four", "oyyisa"));
        words.add(new com.example.android.miwok.Word("five", "massokka"));
        words.add(new com.example.android.miwok.Word("six", "temmokka"));
        words.add(new com.example.android.miwok.Word("seven", "kenekaku"));
        words.add(new com.example.android.miwok.Word("eight", "kawinta"));
        words.add(new com.example.android.miwok.Word("nine", "wo'e"));
        words.add(new com.example.android.miwok.Word("ten", "na'aacha"));


        WordAdapter adapter = new WordAdapter(this,words);
        //hallo

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);

        //GridView grid = (GridView)findViewById(R.id.list);
        //grid.setAdapter(itemsAdapter);


    }
}
