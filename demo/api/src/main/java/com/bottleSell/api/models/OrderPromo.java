package com.bottleSell.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderPromo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String qrImgUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userPromo;
    @ManyToOne
    @JoinColumn(name = "promo_id")
    private Promo promo;
}
