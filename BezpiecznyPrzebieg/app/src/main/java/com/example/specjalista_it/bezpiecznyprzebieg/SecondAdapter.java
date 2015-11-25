package com.example.specjalista_it.bezpiecznyprzebieg;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Specjalista-IT on 2015-11-25.
 */
public class SecondAdapter  extends RecyclerView.Adapter<SecondViewHolder>  {

    protected List<MainListElement> mData = new ArrayList<>();
    protected Context context;

    public SecondAdapter(List<MainListElement> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public SecondViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new SecondViewHolder(layoutInflater.inflate(R.layout.item_text, viewGroup, false), context);
    }

    @Override
    public void onBindViewHolder(SecondViewHolder mainViewHolder, int i) {
        mainViewHolder.setText(mData.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
