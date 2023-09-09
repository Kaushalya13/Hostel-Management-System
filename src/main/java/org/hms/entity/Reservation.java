package org.hms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SecondaryTables;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Reservation {
    @Id
    private String reservationId;
    private String date;
//    @ManyToOne
    private String roomId;
//    @ManyToOne
    private String studentId;
    private String status;


}
