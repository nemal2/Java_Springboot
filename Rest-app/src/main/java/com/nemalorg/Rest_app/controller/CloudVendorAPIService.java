package com.nemalorg.Rest_app.controller;

import com.nemalorg.Rest_app.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendorapi")
public class CloudVendorAPIService {

    Vendor cloudvendor;
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId) {
        return cloudvendor;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor) {
        cloudvendor = vendor;
        return "Vendor added successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor) {
        cloudvendor = vendor;
        return "Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(String vendorId) {
        cloudvendor = null;
        return "Vendor deleted successfully";
    }
}
