package com.skipertech.springbootjap.repository;

import com.skipertech.springbootjap.model.CloudVender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVender,String > {
}
