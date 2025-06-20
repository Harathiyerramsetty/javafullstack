class Index
{
public static int findIndex(int[] arr, int value)
{
for (int i=0;i<arr.length;i++)
{
if (arr[i]== value)return i;
}
return -1;
}
public static void main(String [] agrs)
{
int[] numbers = {2,4,6,8,7};
int value=8;
int index= findIndex(numbers,value);
if (index != -1)
{
System.out.println("Index of" +value+ ":" +index);
}
else
{
System.out.println(value+ " not found in array");
}
}
}
out put:
Index of8:3