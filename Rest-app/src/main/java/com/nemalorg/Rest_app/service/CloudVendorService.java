package com.nemalorg.Rest_app.service;

import com.nemalorg.Rest_app.model.Vendor;

import java.util.List;

// Business logic / service layer
public interface CloudVendorService {
    public String createCloudVendor(Vendor vendor);
    public String updateCloudVendor(Vendor vendor);
    public String deleteCloudVendor(String vendorId);
    public Vendor getCloudVendor(String vendorId);
    public List<Vendor> getAllCloudVendors();
}
