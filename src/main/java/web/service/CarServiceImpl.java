package web.service;

import web.model.CarEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<CarEntity> getCars(Integer count) {
        List<CarEntity> cars; {
            cars= new ArrayList<>(); 
            cars.add(new CarEntity("BMW", 2, "blue"));
            cars.add(new CarEntity("Lada", 11, "gray"));
            cars.add(new CarEntity("Mers", 4, "black"));
            cars.add(new CarEntity("Zaporojec", 45, "yellow"));
            cars.add(new CarEntity("BMW", 1, "red"));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
