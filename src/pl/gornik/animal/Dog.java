package pl.gornik.animal;

public class Dog extends Animal{

    private int numberOfLegs;

    public Dog(String name, double weight, char size, int numberOfLegs) {
        super(name,weight,size);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Dog " +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", size=" + getSize() +
                ", numberOfLegs=" + numberOfLegs +
                ' ';
    }
}
