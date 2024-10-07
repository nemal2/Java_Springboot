package com.nemalorg.Rest_app.service.impl;

import com.nemalorg.Rest_app.model.Vendor;
import com.nemalorg.Rest_app.repository.CloudVendorRepository;
import com.nemalorg.Rest_app.service.CloudVendorService;

import java.util.List;

public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    // ==============================================================stopped at here 34.03 minutes====================================================================



    @Override
    public String createCloudVendor(Vendor vendor) {
        return null;
    }

    @Override
    public String updateCloudVendor(Vendor vendor) {
        return null;
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        return null;
    }

    @Override
    public Vendor getCloudVendor(String vendorId) {
        return null;
    }

    @Override
    public List<Vendor> getAllCloudVendors() {
        return null;
    }
}
