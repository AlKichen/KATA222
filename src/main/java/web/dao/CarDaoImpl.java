package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDAO {

    private int countOfCars = 0;
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++countOfCars,"BMW", 170, 1997));
        carList.add(new Car(++countOfCars, "KIA", 115, 2005));
        carList.add(new Car(++countOfCars, "MERSEDES-BENZ", 190, 2012));
        carList.add(new Car(++countOfCars, "TOYOTA", 150, 2007));
        carList.add(new Car(++countOfCars, "SKODA", 115, 2008));
        carList.add(new Car(++countOfCars, "MAZDA", 150, 2013));
        carList.add(new Car(++countOfCars, "VOLKSWAGEN", 99, 2009));
        carList.add(new Car(++countOfCars, "SAAB", 180, 2001));
        carList.add(new Car(++countOfCars, "OPEL", 105, 2006));

    }

    @Override
    public List<Car> getListCars() {
        return carList;
    }
}
