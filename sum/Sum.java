class Summiere {
	public static void main(String[] args)
	{
		if (args.length != 1) {
			System.out.println("Error: Expected exactly 1 argument");
			return;
		}

		int sum = 0;
		int last = Integer.parseInt(args[0]);

		for (int i = 1; i <= last; ++i)
			sum += i;

		System.out.println("Sum of integers from 1 to " + last + " is: " + sum);
	}
}
