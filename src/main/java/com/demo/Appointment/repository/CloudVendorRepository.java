package com.demo.Appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Appointment.Model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
