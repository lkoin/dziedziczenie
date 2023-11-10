package pl.gornik.animal;

public class Bird extends Animal{



    private boolean isFlying;

    public Bird(String name, double weight, char size, boolean isFlying) {
        super(name, weight, size);
        this.isFlying = isFlying;
    }


    @Override
    public String toString() {
        return "Bird " +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", size=" + getSize() +
                ", isFlying=" + isFlying +
                ' ';
    }
}

