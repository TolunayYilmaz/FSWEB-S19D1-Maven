package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    Vegetable save (Vegetable vegetable);
    Vegetable getById(long id);
    List<Vegetable> getByPriceAsc();
    List<Vegetable> getByPriceDesc();
    Vegetable delete(long id);
    List<Vegetable> searchByName(String name);
}
