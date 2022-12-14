public class Dog extends Animal {

    protected static final int dogToHumanYearMultiplier = 7;

    public Dog (String picture, String name, int age) {
        super(picture, name, age);
    }

    public int getHumanfromDogYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    public static void outputDog(Dog dog) {
        System.out.println(dog.name);
        System.out.println(dog.age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just woofed!");
    }
}