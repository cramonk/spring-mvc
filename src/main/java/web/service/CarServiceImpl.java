package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> CARS = Stream.of(
                    new Car("Volvo", "XC90", 2005),
                    new Car("Scoda", "Yeti", 2010),
                    new Car("Scoda", "Rapid", 2001),
                    new Car("BMW", "X5", 2019),
                    new Car("Mitsubishi", "Lancer", 2012))
            .toList();

    @Override
    public List<Car> getNumberOfCars(int howMuch) {
        return CARS.stream()
                .limit(howMuch)
                .toList();
    }
}
