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
public class UserLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userLoc;
    @ManyToOne
    @JoinColumn(name = "loc_id")
    private Location locUser;
    @OneToMany(mappedBy = "id", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<PickUp> pickUps = new HashSet<>();




}
