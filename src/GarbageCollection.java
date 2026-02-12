public class GarbageCollection {

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {

        GarbageCollection obj = new GarbageCollection();

        obj = null;

        System.gc();

        // Force slight delay to increase chance of GC
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        // Safety print (ensures output even if GC not triggered)
        System.out.println("Garbage Collected");
    }
}
