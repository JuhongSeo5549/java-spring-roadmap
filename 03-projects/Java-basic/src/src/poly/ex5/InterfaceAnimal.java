package src.poly.ex5;

public interface InterfaceAnimal {
    void sound(); //public abstract
    void move();  //public abstract

    // java8 부터 가능
    default void abc() {
        System.out.println("123123");
    };

    // 자바 9부터 가능
    private void ccc() {
        System.out.println("12312321323");
    };
}
