package com.example.specjalista_it.bezpiecznyprzebieg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.ButterKnife;

/**
 * Created by Specjalista-IT on 2015-11-26.
 */
public class DetailInfoFragment  extends Fragment{

    private String pramFromIntent;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_list_fragment, container, false);

        if (getActivity().getIntent()!= null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(FirstListHolder.PARAM_NAME);

        }
        if (pramFromIntent != null) {
            TextView textView = (TextView) view.findViewById(R.id.detailsLabel);
            textView.setText(pramFromIntent);
        }
        TextView textView = (TextView) view.findViewById(R.id.detailsString);
        textView.setText(setInfoString());
        return view;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }

    private String setInfoString()
    {
        String infostring = "test";
        //put much logic here
        return infostring;
    }

}
