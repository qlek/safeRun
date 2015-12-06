package com.halcyon.specjalista_it.bezpiecznyprzebieg;

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
        View view = inflater.inflate(R.layout.detail_info_fragment, container, false);

        if (getActivity().getIntent()!= null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(SecondListHolder.PARAM_NAME);
        }
        if (pramFromIntent == null)
        {
            Intent i = getActivity().getIntent();
            pramFromIntent = i.getExtras().getString(ThirdListHolder.PARAM_NAME);
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
        //public transport part
        if (pramFromIntent.compareTo(getString(R.string.kzk_gop_technical_issue))==0)
        {
            infostring = getString(R.string.kzk_gop_technical_issue_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.kzk_gop_danger_public))==0)
        {
            infostring = getString(R.string.kzk_gop_danger_public_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.kzk_gop_medical_problem))==0)
        {
            infostring = getString(R.string.kzk_gop_medical_problem_long);
        }

        //autocar part
        if (pramFromIntent.compareTo(getString(R.string.autocar_technical_checkup))==0)
        {
            infostring = getString(R.string.autocar_technical_checkup_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.autocar_drug_test))==0)
        {
            infostring = getString(R.string.autocar_drug_test_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.autocar_license))==0)
        {
            infostring = getString(R.string.autocar_license_long);
        }

        //stering wheel part
        if (pramFromIntent.compareTo(getString(R.string.stering_one))==0)
        {
            infostring = getString(R.string.stering_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.stering_two))==0)
        {
            infostring = getString(R.string.stering_two_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.stering_three))==0)
        {
            infostring = getString(R.string.stering_three_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.stering_four))==0)
        {
            infostring = getString(R.string.stering_four_long);
        }

        //interia list
        if (pramFromIntent.compareTo(getString(R.string.cokpit_one))==0)
        {
            infostring = getString(R.string.cokpit_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.cokpit_two))==0)
        {
            infostring = getString(R.string.cokpit_two_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.cokpit_three))==0)
        {
            infostring = getString(R.string.cokpit_three_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.cokpit_four))==0)
        {
            infostring = getString(R.string.cokpit_four_long);
        }

        //engine

        if (pramFromIntent.compareTo(getString(R.string.engine_one))==0)
        {
            infostring = getString(R.string.engine_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.engine_two))==0)
        {
            infostring = getString(R.string.engine_two_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.engine_three))==0)
        {
            infostring = getString(R.string.engine_three_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.engine_four))==0)
        {
            infostring = getString(R.string.engine_four_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.engine_five))==0)
        {
            infostring = getString(R.string.engine_five_long);
        }

        //suspension
        if (pramFromIntent.compareTo(getString(R.string.suspension_one))==0)
        {
            infostring = getString(R.string.suspension_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.suspension_two))==0)
        {
            infostring = getString(R.string.suspension_two_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.suspension_three))==0)
        {
            infostring = getString(R.string.suspension_three_long);
        }

        //road checkup
        if (pramFromIntent.compareTo(getString(R.string.checkups_road_one))==0)
        {
            infostring = getString(R.string.checkups_road_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.checkups_road_two))==0)
        {
            infostring = getString(R.string.checkups_road_two_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.checkups_road_three))==0)
        {
            infostring = getString(R.string.checkups_road_three_long);
        }

        //monthly cheskup
        if (pramFromIntent.compareTo(getString(R.string.checkups_monthly_one))==0)
        {
            infostring = getString(R.string.checkups_monthly_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.checkups_monthly_two))==0)
        {
            infostring = getString(R.string.checkups_monthly_two_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.checkups_monthly_three))==0)
        {
            infostring = getString(R.string.checkups_monthly_three_long);
        }

        //yearly checkup
        if (pramFromIntent.compareTo(getString(R.string.checkups_yearly_one))==0)
        {
            infostring = getString(R.string.checkups_yearly_one_long);
        }
        if (pramFromIntent.compareTo(getString(R.string.checkups_yearly_two))==0)
        {
            infostring = getString(R.string.checkups_yearly_two_long);
        }

        return infostring;
    }

}
