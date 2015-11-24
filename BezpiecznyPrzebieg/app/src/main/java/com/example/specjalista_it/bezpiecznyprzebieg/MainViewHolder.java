package com.example.specjalista_it.bezpiecznyprzebieg;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainViewHolder extends RecyclerView.ViewHolder {

    public static String PARAM_NAME = "FIRST_LIST_PARAM";
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
                if (v.getContext() != null) {
                    Intent intent = new Intent(v.getContext(), SecondListActivity.class);
                    //add prams to intent - what was cliced
                    intent.putExtra(PARAM_NAME, myItemText.getText());
                   // v.getContext().getApplicationContext().startActivity(intent);
                }
                Toast.makeText(v.getContext(), myItemText.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
