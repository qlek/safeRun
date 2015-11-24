package com.example.specjalista_it.bezpiecznyprzebieg;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    protected List<String> mData = new ArrayList<>();

    public MainAdapter(List<String> mData) {
        this.mData = mData;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new MainViewHolder(layoutInflater.inflate(R.layout.item_text, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(MainViewHolder mainViewHolder, int i) {
        mainViewHolder.setText(mData.get(i));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
