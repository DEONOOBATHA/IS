package com.bottleSell.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNr;
    private int balance;
    private int reportsNr;
    @Column(nullable = false)
    private String role;
    private String imgURL;
    private Point currentLocation;

    @OneToMany(mappedBy = "userPromo", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<OrderPromo> orderPromos = new HashSet<>();
    @OneToMany(mappedBy = "userBag", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Bag> bags = new HashSet<>();
    @OneToMany(mappedBy = "userLoc", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<UserLocation> userLocations = new HashSet<>();
    @OneToMany(mappedBy = "userPickUp", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<PickUp> pickUps = new HashSet<>();

}
