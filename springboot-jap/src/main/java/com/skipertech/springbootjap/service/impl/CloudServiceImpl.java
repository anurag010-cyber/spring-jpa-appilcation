package com.skipertech.springbootjap.service.impl;

import com.skipertech.springbootjap.model.CloudVender;
import com.skipertech.springbootjap.repository.CloudVendorRepository;
import com.skipertech.springbootjap.service.CloudService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudServiceImpl implements CloudService {
    CloudVendorRepository cloudVendorRepository;

    public CloudServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVender cloudVender) {
        cloudVendorRepository.save(cloudVender);
        return "Vendor Created Successfully";
    }

    @Override
    public String updateCloudVendor(CloudVender cloudVender) {
        cloudVendorRepository.save(cloudVender);
        return "Vendor Updated Successfully";
    }

    @Override
    public String deleteVendor(String id) {

        cloudVendorRepository.deleteById(id);
        return "Deleted Successfully";
    }

    @Override
    public CloudVender fetchCloudVendor(String id) {
        return cloudVendorRepository.findById(id).get();
    }

    @Override
    public List<CloudVender> fetchAllCloudVendors() {
       return cloudVendorRepository.findAll();

    }
}
