package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "fruit", schema = "fsweb")
public class Fruit  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
