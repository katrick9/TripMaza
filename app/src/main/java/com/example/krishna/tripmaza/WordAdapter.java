package com.example.krishna.tripmaza;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by krishna on 6/8/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);
        TextView categoryName =(TextView) listItemView.findViewById(R.id.hotelName);
        categoryName.setText(currentWord.getmCategoryName());

        TextView textPart = (TextView) listItemView.findViewById(R.id.hotelText);
        textPart.setText(currentWord.getmTextPart());

        ImageView imageView =(ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getmImageResourceId());
        imageView.setVisibility(View.VISIBLE);
        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
