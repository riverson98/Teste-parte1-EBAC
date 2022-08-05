package model.entities;

import java.util.List;
import java.util.stream.Collectors;

public record Person(
        String name,
        String sex
) {
    public static List<Person> filterBySex(String letter, List<Person> people) {
        if (letter.equalsIgnoreCase("F")) {
            return people.stream()
                    .filter(it -> it.sex()
                            .equalsIgnoreCase("Feminino"))
                    .collect(Collectors.toList());
        }
        if (letter.equalsIgnoreCase("M")) {
            return people.stream()
                    .filter(it -> it.sex()
                            .equalsIgnoreCase("Masculino"))
                    .collect(Collectors.toList());
        }
        return null;
    }
}
