package com.example.specjalista_it.bezpiecznyprzebieg;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        View view = inflater.inflate(R.layout.details_fragment, container, false);
        ButterKnife.bind(this, view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        secondRecycleView.setLayoutManager(layoutManager);

        //here put data for new recycler view and logic to put strings in list
        if (getActivity().getIntent()!= null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(MainViewHolder.PARAM_NAME);

        }
        List<MainListElement> data = setElements();
        SecondAdapter secondAdapter = new SecondAdapter(data, getContext());
        secondRecycleView.setAdapter(secondAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }


    public List<MainListElement> setElements()
    {
        List<MainListElement> data = new ArrayList<>();
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
        }
        return  data;
    }
}
