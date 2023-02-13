public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new long[]{23, 24, 56, 1, 24, 77, 54});
        System.out.println(manager.max());
        System.out.println(manager.average());

    }
}