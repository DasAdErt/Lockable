public class Computer implements Lockable{
    @Override
    public void lock() {
        System.out.println("Computer locked!");
    }

    Lockable computerUnlocked = new Lockable() {
        @Override
        public void lock() {
            System.out.println("Computer unlocked!");
        }
    };

    void startProgram() {
        lock();
        computerUnlocked.lock();
        System.out.println();
    }
}
