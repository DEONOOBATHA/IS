package com.bottleSell.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PickUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String date;
    private boolean finished;
    @Column(nullable = false)
    private int totalBottles;
    private boolean isActive;



    @OneToMany(mappedBy = "pickUp", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Bag> pickUpBags = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_loc_id")
    private UserLocation userLocation;

    @ManyToOne
    @JoinColumn(name = "id_deliverer")
    private User userPickUp;

}
