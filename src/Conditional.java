public class Conditional {
    public static void main(String[] args) {
        int a = 1;

        if (a == 0) {
            System.out.println("Number is ZERO");
        } else if (a == 1) {
            System.out.println("Number is ONE");
        } else {
            System.out.println("Number is UNKNOWN");
        }

        // SWITCH is little faster than if-else ladder since, in SWITCH statement, we directly jump on matching CASE

        switch (a) {
            case 0:
                System.out.println("Number is ZERO");
                break;
            case 1:
                System.out.println("Number is ONE");
                break;
            default:
                System.out.println("Number is UNKNOWN");
        }
    }
    public void HelloWorld() {
        System.out.println("Hello from Conditional class");
    }
}
