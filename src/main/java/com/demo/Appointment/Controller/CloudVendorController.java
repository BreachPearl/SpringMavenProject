package com.demo.Appointment.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.Appointment.Model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendor cloudven;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID) {
        return cloudven;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody CloudVendor cloudven) {
        this.cloudven = cloudven;
        return "data is inserted Successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudven) {
        this.cloudven = cloudven;
        return "data is updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(String vendorId) {
        this.cloudven = null;
        return "data is deleted Successfully";
    }
}
