package org.example.demo.controller;

import lombok.AllArgsConstructor;
import org.example.demo.model.CarModel;
import org.example.demo.service.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/cars")
public class CarController {

    private final CarService carService;

    @PostMapping()
    public void save(@RequestBody CarModel car) {
        carService.save(car);
    }

    @GetMapping("/{id}")
    public CarModel findById(
            @PathVariable("id") String id
    ) {
        return carService.findById(id);
    }

    @GetMapping()
    public Iterable<CarModel> findAll() {
        return carService.findAll();
    }

    @PutMapping()
    public void update(
            @RequestBody CarModel car
    ) {
        carService.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteById(
            @PathVariable("id") String id
    ) {
        carService.deleteById(id);
    }

}
