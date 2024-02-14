package com.skipertech.restdemo.controller;

import com.skipertech.restdemo.model.CloudVender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud")
public class CloudController {

    CloudVender cloudVender;
    @GetMapping("{venderId}")
    public CloudVender getCloudvender(String venderid){
//        return new CloudVender("1","Anurag","Pune","12345");
    return cloudVender;
    }

    @PostMapping
    public String createCloudVender(@RequestBody CloudVender cloudVender){

        this.cloudVender=cloudVender;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudvendor(@RequestBody CloudVender cloudVender){

        this.cloudVender=cloudVender;
        return "Updating successfully";
    }

    @DeleteMapping
    public String deleteVender(@RequestBody CloudVender cloudVender){
        this.cloudVender=cloudVender;
        return "vendor deleted";
    }
}
