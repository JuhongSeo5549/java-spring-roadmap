package src.poly.ex5;

import src.poly.ex2.Animal;

public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        InterfaceAnimal[] animal = {new Cat(), new Dog(), new Caw()};
        for (InterfaceAnimal animal1 : animal) {
            soundAnimal(animal1);
        }

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }

    //변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
