package com.learnJava.Hackerrankquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class q6 {






        public static List<String> fetchItemsToDisplay(String[][] items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
            Comparator<String[]> comparator = (a, b) -> Integer.compare(Integer.parseInt(a[sortParameter]), Integer.parseInt(b[sortParameter]));
            if (sortOrder == 1) {
                comparator = comparator.reversed();
            }
            //System.out.println(comparator);
            Arrays.sort(items, comparator);

            int startIndex = pageNumber * itemsPerPage;
            int endIndex = Math.min(startIndex + itemsPerPage, items.length);


            return Arrays.stream(items, startIndex, endIndex)
                    .map(item -> item[0])
                    .collect(Collectors.toList());
        }

        public static void main(String[] args) {
            String[][] items = {{"item1", "1", "15"}, {"item2", "3", "4"}, {"item3", "17", "81"}};
            int sortParameter = 1;
            int sortOrder = 0;
            int itemsPerPage = 2;
            int pageNumber = 1;
            List<String> result = fetchItemsToDisplay(items, sortParameter, sortOrder, itemsPerPage, pageNumber);
            System.out.println(result);
        }

    }



