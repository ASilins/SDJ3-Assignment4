package Group1.Slaughterhouse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Group1.Slaughterhouse.objects.Animal;
import Group1.Slaughterhouse.service.InvolvedService;

@RestController
@RequestMapping("/involved")
public class InvolvedController {

    private InvolvedService service;

    public InvolvedController(InvolvedService service) {
        this.service = service;
    }

    @GetMapping(value = "/animal={id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> retrieveInvolvedAnimals(@PathVariable("id") int id) {
        try {
            Iterable<Animal> animals = service.retrieveInvolvedAnimals(id);
            return new ResponseEntity<>(animals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/product={id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> retrieveInvolvedProducts(@PathVariable("id") int id) {
        try {
            Iterable<Integer> products = service.retrieveInvolvedProducts(id);
            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

}
