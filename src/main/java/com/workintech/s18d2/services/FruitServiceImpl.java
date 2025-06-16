package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.exceptions.PlantException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService{
    private FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit save(Fruit fruit) {
       return fruitRepository.save(fruit);
    }

    @Override
    public Fruit getById(long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new PlantException("Fruit not found with id: " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public Fruit delete(Long id) {
        if (id == null) {
            throw new PlantException("Id cannot be null", HttpStatus.BAD_REQUEST);
        }

        Fruit fruit = fruitRepository.findById(id)
                .orElseThrow(() -> new PlantException("Fruit not found with id: " + id, HttpStatus.NOT_FOUND));
        fruitRepository.delete(fruit);
        return fruit;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

}
