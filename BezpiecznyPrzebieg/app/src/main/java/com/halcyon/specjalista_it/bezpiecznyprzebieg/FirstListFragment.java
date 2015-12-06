package com.halcyon.specjalista_it.bezpiecznyprzebieg;

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


public class FirstListFragment extends Fragment {

    private String pramFromIntent;

    @Bind(R.id.my_recycler_view)
    protected RecyclerView myRecycleView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_list_fragment, container, false);
        ButterKnife.bind(this, view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        myRecycleView.setLayoutManager(layoutManager);

        if (getActivity().getIntent()!= null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(LunchFragment.CLICK_SOURCE);

        }

        List<MainListElement> data = new ArrayList<MainListElement>();
        if (pramFromIntent.compareTo(getString(R.string.car))==0) {
            data.add(new MainListElement(1, getString(R.string.stering_wheel)));
            data.add(new MainListElement(2, getString(R.string.interia)));
            data.add(new MainListElement(3, getString(R.string.engine)));
            data.add(new MainListElement(4, getString(R.string.suspension)));
            data.add(new MainListElement(5, getString(R.string.periodic_checkups)));
        }
        if (pramFromIntent.compareTo(getString(R.string.public_transport))==0)
        {
            data.add(new MainListElement(1, getString(R.string.kzk_gop)));
            data.add(new MainListElement(2, getString(R.string.autocar)));
        }
        FirstListAdapter firstListAdapter = new FirstListAdapter(data,getContext());
        myRecycleView.setAdapter(firstListAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }
}
