package org.hms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Student{
    @Id
    private String studentID;
    private String name;
    private String address;
    private String dbo;
    private String contact;
    private String gender;
//    @OneToMany(mappedBy = "student")
//    private List<Reservation> reservations;

}
