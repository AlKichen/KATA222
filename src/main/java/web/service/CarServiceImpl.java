package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    private final CarDaoImpl carDao = new CarDaoImpl();
    @Override
    public List<Car> getListCars(String count) {
        return carDao.getListCars(count);
    }
}
