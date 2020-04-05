package com.example.crisis;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.crisis.data.scheduls_list;


public class scheduleFragment extends Fragment {
    private int scheduleId;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            TextView date = (TextView) view.findViewById(R.id.date);
            scheduls_list Scheduls_list = scheduls_list.scheduls[scheduleId];
            date.setText(Scheduls_list.getDate());
        }
    }

    public void setScheduleId(int id){
        this.scheduleId = id;
    }

}
