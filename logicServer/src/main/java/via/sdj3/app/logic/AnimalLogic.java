package via.sdj3.app.logic;

import java.util.List;

import org.springframework.stereotype.Service;
import via.sdj3.app.objects.Animal;
import via.sdj3.app.repo.AnimalDAO;

@Service
public class AnimalLogic {

    private AnimalDAO dao;

    public AnimalLogic(AnimalDAO dao) {
        this.dao = dao;
    }

    public Animal createAnimal(Animal animal) {
        return dao.createAnimal(animal);
    }

    public Animal getById(int id) {
        return dao.getById(id);
    }

    public List<Animal> getAllAnimals() {
        return dao.getAllAnimals();
    }

    public List<Animal> getByOrigin(String origin) {
        return dao.getByOrigin(origin);
    }

    public List<Animal> getByDate(String date) {
        return dao.getByDate(date);
    }

}
