package com.demo.Appointment.Service;

import java.util.List;
import com.demo.Appointment.Model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudvendor);

    public String deleteCloudVendor(String cloudvendorId);

    public CloudVendor getCloudVendor(String cloudvedorId);

    public List<CloudVendor> getAllCloudVendors();
}
