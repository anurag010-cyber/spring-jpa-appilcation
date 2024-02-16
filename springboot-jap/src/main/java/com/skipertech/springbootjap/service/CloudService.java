package com.skipertech.springbootjap.service;

import com.skipertech.springbootjap.model.CloudVender;

import java.util.List;

public interface CloudService {
    public String createCloudVendor(CloudVender cloudVender);
    public String updateCloudVendor(CloudVender cloudVender);
    public String deleteVendor(String id);
    public CloudVender fetchCloudVendor(String id) ;
    public List<CloudVender> fetchAllCloudVendors();

}
