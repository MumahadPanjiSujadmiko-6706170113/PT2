package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class LatihanFragment extends Fragment {


    public LatihanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_laporan,container,false);
        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("Latihan Tubuh Penuh",R.drawable.bokong));
        data.add(new Word("Latihan Otot Perut",R.drawable.tubuh));
        data.add(new Word("Latihan Bokong",R.drawable.lengan));
        data.add(new Word("Latihan Lengan",R.drawable.ototperut));
        data.add(new Word("Latihan Kaki",R.drawable.kaki));


        RecyclerView recyclerView = view.findViewById(R.id.wordlist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        WordAdapter wordAdapter = new WordAdapter(getContext(),data,R.color.category_numbers);
        recyclerView.setAdapter(wordAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return view;
    }

}
