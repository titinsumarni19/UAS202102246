package com.titinsumarni_202102246.uas202102246;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListModel {
    @SerializedName("main")
    private MainModel mainModel;
    @SerializedName("weather")
    private List<WheatherModel> weatherModelList;
    private String dt_txt;

    public ListModel() {}

    public MainModel getMainModel() {
        return mainModel;
    }

    public void setMainModel(MainModel mainModel) {
        this.mainModel = mainModel;
    }

    public List<WheatherModel> getWeatherModelList() {
        return weatherModelList;
    }

    public void setWeatherModelList(List<WheatherModel> weatherModelList) {
        this.weatherModelList = weatherModelList;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
