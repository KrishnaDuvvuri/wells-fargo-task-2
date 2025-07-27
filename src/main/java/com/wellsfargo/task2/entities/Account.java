package com.wellsfargo.task2.entities;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String type;
    private double balance;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters and Setters
}
