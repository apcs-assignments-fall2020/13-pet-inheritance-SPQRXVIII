public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    public Dog(){
        setAge(0);
        setName("Jack");
        setBreed("none");
    }

    // Constructors
    public Dog(String name, int age, String breed) {
        setAge(age);
        setName(name);
        setBreed(breed);
       }

    // makeNoise() method
       public void makeNoise() {
        System.out.println("Woof!");
    }

    // toString method
    public String toString() {
        String str = "Name: " + getName() + ", Age: " + getAge()+", Breed: "+getBreed();
        return str;
    }


    // Getter
    public String getBreed() {
        return this.breed;
    }



    // Setter
    public void setBreed(String breed) {
        // Don't allow blank names
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }

}