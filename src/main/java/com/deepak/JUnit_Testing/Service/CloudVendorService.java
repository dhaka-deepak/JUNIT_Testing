package com.deepak.JUnit_Testing.Service;

import com.deepak.JUnit_Testing.Exception.CloudVendorNotFoundException;
import com.deepak.JUnit_Testing.Model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId) throws CloudVendorNotFoundException;
    public List<CloudVendor> getAllCloudVendors();
    public List<CloudVendor> getByVendorName(String vendorName);
}
