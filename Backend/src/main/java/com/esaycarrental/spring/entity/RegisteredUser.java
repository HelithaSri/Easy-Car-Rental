package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/6/2022 - 11:30 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class RegisteredUser{
    @Id
    private String regUserId;
    private String name;
    private String address;
    private String nicNo;
    private String drivingLicenseNo;
    private String mobileNo;
    private String password;
    private String email;

   /* @OneToMany(mappedBy = "registereduser", cascade = CascadeType.ALL)
    private List<RegisteredUsersImg> img;*/
}
