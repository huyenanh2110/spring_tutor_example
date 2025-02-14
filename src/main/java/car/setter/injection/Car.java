package car.setter.injection;

public class Car {
    private Specification specification;


    public void diaplayDetails() {
        System.out.println("Car detail: "+ specification.toString());
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
