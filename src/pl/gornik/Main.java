package pl.gornik;

import pl.gornik.animal.Animal;
import pl.gornik.animal.Bird;
import pl.gornik.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Doberman",30,'M',4);
        Dog dog2 = new Dog("Pudel",10,'S',4);

        Bird bird1 = new Bird("Wrobel",0.02,'S',true);
        Bird bird2 = new Bird("Strus",70,'L',false);


        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(bird1);
        animals.add(bird2);

        animals.add(new Dog("Husky",45,'M',4));


        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

}