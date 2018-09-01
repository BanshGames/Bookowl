package com.ai.ankit.bookowl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
    }



    public void addabook(View view)
    {
        Intent intent = new Intent(this,Addbooks.class);
        startActivity(intent);
    }
}
