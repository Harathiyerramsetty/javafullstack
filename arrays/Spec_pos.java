import java.util.Arrays;
 class Spec_pos {
    public static int[] insertElement(int[] arr, int index, int value) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Invalid index");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {15,7,2, 3, 9, 1, 6};
        int index = 2;
        int value = 8;
        int[] result = insertElement(numbers, index, value);
        System.out.println("After inserting " + value + " at index " + index + ": " + Arrays.toString(result));
    }
}
out put:
After inserting 8 at index 2: [15, 7, 8, 2, 3, 9, 1, 6]