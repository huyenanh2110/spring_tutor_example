package car.setter.injection;

public class Specification {
    private String maker;
    private String model;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
