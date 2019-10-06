package dm.primary_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class PrimaryNumbers {

    public boolean isItPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> primes(int n) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> numbers2 = numbers.subList(0, 4);
        List<Integer> numbers3 = numbers.subList(4, 8);
        List<Integer> numbers4 = numbers.subList(8, 12);
        List<Integer> numbers5 = numbers.subList(12, 15);

            ExecutorService executorService = Executors.newFixedThreadPool(4);
            executorService.submit(() -> {
                for (Integer number : numbers2) {
                    if (isItPrime(number)) {
                        list.add(number);
                    }
                }
            });
            executorService.submit(() -> {
                for (Integer number1 : numbers3) {
                    if (isItPrime(number1)) {
                        list.add(number1);
                    }
                }
            });
            executorService.submit(() -> {
                for (Integer number1 : numbers4) {
                    if (isItPrime(number1)) {
                        list.add(number1);
                    }
                }
            });
            executorService.submit(() -> {
                for (Integer number1 : numbers5) {
                    if (isItPrime(number1)) {
                        list.add(number1);
                    }
                }
            });

//        List<Integer> x = new ArrayList<Integer>();
//        x.add(1);
//        x.subList(0, 4);
//        ScheduledExecutorService executorService = Executors.newFixedThreadPool(4);
//        for (int i = 0; i<4; i++) {
//            executorService.submit(() -> {
//                for (int number : mySublist) {
//                    if (isItPrime(number)) {
//                        list.add(number);
//                    }
//                }
//            })
//        }

//        int i = 0;
//    while (n > list.size()) {
//        i++;
//        if (isItPrime(i)) {
//            list.add(i);
//        }
//    }
    return list;
    }
}

