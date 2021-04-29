import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
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
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
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
        if (N % 2 == 0) {
            System.out.println(N >= 2 && N <= 5 || N > 20 ? "Not Weird" : "Weird");
        } else {
            System.out.println("Weird");
        }
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

    /*
    Java Datatypes
     */
    public void javaDatatypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -1 * Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (x >= -1 * Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (x >= -1 * Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    /*
    Java End-of-file
     */
    public void javaEndOfFile() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNext()) {
            System.out.println(counter++ + " " + scanner.nextLine());
        }
    }

    /*
    Java Static Initializer Block
     */
    private final static Scanner scanner = new Scanner(System.in);
    private final static int B = scanner.nextInt();
    private final static int H = scanner.nextInt();
    private final static boolean flag = B > 0 && H > 0;

    static {
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    /*
    Java Int to String
     */
    public void javaIntToString() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String s = String.valueOf(n);
    }

    /*
    Java Date and Time
     */
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        return formatter.format(cal.getTime()).toUpperCase();
    }
    
    /*
    Java Currency Formatter
     */
    public void javaCurrencyFormatter() {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale locale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(locale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
    
    /*
    Java Strings Introduction
     */
    public void javaStringsIntroduction() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        String modA = A.substring(0, 1).toUpperCase().concat(A.substring(1));
        String modB = B.substring(0, 1).toUpperCase().concat(B.substring(1));
        System.out.printf("%s %s", modA, modB);
        sc.close();
    }
    
    /*
    Java Substring
     */
    public void javaSubstring() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }

}