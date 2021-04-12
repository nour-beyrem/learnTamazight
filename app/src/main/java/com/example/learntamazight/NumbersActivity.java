package com.example.learntamazight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ListView _lsvNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // 1ére configuration
      /*  String[] words = new String[10];
        words[0] = "un";
        words[1] = "deux";
        words[2] = "trois";
        words[3] = "quatre";
        words[4] = "cinq";
        words[5] = "six";
        words[6] = "sept";
        words[7] = "huit";
        words[8] = "neuf";
        words[9] = "dix";
        Log.v("NumbersActivity", words[0]);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,words);
        _lsvNumbers = (ListView) findViewById(R.id.lsvNumbers);
        _lsvNumbers.setAdapter(itemAdapter);*/
        // 2éme configuration
       /* ArrayList<String> a_words = new ArrayList<String>();
        a_words.add("UN");
        a_words.add("DEUX");
        a_words.add("TROIS");
        a_words.add("QUATRE");
        a_words.add("CINQ");
        a_words.add("SIX");
        a_words.add("SEPT");
        a_words.add("HUIT");
        a_words.add("NEUF");
        a_words.add("DIX");

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,a_words);
        _lsvNumbers = (ListView) findViewById(R.id.lsvNumbers);
        _lsvNumbers.setAdapter(itemAdapter);*/
        //3éme configuration
        final ArrayList<Word> awords = new ArrayList<Word>();
        awords.add(new Word("un","yan",R.drawable.un));
        awords.add(new Word("deux","sin",R.drawable.deux));
        awords.add(new Word("trois","krad",R.drawable.trois));
        awords.add(new Word("quatre","kouz",R.drawable.quatre));
        awords.add(new Word("cinq","smmous",R.drawable.cinq));
        awords.add(new Word("six","sdis",R.drawable.six));
        awords.add(new Word("sept","sa",R.drawable.sept));
        awords.add(new Word("huit","tam",R.drawable.huit));
        awords.add(new Word("neuf","tza",R.drawable.neuf));
        awords.add(new Word("dix","mzaw",R.drawable.dix));
        WordAdapter itemAdapter = new WordAdapter(this,awords);
        _lsvNumbers = (ListView) findViewById(R.id.lsvNumbers);
        _lsvNumbers.setAdapter(itemAdapter);







    }
}