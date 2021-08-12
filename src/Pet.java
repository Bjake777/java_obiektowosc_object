import java.util.Objects;

public class Pet {
    private String name;
    private String type;
    private int age;
    private String description;

    public Pet(String name, String type, int age, String description) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name) && Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age);
    }
}
