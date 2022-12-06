public class Main {

    public static void start() {
        int res = Encoding.firstMarker();

        if (res == 0) {
            System.out.println("No Marker found with this length");
            return;
        }
        System.out.println(res);
        return;
    }

    public static void main(String[] args) {
        start();
        return;
    }

}