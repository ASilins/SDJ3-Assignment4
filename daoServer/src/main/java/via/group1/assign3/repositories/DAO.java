package via.group1.assign3.repositories;

import org.springframework.stereotype.Repository;

import via.group1.assign3.protobuf.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DAO {

    private final String URL = "postgres://postgres:password@localHost:5432/slaughterhouse";
    private final String USER = "postgres";
    private final String PASSWORD = "password";

    private Connection connection;

    // Temp
    List<AnimalGrpc> animals = new ArrayList<>();

    private Connection connect() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public AnimalGrpc createAnimal(AnimalGrpc animal) {
        System.out.println("\nExecuted createAnimal");
        animals.add(animal);
        return animal;
    }

    public ListOfAnimals getAllAnimals() {
        System.out.println("\nExecuted getAllAnimals");
        return ListOfAnimals.newBuilder().addAllAnimals(animals).build();
    }

    public AnimalGrpc getById(int id) {
        System.out.println("\nExecuted getById");
        for (AnimalGrpc animalGrpc : animals) {
            if (animalGrpc.getRegNum() == id) {
                return animalGrpc;
            }
        }

        return null;
    }

    public ListOfAnimals getByOrigin(String origin) {
        System.out.println("\nExecuted getByOrigin");
        List<AnimalGrpc> temp = new ArrayList<>();

        for (AnimalGrpc animalGrpc : animals) {
            if (animalGrpc.getOrigin().equalsIgnoreCase(origin)) {
                temp.add(animalGrpc);
            }
        }

        return ListOfAnimals.newBuilder().addAllAnimals(temp).build();
    }

    public ListOfAnimals getByDate(String date) {
        System.out.println("\nExecuted getByDate");
        List<AnimalGrpc> temp = new ArrayList<>();

        for (AnimalGrpc animalGrpc : animals) {
            if (animalGrpc.getDate().equalsIgnoreCase(date)) {
                temp.add(animalGrpc);
            }
        }

        return ListOfAnimals.newBuilder().addAllAnimals(temp).build();
    }

    public InvolvedAnimals retrieveRegNums(ProductId request) {

        List<Integer> involvedAnimalsList = new ArrayList<>();

        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("select animal_id from parts_in_tray where product_id = " + request);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                involvedAnimalsList.add(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        InvolvedAnimals involvedAnimals = InvolvedAnimals.newBuilder().addAllIdOfAnimal(involvedAnimalsList).build();

        return involvedAnimals;
    }

    public InvolvedProducts retrieveProdNums(AnimalId request) {

        List<Integer> involvedProductsList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select intray.product_id from parts_in_tray intray join animal_part parts using (part_id) where parts.animal_id = "
                            + request);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                involvedProductsList.add(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        InvolvedProducts involvedProducts = InvolvedProducts.newBuilder().addAllIdOfProduct(involvedProductsList)
                .build();

        return involvedProducts;
    }

}
