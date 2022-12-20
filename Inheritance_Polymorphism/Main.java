public class Main {
    public static void main(String[] args) {
        Dog mable = new Dog("Mable.png", "Mable", 2);
        Dog frieda = new Dog("Frieda.png", "Frieda", 3);

        Cat kiwi = new Cat("Kiwi.png", "Kiwi", 0);
        Cat olive = new Cat("Olive.png", "Olive", 0);

        Giraffe gerald = new Giraffe("gerald.png", "Gerald", 12);

        int age = olive.age;

        kiwi.birthday();

        olive.makeSound();
        kiwi.makeSound();
        mable.makeSound();
        frieda.makeSound();
        gerald.makeSound();
    }
}
