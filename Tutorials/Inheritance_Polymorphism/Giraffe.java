public class Giraffe extends Animal {

    public Giraffe(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just booed!");
    }

}
