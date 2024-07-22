package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public interface CarService {
    List<Car> getNumberOfCars(List<Car> cars, int howMuch);
    List<Car> generateCars();
}
