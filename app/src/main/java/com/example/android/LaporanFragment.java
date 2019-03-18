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

/**
 * A simple {@link Fragment} subclass.
 */
public class LaporanFragment extends Fragment {


    public LaporanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_laporan,container,false);
        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("әpә",R.drawable.family_father));
        data.add(new Word("әṭa",R.drawable.family_mother));
        data.add(new Word("angsi",R.drawable.family_son));
        data.add(new Word("tune",R.drawable.family_daughter));
        data.add(new Word("taachi",R.drawable.family_older_brother));
        data.add(new Word("chalitti",R.drawable.family_younger_brother));
        data.add(new Word("teṭe",R.drawable.family_older_sister));
        data.add(new Word("kolliti",R.drawable.family_younger_sister));
        data.add(new Word("ama",R.drawable.family_grandmother));
        data.add(new Word("paapa",R.drawable.family_grandfather));

        RecyclerView recyclerView = view.findViewById(R.id.wordlist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        WordAdapter wordAdapter = new WordAdapter(getContext(),data,R.color.category_family);
        recyclerView.setAdapter(wordAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return view;
    }

}
