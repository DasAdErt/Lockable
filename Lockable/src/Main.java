public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.startProgram();

        Safe safe = new Safe();
        safe.startProgram();

        Computer computer = new Computer();
        computer.startProgram();

        Phone phone = new Phone();
        phone.startProgram();
    }
}