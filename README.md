# implementation-to-compute-the-nth-Fibonacci-number
1. Consider the following class, which provides a simple (and not very efficient) implementation
to compute the nth Fibonacci number (https://en.wikipedia.org/wiki/Fibonacci number).
1
2
3 /**
4* Class with a static method to compute the n-th Fibonacci number fib(n)
5* for n >= 0 according to the definition
6*
7* fib(0) = 0
8* fib(1) = 1
9* fib(n) = fib(n-1) + fib(n-2) for n >= 2
10*/
11 public class Fibonacci {
12
13        /**
14        * Straightforward recursive implementation for the n-th Fibonacci number.
15        *
16        * @param n expected to be non-negative
17        * @return the value of the n-th Fibonacci number fib(n)
18        * @throws IllegalArgumentException if n < 0
19        */
20       public static long fib(int n) {
21          if (n < 0) {
22              throw new IllegalArgumentException("Illegal negative value " + n);
23          }
24          if (n == 0) {
25              return 0;
26          }
27          if (n == 1) {
28          return 1;
29          }
30          return fib(n-1) + fib(n-2);
31          }
32 }
   

Write a JUnit test suite for JUnit 5 (Jupiter) with suitable test case methods for Fibonacci.
Try to achieve test coverage for the method, i.e., try to come up with a set of test cases
that together cover all (reachable) code in the method. (This also includes testing that the
IllegalArgumentException is triggered.)
In particular, introduce test cases for the input 46 (expected result: 1836311903), one with
a timeout of 600 seconds and one with a timeout of 1 second (if the second test case passes,
1
you are using one fast machine!).
Write versions of the test cases for the input 46 both with assertTimeout and with
assertTimeoutPreemptively. What is the difference in behaviour for the test cases
with 1 second timeout?
