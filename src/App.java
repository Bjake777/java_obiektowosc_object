public class App {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        Pet pies1 = new Pet("Burek", "pies", 10, "asdf");
        Pet pies2 = new Pet("Edi","pies", 4, "asdf");
        Pet pies3 = new Pet("Edi","pies", 4, "asdfasdf");

        animalShelter.add(pies1);
        animalShelter.add(pies2);
        animalShelter.add(pies3);

        animalShelter.dispalyAll();

        System.out.println(pies1.hashCode());
        System.out.println(pies2.hashCode());
        System.out.println(pies3.hashCode());
    }
    //kklasa pet;
    //stworzyc 3 pety
    // 2 eqals zwaca tru czy wabi sie tak samo, typ ten sam(pies), wiek taki sam,  ale opis innY
}
