package com.example.krsaool.myvocabularybank.controllers;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.krsaool.myvocabularybank.R;
import com.example.krsaool.myvocabularybank.database.tables.WordItemTable;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WordsListRecyclerAdapter extends RecyclerView.Adapter<WordsListRecyclerAdapter.WordViewHolder> implements FastScrollRecyclerView.SectionedAdapter {

    public List<WordItemTable> wordsList = new ArrayList<>();
    public List<WordItemTable> backupWordsList = new ArrayList<>();
    public Context context;


    public WordsListRecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public WordsListRecyclerAdapter.WordViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.word_item_layout, viewGroup, false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WordsListRecyclerAdapter.WordViewHolder holder, int position) {

        holder.render(wordsList.get(position));

    }

    @Override
    public int getItemCount() {
        return wordsList.size();
    }

    @NonNull
    @Override
    public String getSectionName(int position) {
        return wordsList.get(position).name.substring(0,1);
    }

    public class WordViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txtWord_worditem)
        TextView txtWord;
        @BindView(R.id.txtMeaning_worditem) TextView txtMeaning;
        @BindView(R.id.txtType_worditem) TextView txtType;

        public WordViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void render(WordItemTable word)
        {
            txtWord.setText(word.name);
            txtMeaning.setText(word.wordMeaning);
            txtType.setText(word.wordType);
        }

        public void filter(String chartext)
        {
            chartext = chartext.toLowerCase(Locale.getDefault());
            if (chartext.length() == 0)
            {
                // Show original list
                wordsList.clear();
                wordsList.addAll(backupWordsList);
                notifyDataSetChanged();
            }
            else {
                // Fitler results
                wordsList.clear();
                for (WordItemTable word : backupWordsList)
                {
                    if (word.name.toLowerCase(Locale.getDefault()).contains(chartext))
                    {
                        wordsList.add(word);
                    }
                }
                notifyDataSetChanged();
            }
        }
    }
}
