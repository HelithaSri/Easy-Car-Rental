package com.esaycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Helitha Sri
 * @created 7/6/2022 - 11:47 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class RegisteredUsersImg {
    @Id
    private String imgId;
    private String pathUrl;
    private String Description;
    private String registerUserId;

    /*@ManyToOne
    @JoinColumn(name = "registerUserId", referencedColumnName = "regUserId", insertable = false, updatable = false)
    private RegisteredUser registeredUser;*/
}
