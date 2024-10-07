package com.nemalorg.Rest_app.repository;

import com.nemalorg.Rest_app.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <Vendor, String>{

}
