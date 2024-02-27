package org.example.demo.service;

import org.example.demo.model.CarModel;

public interface CarService {

    void save(CarModel carModel);
    CarModel findById(String id);
    Iterable<CarModel> findAll();
    void update(CarModel carModel);
    void deleteById(String id);

}
