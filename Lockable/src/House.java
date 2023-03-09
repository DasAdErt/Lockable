public class House implements Lockable{
    @Override
    public void lock() {
        System.out.println("House locked!");
    }

    Lockable houseUnlock = new Lockable() {
        @Override
        public void lock() {
            System.out.println("House unlocked!")
        }
    };

    void startProgram() {
        lock();
        houseUnlock.lock();
        System.out.println();
    }
}
