package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableServiceImpl implements VegetableService{
    private VegetableRepository vegetableRepository;

    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return null;
    }

    @Override
    public Vegetable getById(long id) {
        return null;
    }

    @Override
    public List<Vegetable> getByPriceAsc() {
        return List.of();
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return List.of();
    }

    @Override
    public Vegetable delete(long id) {
        return null;
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return List.of();
    }
}
