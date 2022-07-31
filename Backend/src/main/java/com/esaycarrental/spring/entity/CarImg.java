package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Helitha Sri
 * @created 7/30/2022 - 8:22 PM
 * @project Easy Car Rental
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class CarImg {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String imgId;
    private String path;
}
