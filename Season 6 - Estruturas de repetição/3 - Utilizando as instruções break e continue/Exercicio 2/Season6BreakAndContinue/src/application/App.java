package application;

public class App {

    public static void main(String[] args) {
        String str = "www.oracle.com";
        int max = str.length();
        int count = 0;

        while (count < max) {
            if (str.charAt(count) != 'w') {
                continue;
            }
            count++;
        }
        System.out.println("Counting w : " + count);
    }
}
