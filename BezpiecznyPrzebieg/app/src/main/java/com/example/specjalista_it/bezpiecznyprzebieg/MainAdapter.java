package com.example.specjalista_it.bezpiecznyprzebieg;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Specjalista-IT on 2015-11-24.
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    protected List<String> mData = new ArrayList<>();


    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {

    }

    public void onBindViewHolder(String holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
