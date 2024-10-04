package com.ust.Laptop_Purchase.Controller;

import com.ust.Laptop_Purchase.Entity.Laptop;
import com.ust.Laptop_Purchase.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ust")
public class LaptopController {

    @Autowired
    private LaptopService service;

    @PostMapping("/addlaptop")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return service.addnewlaptop(laptop);
    }
    @GetMapping("/getlaptop")
    public List<Laptop> getLaptop(){
        return service.getalllaptop();
    }

    @GetMapping("/filter-by-price")
    public List<Laptop> getLaptopsByPrice(@RequestParam double minPrice, @RequestParam double maxPrice) {
        return service.findByPrice(minPrice, maxPrice);
    }

    @GetMapping("/filter-by-brand")
    public List<Laptop> getLaptopsByBrand(@RequestParam String brand) {
        return service.findByBrand(brand);
    }




}


