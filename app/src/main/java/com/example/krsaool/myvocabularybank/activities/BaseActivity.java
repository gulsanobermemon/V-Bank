package com.example.krsaool.myvocabularybank.activities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.krsaool.myvocabularybank.R;

public class BaseActivity extends AppCompatActivity {



        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int prevNav = getSelectedNav();
                int currentNav = item.getItemId();
                if (currentNav == prevNav)
                    return false;
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent ii = new Intent(BaseActivity.this, HomeActivity.class);
                        startActivity(ii);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.action_myWords:
                        if (prevNav != R.id.action_home)
                            finish();
                        Intent ii2 = new Intent(BaseActivity.this, MyWordsActivity.class);
                        startActivity(ii2);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.action_flashCards:
                        if (prevNav != R.id.action_home)
                            finish();
                        Intent ii3 = new Intent(BaseActivity.this, FlashCardsActivity.class);
                        startActivity(ii3);
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.action_settings:
                        if (prevNav != R.id.action_home)
                            finish();
                        Intent ii4 = new Intent(BaseActivity.this, SettingsActivity.class);
                        startActivity(ii4);
                        overridePendingTransition(0, 0);
                        return true;
                }

                return false;
            }
        };

        BottomNavigationView navigationView;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemListener);


    }

    public View setContentLayout(int layoutID)

    {
        FrameLayout contentLayout = (FrameLayout) findViewById(R.id.content_layout);
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return inflater.inflate(layoutID, contentLayout, true);
    }

    public void setSelected(int optionID)
    {
        navigationView.getMenu().findItem(optionID).setChecked(true);
        getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("selectedNav",optionID).commit();
    }

    public int getSelectedNav()
    {
        return getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("selectedNav", R.id.action_home);
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
