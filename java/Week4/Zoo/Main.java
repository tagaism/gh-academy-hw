package Week4.Zoo;

import Week4.Zoo.Animal.Animal;
import Week4.Zoo.Bear.Bear;
import Week4.Zoo.Lion.Lion;
import Week4.Zoo.Tiger.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[] {
            new Lion(), new Tiger(), new Bear()
        };

        for(Animal creature : zoo) {
            creature.makeSound();
        }

    }
}
