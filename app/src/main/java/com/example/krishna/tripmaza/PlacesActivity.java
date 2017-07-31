package com.example.krishna.tripmaza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(" Hanuman Mandir "," Sacred & Religious ",R.drawable.place1));
        words.add(new Word(" Takht sri Patna "," Sacred & Religious ",R.drawable.place2));
        words.add(new Word(" nalanda "," Ancient Ruins ",R.drawable.place3));
        words.add(new Word(" Budha Smriti park "," Parks ",R.drawable.place4));
        words.add(new Word(" Sanjay Gandhi Biological park "," Parks ",R.drawable.place5));
        words.add(new Word(" Golghar "," Architectural Buildings ",R.drawable.place6));
        words.add(new Word(" Patna museum "," Speciality Museums ",R.drawable.place7));
        words.add(new Word(" Gandhi Maidan "," Points of Interest & Landmarks ",R.drawable.place8));

        WordAdapter adapter = new WordAdapter(this,words,R.color.textColor);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
