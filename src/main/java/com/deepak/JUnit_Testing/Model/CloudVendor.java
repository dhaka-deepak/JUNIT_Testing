package com.deepak.JUnit_Testing.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cloud_vendor_info")
@ApiModel(description = "This table holds cloud vendor information.")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CloudVendor {
    @Id
    @ApiModelProperty(notes="This is a Cloud Vendor Id. It shall be unique.")
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;
}
