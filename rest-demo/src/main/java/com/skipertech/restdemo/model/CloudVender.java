package com.skipertech.restdemo.model;

import java.util.logging.StreamHandler;

public class CloudVender {
    public CloudVender(String venderId, String venderName, String venderAddress, String phoneNumber) {
        this.venderId = venderId;
        this.venderName = venderName;
        VenderAddress = venderAddress;
        this.phoneNumber = phoneNumber;
    }

    public CloudVender() {
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getVenderAddress() {
        return VenderAddress;
    }

    public void setVenderAddress(String venderAddress) {
        VenderAddress = venderAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String venderId;
    private String venderName;
    private  String VenderAddress;
    private String phoneNumber;
}
