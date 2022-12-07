package lesson04.hw04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {

    private Map<Person, List<Pet>> club = new LinkedHashMap<>();

    public void addPerson(Person person) {
        club.put(person, new ArrayList<>());
    }

    public void addPetToPerson(Person person, Pet pet) {

        List<Pet> pets = club.get(person);
        pets.add(pet);

        club.put(person, pets);
    }

    public void deletePetFromPerson(Pet pet, Person person) {
        club.get(person).remove(pet);
    }

    public void deletePerson(Person person) {
        club.remove(person);
    }

    public void deletePetFromAllPersons(Pet pet) {
        club.entrySet().forEach(
                entry -> entry.setValue(
                        entry.getValue().stream().filter(
                                pet1 -> !pet1.equals(pet)
                        ).toList()
                )
        );
    }

}
