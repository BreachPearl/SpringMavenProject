package com.demo.Appointment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.Appointment.Model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIServices {
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID) {
        return new CloudVendor("1", "Sumanth", "4707", "301xxxx");
    }
}
