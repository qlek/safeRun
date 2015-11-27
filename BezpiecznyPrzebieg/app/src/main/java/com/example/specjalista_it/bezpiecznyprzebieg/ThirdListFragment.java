package com.example.specjalista_it.bezpiecznyprzebieg;

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
 * Created by Specjalista-IT on 2015-11-25.
 */
public class ThirdListFragment extends Fragment {

    @Bind(R.id.my_thr_recycler_view)
    protected RecyclerView thirdRecycleView;

    protected String pramFromIntent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_list_fragment, container, false);
        ButterKnife.bind(this, view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        thirdRecycleView.setLayoutManager(layoutManager);

        //here put data for new recycler view and logic to put strings in list
        if (getActivity().getIntent()!= null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(SecondListHolder.PARAM_NAME);

        }
        List<MainListElement> data = setElements();
        ThirdListAdapter thirddListAdapter = new ThirdListAdapter(data, getContext());
        thirdRecycleView.setAdapter(thirddListAdapter);
        TextView textView = (TextView) view.findViewById(R.id.third_label);
        textView.setText(pramFromIntent);
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
            if (pramFromIntent.compareTo(getString(R.string.checkups_one))==0)
            {
                data.add(new MainListElement(1,getString(R.string.checkups_road_one)));
                data.add(new MainListElement(2,getString(R.string.checkups_road_two)));
                data.add(new MainListElement(3,getString(R.string.checkups_road_three)));
            }
            if (pramFromIntent.compareTo(getString(R.string.checkups_two))==0)
            {
                data.add(new MainListElement(1,getString(R.string.checkups_monthly_one)));
                data.add(new MainListElement(2,getString(R.string.checkups_monthly_two)));
                data.add(new MainListElement(3,getString(R.string.checkups_monthly_three)));
            }
            if (pramFromIntent.compareTo(getString(R.string.checkups_three))==0)
            {
                data.add(new MainListElement(1,getString(R.string.checkups_yearly_one)));
                data.add(new MainListElement(2,getString(R.string.checkups_yearly_two)));
            }
        }
        return  data;
    }
}
