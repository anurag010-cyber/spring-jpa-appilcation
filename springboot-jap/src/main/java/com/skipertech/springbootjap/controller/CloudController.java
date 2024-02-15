package com.skipertech.springbootjap.controller;

import com.skipertech.springbootjap.model.CloudVender;
import com.skipertech.springbootjap.service.CloudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
@RequiredArgsConstructor
public class CloudController {


    private final CloudService cloudService;

    @GetMapping("/vendor/{vendorId}")
    public CloudVender getCloudvender(@PathVariable String vendorId) {


        return cloudService.fetchCloudVendor(vendorId);
    }@GetMapping("/vendor")
    public List<CloudVender> fetchCloudvender() {


        return cloudService.fetchAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVender cloudVender) {

        return cloudService.createCloudVendor(cloudVender);


    }

    @PutMapping
    public String updateCloudvendor(@RequestBody CloudVender cloudVender) {

        return cloudService.updateCloudVendor(cloudVender);

    }

    @DeleteMapping("/{vendorId}")
    public String deleteVender(@PathVariable  String vendorId) {
        return cloudService.deleteVendor(vendorId);
    }


}
