package com.example.krsaool.myvocabularybank.database.tables;


import com.example.krsaool.myvocabularybank.database.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.io.Serializable;
import java.util.List;

@Table(database = AppDatabase.class)
public class WordItemTable extends BaseModel implements Serializable {

    @Column
    @PrimaryKey
    public int wordNum;
    @Column @Unique
    @SerializedName("name") @Expose public String name;
    @Column(defaultValue = "") public String wordMeaning;
    @Column public String wordType;
    @Column public String example;
    @Column public boolean mastered;

    @SerializedName("types") @Expose public List<String> typesList;
    @SerializedName("pronunciation") @Expose public String pronunciation;
    @SerializedName("related") @Expose public List<String> relatedList;
    @SerializedName("examples") @Expose public List<String> examplesList;
    @SerializedName("synonyms") @Expose public List<String> synonymsList;
    @SerializedName("sentences") @Expose public List<String> sentencesList;
    @SerializedName("bonus") @Expose public String bonus;
    @SerializedName("pronunciationMp3") @Expose public String pronunciationMp3;
    @SerializedName("antonyms") @Expose public List<String> antonymsList;
    @SerializedName("appTypes") @Expose public List<String> appTypesList;
    @SerializedName("meanings") @Expose public List<String> meaningsList;
}