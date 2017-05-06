package com.example.krsaool.myvocabularybank.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.krsaool.myvocabularybank.R;
import com.wajahatkarim3.easyflipview.EasyFlipView;


public class FlashCardsActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_flash_cards);
        setContentLayout(R.layout.activity_flash_cards);

        final EasyFlipView easyFlipView = (EasyFlipView) findViewById(R.id.easyFlipView);
        easyFlipView.setFlipDuration(1000);
        easyFlipView.setFlipEnabled(true);


        }

    @Override
    protected void onResume() {
        super.onResume();
        setSelected(R.id.action_flashCards);




    }


}
