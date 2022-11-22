package Group1.Slaughterhouse.service;

import java.util.List;

import Group1.Slaughterhouse.objects.Animal;

public interface InvolvedService {
    List<Animal> retrieveInvolvedAnimals(int id);

    List<Integer> retrieveInvolvedProducts(int id);
}
