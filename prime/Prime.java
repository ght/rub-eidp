class Prime {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: Pass number of primes to find as first argument.");
			return;
		}

		int num = Integer.parseInt(args[0]);
		
		if (num < 1) {
			System.out.println("Error: Number must be positive.");
			return;
		}

		int[] primes = [];
		int i = 0;

		while (primes.length < num) {
		}
	}
}
