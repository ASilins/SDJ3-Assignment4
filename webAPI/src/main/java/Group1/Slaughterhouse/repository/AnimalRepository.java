package Group1.Slaughterhouse.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import Group1.Slaughterhouse.objects.Animal;

@Repository
public class AnimalRepository {

    private static final ArrayList<Animal> animals = new ArrayList<>();

    static {
        initData();
    }

    private static void initData() {
        animals.add(new Animal("3-10-2022", 145.2, 1l, "Aarhus"));
        animals.add(new Animal("2-10-2022", 165.9, 2l, "Odense"));
        animals.add(new Animal("1-10-2022", 245.45, 3l, "Horsens"));
    }

    public Animal save(Animal a) {
        animals.add(a);
        return a;
    }

    public ArrayList<Animal> getAllAnimals() {
        return animals;
    }

    public Animal getById(Long id) {

        for (Animal animal : animals) {
            if (animal.getRegistrationNumber() == id) {
                return animal;
            }
        }

        return null;
    }

    public ArrayList<Animal> getByOrigin(String origin) {
        ArrayList<Animal> temp = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getOrigin().equals(origin)) {
                temp.add(animal);
            }
        }

        return temp;
    }

    public ArrayList<Animal> getByDate(String date) {
        ArrayList<Animal> temp = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getDate().equals(date)) {
                temp.add(animal);
            }
        }

        return temp;
    }
}