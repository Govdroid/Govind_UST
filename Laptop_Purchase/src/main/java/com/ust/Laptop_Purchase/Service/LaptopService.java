package com.ust.Laptop_Purchase.Service;

import com.ust.Laptop_Purchase.Entity.Laptop;
import com.ust.Laptop_Purchase.repo.LaptopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;


    public Laptop addnewlaptop(Laptop laptop) {
        return repo.save(laptop);
    }

    public List<Laptop> getalllaptop() {
        return repo.findAll();
    }

    public List<Laptop> findByPrice(double minPrice, double maxPrice) {
        return repo.findAll().stream()
                .filter(laptop -> laptop.getPrice() >= minPrice && laptop.getPrice() <= maxPrice)
                .toList();
    }

    public List<Laptop> findByBrand(String brand) {
        return repo.findAll().stream()
                .filter(laptop -> laptop.getBrand().equalsIgnoreCase(brand))
                .toList();
    }


}