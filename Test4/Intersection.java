import java.util.Arrays;

public class Intersection {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Sort both arrays to make the intersection process easier
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection[k++] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Trim the intersection array if necessary
        return Arrays.copyOf(intersection, k);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection of arrays: " + Arrays.toString(intersection));
    }
}
