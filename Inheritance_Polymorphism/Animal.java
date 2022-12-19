public class Animal {

    protected String picture;
    protected int age;
    protected String name;

    public Animal (String picture, String name, int age) {
        this.picture = picture;
        this.age = age;
        this.name = name;
    }

    public void birthday() {
        this.age++;
    }

    public void makeSound() {
        System.out.println(this.name + " just made a sound!");
    }
}
