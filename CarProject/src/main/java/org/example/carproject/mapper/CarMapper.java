package org.example.carproject.mapper;

import org.example.carproject.dao.entities.Car;
import org.example.carproject.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    ModelMapper mapper= new ModelMapper();

    //fromCar to carDTO
    public CarDTO fromCarToDTO(Car car){
        return mapper.map(car,CarDTO.class);
    }


    //fromCarDTO to car
    public Car fromCarDTOToCar(CarDTO carDTO){
        return mapper.map(carDTO,Car.class);
    }

}
