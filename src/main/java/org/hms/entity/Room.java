package org.hms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    private String roomId;
    private String type;
    private Double keyMoney;
    private Integer qty;
//    @OneToMany(mappedBy = "room")
//    private List<Reservation> reservations;
}
