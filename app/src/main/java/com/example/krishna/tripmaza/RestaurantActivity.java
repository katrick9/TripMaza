package com.example.krishna.tripmaza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(" Mainland China "," 5 star Restaurant  \n Contact no: 7543045467 \n Address: 5th floor,Central mall ",R.drawable.restu1));
        words.add(new Word(" Yo China "," 3 star Restaurant \n Contact no: 8773297824 \n Address: Dak bangla chauraha ",R.drawable.restu2));
        words.add(new Word(" Angeethi "," 4 star Restaurant \n Contact no: 7543045467 \n Address: bailey road",R.drawable.restu3));
        words.add(new Word(" Raj Rasoi "," 5 star Restaurant \n Contact no: 8765984321 \n Address: South Gandhi Maidan ",R.drawable.restu4));
        words.add(new Word(" Pind Balluchi "," 5 star  Restaurant \n Contact no: 7543045467 \n Address: Biscomaun tower ",R.drawable.restu5));
        words.add(new Word(" The Biriyani Mall "," 5 star Restaurant \n Contact no: 9852642989 \n Address: Biscomaun tower ",R.drawable.restu1));
        words.add(new Word(" Pal Hotel "," 3 star Restaurant \n Contact no: 7543045467 \n Address: Station Road",R.drawable.restu3));
        words.add(new Word(" Sagar "," 2 star Restaurant \n Contact no: 9931332820 \n Address: Rajendar Nagar",R.drawable.restu4));

        WordAdapter adapter = new WordAdapter(this,words,R.color.textColor);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
