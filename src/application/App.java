package application;

import model.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import static model.entities.Person.filterBySex;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        do {
            System.out.println("Digite o nome e o sexo da pessoa separados por virgula , " +
                    "ou digite qualquer coisa para sair");

            var stringSplit = sc.next();
            String[] strings = stringSplit.split(",");
            var name = strings.length > 0 ? strings[0] : null;
            var sex = strings.length > 1 ? strings[1] : null;

            var person = new Person(name, sex);
            people.add(person);
            System.out.println(people);

            System.out.println("Gostaria de adicionar mais alguem na lista?");
        } while (sc.next().equalsIgnoreCase("Sim"));
        System.out.println("gostaria de filtrar sua lista por sexo?");

        if (sc.next().equalsIgnoreCase("sim")) {
            System.out.println("digte M para sexo masculino ou F para sexo feminino");
            String awsner = sc.next();
            Objects.requireNonNull(filterBySex(awsner, people))
                    .forEach(System.out::println);

                sc.close();
            }
        }


}