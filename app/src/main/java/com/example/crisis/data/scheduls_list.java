package com.example.crisis.data;

import androidx.annotation.NonNull;

import com.example.crisis.Schedule;

public class scheduls_list {
    private  String day;
    private  String month;
    private  String year;
    private  String startTime;
    private  String endTime;

    public static scheduls_list[] scheduls = {
        new scheduls_list("05", "April", "2020", "08:00", "11:00"),
        new scheduls_list("05", "April", "2020", "21:00", "23:00"),
        new scheduls_list("07", "April", "2020", "17:00", "19:00"),
    };

    private scheduls_list(String day, String month, String year, String startTime, String endTime){
        this.day=day;
        this.month=month;
        this.year=year;
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public  String getDate(){
        String date = String.format("%s %s %s \nFrom %s To %s", day, month, year, startTime, endTime);
        return date;
    }


    public String toString() {
        String date = String.format("%s %s %s \nFrom %s To %s", day, month, year, startTime, endTime);
        return date;
    }
}
