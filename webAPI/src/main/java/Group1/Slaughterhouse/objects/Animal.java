package Group1.Slaughterhouse.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    private Long registrationNumber;

    @Column(name = "date")
    private String date;

    @Column(name = "weight")
    private double weight;

    @Column(name = "origin")
    private String origin;

    public Animal(String date, double weight, Long registrationNumber, String origin) {
        this.date = date;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.origin = origin;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

}