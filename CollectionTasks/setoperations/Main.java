package CollectionTasks.setoperations;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> storage = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- > 0) {
            storage = new TreeSet<>();
            int Q = scanner.nextInt();
            scanner.nextLine();

            while (Q-- > 0) {
                String queryString = scanner.nextLine();
                char flag = queryString.charAt(0);
                Integer entry = null;
                if (queryString.length() > 1) {
                    entry = Integer.parseInt(queryString.substring(1).trim());
                }
                if (flag == 'a') {
                    // add the entry to the storage
                    storage.add(entry);
                } else if (flag == 'b') {
                    // print the storage
                    System.out.println(storage);
                } else if (flag == 'c') {
                    // remove the entry from the storage
                    storage.remove(entry);
                } else if (flag == 'd') {
                    // check entry presence
                    if (storage.contains(entry)) System.out.println(1);
                    else System.out.println(-1);
                } else if (flag == 'e') {
                    // print the storage size
                    System.out.println(storage.size());
                }
            }
        }

        scanner.close();
    }
}

/*
2
6
a 1
a 2
a 3
b
c 2
b
5
a 1
a 5
e
d 5
d 2



 */