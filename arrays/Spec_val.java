class Spec_val
 {
    public static boolean containsValue(int[] arr, int value)
 {
        for (int num : arr)
 {
            if (num == value)
 return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};
        int value = 7;
        System.out.println("Array contains " + value + "" + containsValue(numbers, value));
    }
}
out put:
Array contains 3true
Array contains 7false
