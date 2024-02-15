package com.skipertech.springbootjap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
//@Table(name = "cloud_vendor_info")
public class CloudVender {
    public CloudVender(String venderId, String venderName, String venderAddress, String phoneNumber) {
        this.vendorId = venderId;
        this.vendorName = venderName;
        this.VendorAddress = venderAddress;
        this.phoneNumber = phoneNumber;
    }

    public CloudVender() {
    }

    @Id
    private String vendorId;
    private String vendorName;
    private String VendorAddress;
    private String phoneNumber;
}
