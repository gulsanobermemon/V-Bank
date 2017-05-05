package com.example.krsaool.myvocabularybank.activities;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.krsaool.myvocabularybank.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MyWordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_words);

        //BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

       /* bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if(tabId == R.id.tab_home) {
                    Intent intent = new Intent(MyWordsActivity.this, HomeActivity.class);
                    startActivity(intent);
                }else if(tabId == R.id.tab_myWords)
                {
                    Intent intent = new Intent(MyWordsActivity.this, MyWordsActivity.class);
                    startActivity(intent);
                }else if(tabId == R.id.tab_flashCards)
                {
                    Intent intent = new Intent(MyWordsActivity.this, FlashCardsActivity.class);
                    startActivity(intent);
                }


            }
        });
*/    }
}
