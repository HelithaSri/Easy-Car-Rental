package com.esaycarrental.spring.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 7/7/2022 - 3:16 PM
 * @project Easy Car Rental
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
/*@Getter
@Setter*/
@ToString
@Entity
public class Rent {
    @Id
    private String rentId;
    private LocalDate date;
    private String status;
    private String reason;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "userId", referencedColumnName = "regUserId", nullable = false)
    private RegisteredUser userId;

    @OneToMany(mappedBy = "rent", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<RentDetails> rentDetails;

    @OneToMany(mappedBy = "rent", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<DriveSchedule> driveSchedules;



}
