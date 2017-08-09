public class Main {
    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.main(new String[] {"Inside"});
        } catch (Exception e) {
            System.err.println("not found");

        }
        System.out.println("Hello World!");
    }
}
