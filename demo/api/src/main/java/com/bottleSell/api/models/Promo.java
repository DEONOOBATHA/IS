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
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String storeName;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String imgUrl;

    @OneToMany(mappedBy = "promo", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<OrderPromo> orderPromos = new HashSet<>();


}
