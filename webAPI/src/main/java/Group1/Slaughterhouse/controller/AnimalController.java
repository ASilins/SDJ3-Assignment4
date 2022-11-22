package Group1.Slaughterhouse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Group1.Slaughterhouse.objects.Animal;
import Group1.Slaughterhouse.service.AnimalService;

@RestController
@RequestMapping("/api")
public class AnimalController {

    private AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @PostMapping("/animal")
    public ResponseEntity<Object> createAnimal(@RequestBody Animal animal) {
        try {
            Animal createdAnimal = service.create(animal);
            return new ResponseEntity<>(createdAnimal, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animal")
    public ResponseEntity<Object> getAllAnimals() {
        try {
            Iterable<Animal> animals = service.getAllAnimals();
            return new ResponseEntity<>(animals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/animal/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getById(@PathVariable("id") int id) {
        try {
            Animal animal = service.getById(id);
            return new ResponseEntity<>(animal, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/animal/origin={origin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getByOrgin(@PathVariable("origin") String origin) {
        try {
            Iterable<Animal> animals = service.getByOrigin(origin);
            return new ResponseEntity<>(animals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/animal/date={date}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getByDate(@PathVariable("date") String date) {
        try {
            Iterable<Animal> animals = service.getByDate(date);
            return new ResponseEntity<>(animals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

}