package Group1.Slaughterhouse.service;

import java.util.List;

import Group1.Slaughterhouse.objects.Animal;

public interface AnimalService {

    Animal create(Animal a);

    List<Animal> getAllAnimals();

    Animal getById(int id);

    List<Animal> getByOrigin(String origin);

    List<Animal> getByDate(String date);

}