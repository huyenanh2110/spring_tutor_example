package car.constructor.injector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification.toString());
    }
}
