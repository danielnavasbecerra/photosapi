package com.necro.photosapi.domain;

import java.util.List;

public class PhotosResponse {


    private List<PhotoData> photos;

    public List<PhotoData> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoData> photos) {
        this.photos = photos;
    }

}
