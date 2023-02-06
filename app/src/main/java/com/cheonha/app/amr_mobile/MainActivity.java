package com.cheonha.app.amr_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cheonha.app.amr_mobile.ui.main.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LoginFragment.newInstance())
                    .commitNow();
        }
    }
}