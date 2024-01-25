package com.demo.Appointment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.Appointment.Model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIServices {
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
}
