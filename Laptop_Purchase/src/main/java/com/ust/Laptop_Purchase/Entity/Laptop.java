package com.ust.Laptop_Purchase.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Laptops")
public class Laptop {
    @Id

    private Long id;
    private double price;
    private String brand;
    private String model;

}
