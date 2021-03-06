package com.halcyon.specjalista_it.bezpiecznyprzebieg;

/**
 * Created by Specjalista-IT on 2015-11-25.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.ButterKnife;

public class LunchFragment extends Fragment{

    public static String CLICK_SOURCE = "CLICK";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lunch_fragment, container, false);

        Button carButton = (Button) view.findViewById(R.id.car);
        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FirstListActivity.class);
                intent.putExtra(CLICK_SOURCE, getString(R.string.car));
                startActivity(intent);
            }
        });

        Button transportButton = (Button) view.findViewById(R.id.publicTransport);
        transportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FirstListActivity.class);
                intent.putExtra(CLICK_SOURCE, getString(R.string.public_transport));
                startActivity(intent);
            }
        });

        Button appInfoButton =  (Button) view.findViewById(R.id.info);
        appInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InfoActivity.class);
                intent.putExtra(CLICK_SOURCE, getString(R.string.car));
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        //ButterKnife.unbind(this);
        super.onDestroyView();
    }
}
