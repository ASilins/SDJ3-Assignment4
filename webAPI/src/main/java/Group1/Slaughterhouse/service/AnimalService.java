package Group1.Slaughterhouse.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import Group1.Slaughterhouse.objects.Animal;

@Service
public interface AnimalService {

    Animal create(Animal a);

    ArrayList<Animal> getAllAnimals();

    Animal getById(Long id);

    ArrayList<Animal> getByOrigin(String origin);

    ArrayList<Animal> getByDate(String date);

}