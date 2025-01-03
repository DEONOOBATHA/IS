package com.bottleSell.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int total;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userBag;
    @ManyToOne
    @JoinColumn(name = "id_req_PickUp")
    private PickUp pickUp;

}
