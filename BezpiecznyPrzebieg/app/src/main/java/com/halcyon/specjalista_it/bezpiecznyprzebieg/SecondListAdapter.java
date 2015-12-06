package com.halcyon.specjalista_it.bezpiecznyprzebieg;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Specjalista-IT on 2015-11-25.
 */
public class SecondListAdapter extends RecyclerView.Adapter<SecondListHolder>  {

    protected List<MainListElement> mData = new ArrayList<MainListElement>();
    protected Context context;

    public SecondListAdapter(List<MainListElement> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public SecondListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new SecondListHolder(layoutInflater.inflate(R.layout.item_text, viewGroup, false), context);
    }

    @Override
    public void onBindViewHolder(SecondListHolder mainViewHolder, int i) {
        mainViewHolder.setText(mData.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
