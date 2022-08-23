private int[] getPrimes(int target) {
    List<Integer> primes = new ArrayList<Integer>();
    primes.add(2);
    for (int i = 3; i < target ;i++ ) {
        boolean isPrime = true;
        for (int j = 0; primes.get(j) * primes.get(j) < i; j++) {
            if (i % primes.get(j) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            primes.add(i);
        }
    }
    return primes.stream().mapToInt(i->i).toArray();
}