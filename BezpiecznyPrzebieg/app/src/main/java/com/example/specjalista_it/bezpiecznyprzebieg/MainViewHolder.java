package com.example.specjalista_it.bezpiecznyprzebieg;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.text_item)
    protected TextView myItemText;

    public MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setText(String text){
        if(myItemText!= null) {
            myItemText.setText(text);
        }
        myItemText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "ALALALA", Toast.LENGTH_LONG).show();
            }
        });
    }

}
