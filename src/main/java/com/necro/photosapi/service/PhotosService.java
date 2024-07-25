package com.necro.photosapi.service;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.necro.photosapi.domain.PhotoData;
import com.necro.photosapi.domain.PhotosResponse;

@Service
public class PhotosService {

    private final String URLtest = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?earth_date=2020-6-3&api_key=ak9zXIr3DAdLWRRIQzaje5bNvVK9enq4MGxTW97m";
    private final String URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?earth_date=";

    private String api_key = "ak9zXIr3DAdLWRRIQzaje5bNvVK9enq4MGxTW97m";
    @Autowired
    private RestTemplate restTemplate;

    public List<PhotoData> getPhotos(String date) {
        PhotosResponse response = restTemplate.getForObject(URL.concat(date + "&api_key=" + api_key), PhotosResponse.class);
        return response.getPhotos();
    }
}
