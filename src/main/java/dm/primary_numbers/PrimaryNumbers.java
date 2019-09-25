package dm.primary_numbers;

import java.util.ArrayList;
import java.util.List;

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

    int i = 0;
    while (n > list.size()) {
        i++;
        if (isItPrime(i)) {
            list.add(i);
        }
    }
    return list;
    }
}

