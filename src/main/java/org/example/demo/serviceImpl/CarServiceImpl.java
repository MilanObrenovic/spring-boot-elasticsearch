package org.example.demo.serviceImpl;

import lombok.AllArgsConstructor;
import org.example.demo.model.CarModel;
import org.example.demo.repository.CarRepository;
import org.example.demo.service.CarService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public void save(CarModel carModel) {
        carRepository.save(carModel);
    }

    @Override
    public CarModel findById(String id) {
        return carRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Could not find car with ID [%s].".formatted(id))
                );
    }

    @Override
    public Iterable<CarModel> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void update(CarModel carModel) {
        carRepository.save(carModel);
    }

    @Override
    public void deleteById(String id) {
        carRepository.deleteById(id);
    }

}
