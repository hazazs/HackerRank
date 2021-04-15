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
    
}