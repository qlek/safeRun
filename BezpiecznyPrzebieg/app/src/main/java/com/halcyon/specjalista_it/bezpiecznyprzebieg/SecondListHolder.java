package com.halcyon.specjalista_it.bezpiecznyprzebieg;

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
public class SecondListHolder extends RecyclerView.ViewHolder {

    public static String PARAM_NAME = "SECOND_LIST_PARAM";
    @Bind(R.id.text_item)
    protected TextView myItemText;
    protected Context con;

    public SecondListHolder(View itemView, Context context) {
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
                    if (myItemText.getText().toString().compareTo(con.getString(R.string.checkups_one) )==0 ||
                            myItemText.getText().toString().compareTo(con.getString(R.string.checkups_two) )==0 ||
                            myItemText.getText().toString().compareTo(con.getString(R.string.checkups_three) )==0 ) {
                        Intent intent = new Intent(con.getApplicationContext(), ThirdListActivity.class);
                        intent.putExtra(PARAM_NAME, myItemText.getText());
                        con.startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(con.getApplicationContext(), DetailInfoActivity.class);
                        intent.putExtra(PARAM_NAME, myItemText.getText());
                        con.startActivity(intent);
                    }
                }
                //Toast.makeText(v.getContext(), myItemText.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
