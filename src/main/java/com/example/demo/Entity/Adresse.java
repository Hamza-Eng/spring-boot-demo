package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
        private String adresse;
}
