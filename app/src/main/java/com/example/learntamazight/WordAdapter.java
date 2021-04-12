package com.example.learntamazight;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {


    public WordAdapter(@NonNull Context context, ArrayList<word> words) {
        super(context, 0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout,parent,false);

        }
        word currentWord = getItem(position);
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.txtFrancais);
        numberTextView.setText(currentWord.getmDefaultTranslation());

        TextView numberTamTextView = (TextView) listItemView.findViewById(R.id.txtTamazighe);
        numberTamTextView.setText(currentWord.getmTamazigheTranslation());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        icon.setImageResource(currentWord.getmImageResId());
        if(currentWord.hasImage()){
            icon.setImageResource(currentWord.getmImageResId());
        }else
        {
            icon.setVisibility(View.GONE);
        }


        return listItemView;


    }
}
