package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;

public interface FruitService {
    Fruit save (Fruit fruit);
    Fruit getById(long id);
    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();
    Fruit delete(Long id);
    List<Fruit> searchByName(String name);
    List<Fruit> findAll();
}
