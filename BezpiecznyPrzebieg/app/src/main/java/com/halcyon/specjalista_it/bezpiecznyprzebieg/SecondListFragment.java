package com.halcyon.specjalista_it.bezpiecznyprzebieg;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondListFragment extends Fragment {

    @Bind(R.id.my_sec_recycler_view)
    protected RecyclerView secondRecycleView;

    protected String pramFromIntent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_list_fragment, container, false);
        ButterKnife.bind(this, view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        secondRecycleView.setLayoutManager(layoutManager);

        if (getActivity().getIntent()!= null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(FirstListHolder.PARAM_NAME);
        }
        List<MainListElement> data = setElements();
        SecondListAdapter secondListAdapter = new SecondListAdapter(data, getContext());
        secondRecycleView.setAdapter(secondListAdapter);

        if (pramFromIntent.compareTo(getString(R.string.periodic_checkups))==0)
        {
            TextView textView = (TextView) view.findViewById(R.id.second_label);
            textView.setText(pramFromIntent);
        }

        return view;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }


    public List<MainListElement> setElements()
    {
        List<MainListElement> data = new ArrayList<MainListElement>();
        if (pramFromIntent != null)
        {
            if (pramFromIntent.compareTo(getString(R.string.stering_wheel))==0)
            {
                data.add(new MainListElement(1,getString(R.string.stering_one)));
                data.add(new MainListElement(2,getString(R.string.stering_two)));
                data.add(new MainListElement(3,getString(R.string.stering_three)));
                data.add(new MainListElement(4,getString(R.string.stering_four)));
            }
            if (pramFromIntent.compareTo(getString(R.string.interia))==0)
            {
                data.add(new MainListElement(1,getString(R.string.cokpit_one)));
                data.add(new MainListElement(2,getString(R.string.cokpit_two)));
                data.add(new MainListElement(3,getString(R.string.cokpit_three)));
                data.add(new MainListElement(4,getString(R.string.cokpit_four)));
            }
            if (pramFromIntent.compareTo(getString(R.string.engine))==0)
            {
                data.add(new MainListElement(1,getString(R.string.engine_one)));
                data.add(new MainListElement(2,getString(R.string.engine_two)));
                data.add(new MainListElement(3,getString(R.string.engine_three)));
                data.add(new MainListElement(4,getString(R.string.engine_four)));
                data.add(new MainListElement(5,getString(R.string.engine_five)));
            }
            if (pramFromIntent.compareTo(getString(R.string.suspension))==0)
            {
                data.add(new MainListElement(1,getString(R.string.suspension_one)));
                data.add(new MainListElement(2,getString(R.string.suspension_two)));
                data.add(new MainListElement(3,getString(R.string.suspension_three)));
            }
            if (pramFromIntent.compareTo(getString(R.string.periodic_checkups))==0)
            {
                data.add(new MainListElement(1,getString(R.string.checkups_one)));
                data.add(new MainListElement(2,getString(R.string.checkups_two)));
                data.add(new MainListElement(3,getString(R.string.checkups_three)));
            }
            if (pramFromIntent.compareTo(getString(R.string.kzk_gop))==0)
            {
                data.add(new MainListElement(1,getString(R.string.kzk_gop_technical_issue)));
                data.add(new MainListElement(2,getString(R.string.kzk_gop_danger_public)));
                data.add(new MainListElement(3,getString(R.string.kzk_gop_medical_problem)));
            }
            if (pramFromIntent.compareTo(getString(R.string.autocar))==0)
            {
                data.add(new MainListElement(1,getString(R.string.autocar_technical_checkup)));
                data.add(new MainListElement(2,getString(R.string.autocar_drug_test)));
                data.add(new MainListElement(3,getString(R.string.autocar_license)));
            }

        }
        return  data;
    }
}
