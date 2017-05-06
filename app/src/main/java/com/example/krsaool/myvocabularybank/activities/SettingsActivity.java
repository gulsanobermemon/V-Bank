package com.example.krsaool.myvocabularybank.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.krsaool.myvocabularybank.R;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_settings);
        setContentLayout(R.layout.activity_settings);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setSelected(R.id.action_settings);
    }
}
