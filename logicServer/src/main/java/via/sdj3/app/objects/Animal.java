package via.sdj3.app.objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Animal {

    private int registrationNumber;
    private String date;
    private double weight;
    private String origin;

}
