
public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", "Golden Retriever");
        Dog dog2 = new Dog("Buddy", "Labrador");

        // Modificați proprietățile folosind setter-ele
        dog1.setName("Rex");
        dog2.setBreed("German Shepherd");

        // Afișați modificările folosind getter-ele
        System.out.println("Dog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
    }
}
