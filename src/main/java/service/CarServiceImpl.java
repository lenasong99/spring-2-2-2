package service;
import model.Car;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("AUDI", "black",2022));
        carList.add(new Car("BMW", "white",2020));
        carList.add(new Car("KIA", "red",2019));
        carList.add(new Car("HYUNDAI", "grey",2023));
        carList.add(new Car("FIAT", "blue",2010));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
