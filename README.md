# primary_numbers

Moving on to Prime numbers: A Prime number is any number greater than 1 that has two unique factors: itself and 1.
Prime: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.  Not prime: 4 (divisible by 2 as well as 4 and 1), 6 (divisible by 3),
8 (divisible by 2, 4), 10 (divisible by 5, 10).

Write an iterative function with signature public boolean isPrime(int n) that returns true if a number is prime,
and false if it is not.  Ensure that you use TDD when writing this iterative function.  Hint: start at 0, 1, 2, 3, 4,
and see if they can be divided by any previous number in the list with no remainder
At what point can you stop checking if your candidate prime is divisible by other numbers?

Write another function, with signature public List<Integer> primes(int n) which returns the first n prime numbers.

Given your list of candidate primes in the primes function, divide it into four lists of equal length and use a
ThreadPoolExecutor of size 4 to execute isPrime in parallel.

* How much does this speed up your primes method?
* How much would you expect it to speed up your primes method?

Memoize the isPrime function such that it caches known previous Prime values.
* If you run your unit tests multiple times, do you get the same value?
* If you don’t get the same value, use the synchronized keyword in the appropriate place to ensure that you do.