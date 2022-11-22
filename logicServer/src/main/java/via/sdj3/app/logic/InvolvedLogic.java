package via.sdj3.app.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.MergedAnnotation.Adapt;
import org.springframework.stereotype.Service;

import via.sdj3.app.objects.Animal;
import via.sdj3.app.repo.AnimalDAO;
import via.sdj3.app.repo.InvolvedDAO;

@Service
public class InvolvedLogic {

    private InvolvedDAO dao;
    private AnimalDAO aDao;

    public InvolvedLogic(InvolvedDAO dao, AnimalDAO aDao) {
        this.dao = dao;
        this.aDao = aDao;
    }

    public List<Animal> retrieveRegNums(int id) {
        List<Integer> ids = dao.getInvolvedAnimals(id);
        List<Animal> animals = new ArrayList<>();

        for (Integer integer : ids) {
            animals.add(aDao.getById(integer));
        }

        return animals;
    }

    public List<Integer> retrieveProdNums(int id) {

        // Missing product functionality :(

        return dao.retrieveProdNums(id);
    }

}
