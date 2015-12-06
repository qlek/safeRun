package com.halcyon.specjalista_it.bezpiecznyprzebieg;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FirstListAdapter extends RecyclerView.Adapter<FirstListHolder>  {

    protected List<MainListElement> mData = new ArrayList<MainListElement>();
    protected Context context;

    public FirstListAdapter(List<MainListElement> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public FirstListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new FirstListHolder(layoutInflater.inflate(R.layout.item_text, viewGroup, false), context);
    }

    @Override
    public void onBindViewHolder(FirstListHolder firstListHolder, int i) {
        firstListHolder.setText(mData.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
