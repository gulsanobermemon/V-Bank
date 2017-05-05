package com.example.krsaool.myvocabularybank.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.krsaool.myvocabularybank.R;
import com.raizlabs.android.dbflow.sql.language.Condition;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.onSaveInstanceState();



        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if(tabId == R.id.tab_home) {
                    new HomeActivity();
                }else if(tabId == R.id.tab_myWords)
                {
                    Intent intent = new Intent(HomeActivity.this, MyWordsActivity.class);
                    startActivity(intent);
                    finish();
                }else if(tabId == R.id.tab_flashCards)
                {
                    Intent intent = new Intent(HomeActivity.this, FlashCardsActivity.class);
                    startActivity(intent);
                    finish();
                }


            }
        });



        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                if(tabId == R.id.tab_home) {
                    new HomeActivity();
                    finish();
                }else if(tabId == R.id.tab_myWords)
                {
                    Intent intent = new Intent(HomeActivity.this, MyWordsActivity.class);
                    startActivity(intent);
                    finish();
                }else if(tabId == R.id.tab_flashCards)
                {
                    Intent intent = new Intent(HomeActivity.this, FlashCardsActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}
