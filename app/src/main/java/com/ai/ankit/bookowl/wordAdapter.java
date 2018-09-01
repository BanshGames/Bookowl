package com.ai.ankit.bookowl;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {


    public wordAdapter(Activity context, ArrayList<word> numbers){

        super(context,0,numbers);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent,false);
        }

        word currentWord=getItem(position);

        TextView miwoktextview = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwoktextview.setText(currentWord.getauthorname());

        TextView defaulttextview = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaulttextview.setText(currentWord.getbookname());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_view);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageresorceId());
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
