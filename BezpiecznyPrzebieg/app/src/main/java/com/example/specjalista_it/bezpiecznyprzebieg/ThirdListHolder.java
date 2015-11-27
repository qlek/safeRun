package com.example.specjalista_it.bezpiecznyprzebieg;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Specjalista-IT on 2015-11-25.
 */
public class ThirdListHolder extends RecyclerView.ViewHolder {

    public static String PARAM_NAME = "THIRD_LIST_PARAM";
    @Bind(R.id.text_item)
    protected TextView myItemText;
    protected Context con;

    public ThirdListHolder(View itemView, Context context) {
        super(itemView);
        con = context;
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
                    //TODO: change activites that it will start - single text and third list activieties
                    Intent intent = new Intent(con.getApplicationContext(), DetailInfoActivity.class);
                    intent.putExtra(PARAM_NAME, myItemText.getText());

                    con.startActivity(intent);
                }
                //Toast.makeText(v.getContext(), myItemText.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
