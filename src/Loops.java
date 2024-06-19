public class Loops {
    public static void main (String[] args) {
        int i = 1;
        int n = 5;

        // while loop
        while (i < n) {
            System.out.println("while loop: " + i);
            i++;
        }

        // do-while loop
        i = 1;
        do {
            System.out.println("do-while loop: " + i);
            i++;
        } while (i < n);

        // for loop
        for (i = 1; i < n; i++) {
            System.out.println("for loop: " + i);
        }
    }
    public void HelloWorld () {
        System.out.println("Hello from Loops class");
    }
}
