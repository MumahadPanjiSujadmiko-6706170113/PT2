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
public class ResetFragment extends Fragment {


    public ResetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_laporan,container,false);
        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("minto wuksus"));
        data.add(new Word("tinnә oyaase'nә"));
        data.add(new Word("oyaaset..."));
        data.add(new Word("michәksәs?"));
        data.add(new Word("kuchi achit"));
        data.add(new Word("әәnәs'aa?"));
        data.add(new Word("hәә’ әәnәm"));
        data.add(new Word("әәnәm"));
        data.add(new Word("yoowutis"));
        data.add(new Word("әnni'nem"));

        RecyclerView recyclerView = view.findViewById(R.id.wordlist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        WordAdapter wordAdapter = new WordAdapter(getContext(),data,R.color.category_phrases);
        recyclerView.setAdapter(wordAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return view;
    }

}
