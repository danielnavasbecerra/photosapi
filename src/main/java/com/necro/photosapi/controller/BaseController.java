package com.necro.photosapi.controller;

// import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.List;

import com.necro.photosapi.domain.PhotoData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.necro.photosapi.service.PhotosService;

@Controller
public class BaseController {

    @Autowired
    private PhotosService service;

    @GetMapping("/get/{date}")
    @ResponseBody
    public List<PhotoData> getPhotos(@PathVariable String date) {
        return service.getPhotos(date);
    }

    @GetMapping("/get/view/{date}")
    public String getPhotos(@PathVariable String date, Model model) {
        List<PhotoData> photos = service.getPhotos(date);
        model.addAttribute("photos",photos);
        return "fotolist";
    }
}
