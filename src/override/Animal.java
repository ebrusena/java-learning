package override;

public class Animal {

    void move(){
        System.out.println("this animal is running.");
    }
    static void main(String[] args) {

        Dog dog= new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();


        dog.move();
        fish.move();
        cat.move();
    }

}
