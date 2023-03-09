public class Safe implements Lockable{
    @Override
    public void lock() {
        System.out.println("Safe locked!");
    }

    Lockable safeUnlock = new Lockable() {
        @Override
        public void lock() {
            System.out.println("Safe unlocked!");
        }
    };

    void startProgram() {
        lock();
        safeUnlock.lock();
        System.out.println();
    }
}
