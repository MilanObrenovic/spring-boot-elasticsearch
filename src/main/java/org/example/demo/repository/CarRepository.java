package org.example.demo.repository;

import org.example.demo.model.CarModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarRepository extends ElasticsearchRepository<CarModel, String> {
}
