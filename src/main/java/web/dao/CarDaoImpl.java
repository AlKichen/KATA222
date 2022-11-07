package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 170, 1997));
        carList.add(new Car("KIA", 115, 2005));
        carList.add(new Car("MERSEDES-BENZ", 190, 2012));
        carList.add(new Car("TOYOTA", 150, 2007));
        carList.add(new Car("SKODA", 115, 2008));
        carList.add(new Car("MAZDA", 150, 2013));
        carList.add(new Car("VOLKSWAGEN", 99, 2009));
        carList.add(new Car("SAAB", 180, 2001));
        carList.add(new Car("OPEL", 105, 2006));

    }

    @Override
    public List<Car> getListCars() {
        return carList;
    }
}
