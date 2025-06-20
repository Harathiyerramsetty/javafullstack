import java.util.Arrays;
class Copyarray
 {
    public static  int[ ] copyArray(int[] arr)
    {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
    {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String[] args) 
   {
        int[] numbers = {5,3,8,7,4,8};
        int[] copied = copyArray(numbers);
        System.out.println("Original: " +Arrays.toString(numbers));
        System.out.println("Copied: " +Arrays.toString(copied));
    }
}
OUT PUT:
Original: [5, 3, 8, 7, 4, 8]
Copied: [5, 3, 8, 7, 4, 8]