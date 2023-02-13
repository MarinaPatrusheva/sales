public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(new int[]{23, 24, 56, 1});
        System.out.println(manager.max());
        System.out.println(manager.average());

    }
}