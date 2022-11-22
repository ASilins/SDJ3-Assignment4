// package Group1.Slaughterhouse.service;

// import java.util.ArrayList;

// import org.springframework.stereotype.Service;

// import Group1.Slaughterhouse.objects.Animal;
// import Group1.Slaughterhouse.repository.AnimalRepository;

// @Service
// public class AnimalServiceImpl implements AnimalService {

// private AnimalRepository repo;

// public AnimalServiceImpl(AnimalRepository repo) {
// this.repo = repo;
// }

// @Override
// public Animal create(Animal a) {
// return repo.save(a);
// }

// @Override
// public ArrayList<Animal> getAllAnimals() {
// return repo.getAllAnimals();
// }

// @Override
// public Animal getById(Long id) {
// return repo.getById(id);
// }

// @Override
// public ArrayList<Animal> getByOrigin(String origin) {
// return repo.getByOrigin(origin);
// }

// @Override
// public ArrayList<Animal> getByDate(String date) {
// return repo.getByDate(date);
// }
// }