public class Phone implements Lockable{
    @Override
    public void lock() {
        System.out.println("iPhone locked!");
    }

    Lockable phoneUnlock = () -> System.out.println("iPhone unlocked!");

    public void startProgram() {
        lock();
        phoneUnlock.lock();
        System.out.println();
    }
}
