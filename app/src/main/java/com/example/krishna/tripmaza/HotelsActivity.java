package com.example.krishna.tripmaza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.string.no;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(" Hotel Maurya -- Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: boring road ",R.drawable.mayurya));
        words.add(new Word(" Hotel The Panache -- Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: bally road ",R.drawable.hotel2));
        words.add(new Word(" Hotel Chanakya--Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: boring road ",R.drawable.hotel3));
        words.add(new Word(" Hotel Patliputra--Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: bally road ",R.drawable.hotel4));
        words.add(new Word(" Hotel Recedency -- Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: Gandhi medan ",R.drawable.mayurya));
        words.add(new Word(" Hotel Fort -- Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: boring road ",R.drawable.hotel2));
        words.add(new Word(" Hotel Windsor -- Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: Gandhi medan",R.drawable.hotel3));
        words.add(new Word(" Hotel Republic -- Rs:7079/day "," 5 star hotel \n Contact no: 7543045467 \n Address: boring road ",R.drawable.hotel4));

        WordAdapter adapter = new WordAdapter(this,words,R.color.textColor);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
