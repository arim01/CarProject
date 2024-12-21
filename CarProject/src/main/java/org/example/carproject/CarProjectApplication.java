package org.example.carproject;

import org.example.carproject.dao.entities.Car;
import org.example.carproject.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarProjectApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CarRepository carRepository){
        return args -> {
            List<Car> car=List.of(
                    Car.builder().model("x").color("noir").matricule("hhh1425").price(15000.0).build(),
                    Car.builder().model("y").color("rouge").matricule("hhh1426").price(100000.0).build(),
                    Car.builder().model("z").color("vert").matricule("hhh1427").price(20000.0).build(),
                    Car.builder().model("w").color("rose").matricule("hhh1428").price(20000.0).build()
            );
            carRepository.saveAll(car);

        };
    }

}
