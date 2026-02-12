public class GarbageCollection {

    // Overriding finalize method
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {

        // Creating object
        GarbageCollection obj = new GarbageCollection();

        // Making object eligible for GC
        obj = null;

        // Requesting Garbage Collector
        System.gc();
    }
}
