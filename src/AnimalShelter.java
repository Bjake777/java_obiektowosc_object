import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Pet> pets;

    public AnimalShelter() {
        this.pets = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (!exists(pet)) {
            pets.add(pet);
        }
    }

    private boolean exists(Pet pet) {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).equals(pet)) {
                return true;
            }
        }
        return false;
    }

    public void dispalyAll() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

}
