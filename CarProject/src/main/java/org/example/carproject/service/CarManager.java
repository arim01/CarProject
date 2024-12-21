package org.example.carproject.service;

import lombok.AllArgsConstructor;
import org.example.carproject.dao.entities.Car;
import org.example.carproject.dao.repositories.CarRepository;
import org.example.carproject.dto.CarDTO;
import org.example.carproject.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class CarManager implements CarService
{

    private CarRepository carRepository;
    private CarMapper mapper;

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car= mapper.fromCarDTOToCar(carDTO);
        car=carRepository.save(car);
        return mapper.fromCarToDTO(car);
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> listeCars=carRepository.findByModel(model);
        List<CarDTO> listeCarsdto=new ArrayList<>();
        for(Car c:listeCars){
            listeCarsdto.add(mapper.fromCarToDTO(c));
        }
        return listeCarsdto;
    }
}
