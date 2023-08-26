package com.example.myproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;

   // @ManyToOne(fetch = FetchType.LAZY)
    //  @JoinColumn(name = "category_id",referencedColumnName = "category_id")
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private double price;
    private String description;
    private String imageName;
}
