package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Helitha Sri
 * @created 7/9/2022 - 2:28 PM
 * @project Easy Car Rental
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Driver {
    @Id
    String driverId;
    String name;
    String address;
    String mobileNo;
    String email;
    String password;
    String status;
}
