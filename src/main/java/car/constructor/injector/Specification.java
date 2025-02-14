package car.constructor.injector;

public class Specification {
    private String model;
    private String maker;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
