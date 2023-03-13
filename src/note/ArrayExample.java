package note;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] ArrayToString = {"Vova", "Petja"};
        int[][] ArrayDeepToString = {{12, 23}, {212, 43}};
        int[] ArraySort = {5, 3, 13, 7, 1};
        Arrays.sort(ArraySort); // sort array  A >> Z
//        import org.apache.commons.lang3.ArrayUtils;
//        Arrays.reverse(ArraySort); // sort array Z >> A
        System.out.println("Print: " + Arrays.toString(ArrayToString)); // одномерный массив
        System.out.println("DeepToString: " + Arrays.deepToString(ArrayDeepToString)); // многомерный массив
        System.out.println("Sort: " + Arrays.toString(ArraySort));
        int pos1  = Arrays.binarySearch(ArraySort, 2); // перед тем как использовать binarySearch() надо сортировать массив
        System.out.println("указывает место индекс где могло быть число в массиве" + pos1);


        int[]  arraySource = {345, 456, 675, 8678, 56456, 423, 345, 6456};
        int[]  arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("ArraySource" + Arrays.toString(arraySource));
        System.out.println("ArrayDestination" + Arrays.toString(arrayDestination));
        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("ArraySource" + Arrays.toString(arraySource));
        System.out.println("ArrayDestination скопировалось со 2 индекса длинна 3" + Arrays.toString(arrayDestination));
        // зажимай контрол наводи на методы



    }

}
