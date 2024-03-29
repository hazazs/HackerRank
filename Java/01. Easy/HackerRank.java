public class HackerRank {

	/*
	 * Welcome to Java!
	 */
	public void welcomeToJava() {
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");
	}

	/*
	 * Java Stdin and Stdout I
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
	 * Java Stdin and Stdout II
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
	 * Java Loops I
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
	 * Java Loops II
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
	 * Java If-Else
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
	 * Java Output Formatting
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
	 * Java Datatypes
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
	 * Java End-of-file
	 */
	public void javaEndOfFile() {
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (scanner.hasNext()) {
			System.out.println(counter++ + " " + scanner.nextLine());
		}
		scanner.close();
	}

	/*
	 * Java Static Initializer Block
	 */
	private final static Scanner scanner = new Scanner(System.in);
	private final static int B = scanner.nextInt();
	private final static int H = scanner.nextInt();
	private final static boolean FLAG = B > 0 && H > 0;

	static {
		if (!FLAG) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	/*
	 * Java Int to String
	 */
	public void javaIntToString() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		String s = String.valueOf(n);
	}

	/*
	 * Java Date and Time
	 */
	public static String findDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);
		DateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
		return formatter.format(cal.getTime()).toUpperCase();
	}

	/*
	 * Java Currency Formatter
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
	 * Java Strings Introduction
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
	 * Java Substring
	 */
	public void javaSubstring() {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		System.out.println(S.substring(start, end));
	}

	/*
	 * Java Substring Comparisons
	 */
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = "";
		for (int i = 0; i < s.length() - (k - 1); i++) {
			if (smallest.compareTo(s.substring(i, i + k)) > 0) {
				smallest = s.substring(i, i + k);
			}
			if (largest.compareTo(s.substring(i, i + k)) < 0) {
				largest = s.substring(i, i + k);
			}
		}
		return String.format("%s%n%s", smallest, largest);
	}

	/*
	 * Java String Reverse
	 */
	public void javaStringReverse() {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		boolean isEqual = new StringBuilder(A).reverse().toString().equals(A);
		System.out.println(isEqual ? "Yes" : "No");
		sc.close();
	}

	/*
	 * Java Anagrams
	 */
	static boolean isAnagram(String a, String b) {
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				b = b.replaceFirst("(?i)".concat(a.substring(i, i + 1)), "");
			}
			return b.isEmpty();
		}
		return false;
	}

	/*
	 * Java String Tokens
	 */
	public void javaStringTokens() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		String[] tokens = s.isEmpty() ? new String[0] : s.split("[^A-Za-z]+");
		System.out.println(tokens.length);
		for (String token : tokens) {
			System.out.println(token);
		}
		scan.close();
	}

	/*
	 * Pattern Syntax Checker
	 */
	public void patternSyntaxChecker() {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases-- > 0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException ex) {
				System.out.println("Invalid");
			}
		}
		in.close();
	}

	/*
	 * Valid Username Regular Expression
	 */
	class UsernameValidator {

		public static final String PATTERN = "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";

		private UsernameValidator() {
		}

	}

	/*
	 * Java Primality Test
	 */
	public void javaPrimalityTest() {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		System.out.println(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
		scanner.close();
	}

	/*
	 * Java BigInteger
	 */
	public void javaBigInteger() {
		Scanner scanner = new Scanner(System.in);
		BigInteger a = new BigInteger(scanner.nextLine());
		BigInteger b = new BigInteger(scanner.nextLine());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		scanner.close();
	}

	/*
	 * Java 1D Array
	 */
	public void java1DArray() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
	}

	/*
	 * Java 2D Array
	 */
	public void java2DArray() {
		int[][] arr = new int[6][6];
		int maxHourglassSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				maxHourglassSum = Math.max(maxHourglassSum, arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
						+ arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
			}
		}
		System.out.println(maxHourglassSum);
	}

	/*
	 * Java Subarray
	 */
	public void javaSubarray() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int numberOfNegativeSums = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum < 0) {
					numberOfNegativeSums++;
				}
			}
		}
		System.out.println(numberOfNegativeSums);
		scanner.close();
	}

	/*
	 * Java Arraylist
	 */
	public void javaArraylist() {
		Scanner scanner = new Scanner(System.in);
		List<int[]> list = new ArrayList<>();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int[] arr = new int[scanner.nextInt()];
			for (int j = 0; j < arr.length; arr[j++] = scanner.nextInt()) {
			}
			list.add(arr);
		}
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			try {
				int x = scanner.nextInt() - 1;
				int y = scanner.nextInt() - 1;
				System.out.println(list.get(x)[y]);
			} catch (IndexOutOfBoundsException x) {
				System.out.println("ERROR!");
			}
		}
		scanner.close();
	}

	/*
	 * Java List
	 */
	public void javaList() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			if (scanner.next().equals("Insert")) {
				list.add(scanner.nextInt(), scanner.nextInt());
			} else {
				list.remove(scanner.nextInt());
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
		scanner.close();
	}

	/*
	 * Java Map
	 */
	public void javaMap() {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			if (!map.containsKey(name)) {
				map.put(name, scanner.nextInt());
			} else {
				scanner.nextInt();
			}
		}
		scanner.nextLine();
		while (scanner.hasNext()) {
			String name = scanner.nextLine();
			if (map.containsKey(name)) {
				System.out.printf("%s=%d%n", name, map.get(name));
			} else {
				System.out.println("Not found");
			}
		}
		scanner.close();
	}

	/*
	 * Java Hashset
	 */
	public void javaHashset() {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		Set<String> set = new HashSet<>();
		for (int i = 0; i < t; i++) {
			set.add(String.format("%s %s", pair_left[i], pair_right[i]));
			System.out.println(set.size());
		}
	}

	/*
	 * Java Generics
	 */
	public <T extends Object> void printArray(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}

	/*
	 * Java Sort
	 */
	public void javaSort() {
		try (Scanner in = new Scanner(System.in)) {
			int testCases = in.nextInt();
			List<Student> studentList = new ArrayList<>(testCases);
			while (testCases-- > 0) {
				int id = in.nextInt();
				String fname = in.next();
				double cgpa = in.nextDouble();
				studentList.add(new Student(id, fname, cgpa));
			}
			studentList.sort(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
					.thenComparing(Student::getId));
			studentList.forEach(s -> System.out.println(s.getFname()));
		}
	}

	/*
	 * Java BitSet
	 */
	public void javaBitSet() {
		try (Scanner scanner = new Scanner(System.in)) {
			int length = scanner.nextInt();
			BitSet b1 = new BitSet(length);
			BitSet b2 = new BitSet(length);
			int operations = scanner.nextInt();
			for (int i = 0; i < operations; i++) {
				switch (scanner.next()) {
				case "AND":
					if (scanner.nextInt() == 1) {
						b1.and(b2);
					} else {
						b2.and(b1);
					}
					scanner.nextLine();
					break;
				case "OR":
					if (scanner.nextInt() == 1) {
						b1.or(b2);
					} else {
						b2.or(b1);
					}
					scanner.nextLine();
					break;
				case "XOR":
					if (scanner.nextInt() == 1) {
						b1.xor(b2);
					} else {
						b2.xor(b1);
					}
					scanner.nextLine();
					break;
				case "SET":
					if (scanner.nextInt() == 1) {
						b1.set(scanner.nextInt());
					} else {
						b2.set(scanner.nextInt());
					}
					break;
				case "FLIP":
					if (scanner.nextInt() == 1) {
						b1.flip(scanner.nextInt());
					} else {
						b2.flip(scanner.nextInt());
					}
					break;
				}
				System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
			}
		}
	}

}