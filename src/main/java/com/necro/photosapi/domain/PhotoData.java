package com.necro.photosapi.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoData {

    private Long id;
    private String cameraName;
    private String date;
    private String img;

    public PhotoData(Long id, String cameraName, String date, String img) {
        this.id = id;
        this.cameraName = cameraName;
        this.date = date;
        this.img = img;
    }

    public PhotoData() {
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    @JsonProperty("earth_date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("img_src")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @JsonProperty("camera")
    private void unpackCameraName(Map<String, Object> camera) {
        this.cameraName = (String) camera.get("full_name");
    }

}
