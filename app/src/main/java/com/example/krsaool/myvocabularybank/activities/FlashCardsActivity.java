package com.example.krsaool.myvocabularybank.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


import com.raizlabs.android.dbflow.sql.language.Condition;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.wajahatkarim3.easyflipview.EasyFlipView;
import com.example.krsaool.myvocabularybank.R;


public class FlashCardsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_cards);
        /*final BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);*/

        final EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        easyFlipView.setFlipDuration(1000);
        easyFlipView.setFlipEnabled(true);

        /*bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Activity selectedActivity = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                Intent intent = new Intent(FlashCardsActivity.this, HomeActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.action_item2:
                                Intent i = new Intent(FlashCardsActivity.this, MyWordsActivity.class);
                                startActivity(i);
                                break;
                            case R.id.action_item3:
                                Intent iv = new Intent(FlashCardsActivity.this, FlashCardsActivity.class);
                                startActivity(iv);
                        }
                        *//*FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();*//*
                        return true;
                    }
                });*/


        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if(tabId == R.id.tab_home) {
                    Intent intent = new Intent(FlashCardsActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }else if(tabId == R.id.tab_myWords)
                {
                        Intent intent = new Intent(FlashCardsActivity.this, MyWordsActivity.class);
                        startActivity(intent);
                    finish();
                }else if(tabId == R.id.tab_flashCards)
                {
                    new FlashCardsActivity();
                    finish();
                }


            }
        });





    }


}
