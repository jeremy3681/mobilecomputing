package com.example.jeremyalbert.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextPage(View view)
    {
        TextView text= (TextView)findViewById(R.id.simpleText);
        text.setText("Good Bye World!");
    }
    public void lastPage(View view)
    {
        TextView text= (TextView)findViewById(R.id.simpleText);
        text.setText("Hello World!");
    }
}
