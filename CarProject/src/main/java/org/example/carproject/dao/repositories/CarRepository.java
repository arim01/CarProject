package org.example.carproject.dao.repositories;

import org.example.carproject.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long>
{
    List<Car> findByModel(String model);
}
