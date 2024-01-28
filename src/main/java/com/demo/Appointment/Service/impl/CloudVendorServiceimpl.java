package com.demo.Appointment.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.Appointment.Model.CloudVendor;
import com.demo.Appointment.Service.CloudVendorService;
import com.demo.Appointment.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceimpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudvendor) {
        cloudVendorRepository.save(cloudvendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudvendorId) {
        cloudVendorRepository.deleteById(cloudvendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudvedorId) {
        return cloudVendorRepository.findById(cloudvedorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

}
