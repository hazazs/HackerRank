import java.util.Scanner;

public class HackerRank {
    
    /*
    Welcome to Java!
     */
    public void welcomeToJava() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
    
    /*
    Java Stdin and Stdout I
     */
    public void javaStdinAndStdoutI() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }
    
    /*
    Java Stdin and Stdout II
     */
    public void javaStdinAndStdoutII() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
    
    /*
    Java Loops I
     */
    public void javaLoopsI() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++)
            System.out.println(N + " x " + i + " = " + N*i);
        scanner.close();
    }
    
    /*
    Java Loops II
     */
    public void javaLoopsII() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
    
    /*
    Java If-Else
     */
    public void javaIfElse() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2 == 0)
            System.out.println(N >= 2 && N <= 5 || N > 20 ? "Not Weird" : "Weird");
        else System.out.println("Weird");
        scanner.close();
    }
    
    /*
    Java Output Formatting
     */
    public void javaOutputFormatting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15.15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
    
}