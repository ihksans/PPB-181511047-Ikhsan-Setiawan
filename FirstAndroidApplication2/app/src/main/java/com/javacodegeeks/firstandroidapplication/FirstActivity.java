package com.javacodegeeks.firstandroidapplication;
import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class FirstActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
}
