package com.skipertech.springbootjap.service.impl;

import com.skipertech.springbootjap.exception.CloudVendorNotFoundException;
import com.skipertech.springbootjap.model.CloudVender;
import com.skipertech.springbootjap.repository.CloudVendorRepository;
import com.skipertech.springbootjap.service.CloudService;
import lombok.SneakyThrows;
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

        if (cloudVendorRepository.findById(id).isEmpty()){
            throw new CloudVendorNotFoundException("Data Not Found for given vendor");
        }
        return cloudVendorRepository.findById(id).get();
    }

    @SneakyThrows
    @Override
    public List<CloudVender> fetchAllCloudVendors() {
        List<CloudVender> cloudVenderList= cloudVendorRepository.findAll();

        if (cloudVenderList.isEmpty()){
            throw new CloudVendorNotFoundException("Data Not Found for given vendor");
        }
        return cloudVenderList;

    }
}
