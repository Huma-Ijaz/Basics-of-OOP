class Animal {
    void makeSound() {
        System.out.println("Generic Sound");
    }
}

    class Dog extends Animal {
        void makeSound() {
            System.out.println("Woof!");
        }
    }


    public class Q1 {
    public static void main(String[] args) {
        Dog c1 = new Dog();
        c1.makeSound();
    }
}
