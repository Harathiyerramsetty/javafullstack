/*import java.util.Scanner;*/
class H1
{
public static void main(String [ ] args)
{
/*a
Scanner s= new Scanner(System.in);
System.out.println("Enetr the value:");
int  b = s.nextInt( );
int i,j;
for(i=0; i<b; i++)
{
for(j=0; j<b; j++)
{
System.out.print("*");
}
System.out.println( );
}
}
}
Enetr the value:
5
*****
*****
*****
*****
*****
*/
/*b
Scanner s= new Scanner(System.in);
System.out.println("Enetr the value:");
int  b = s.nextInt( );
int i,j;
for(i=1; i<=b; i++)
{
for(j=1; j<=b; j++)
{
System.out.print(j);
}
System.out.println( );
}
}
}
Enetr the value:
8
12345678
12345678
12345678
12345678
12345678
12345678
12345678
12345678
*/
/*c
Scanner s= new Scanner(System.in);
System.out.println("Enetr the value:");
int  b = s.nextInt( );
int i,j;
for(i=1; i<=b; i++)
{
for(j=1; j<=b; j++)
{
System.out.print(i);
}
System.out.println( );
}
}
}
Enetr the value:
7
1111111
2222222
3333333
4444444
5555555
6666666
7777777
*/
/*d
Scanner s= new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int b=1,i,j;
for(i=1;i<=a;i++){
for(j=1;j<=a;j++){
System.out.print(b+ " ");
b=b+2;
}
System.out.println();
}
}
}
Enter the value:
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49
*/
/*e
Scanner s= new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int b=1,i,j;
for(i=1;i<=a;i++){
for(j=1;j<=a;j++){
System.out.print(b++ + " ");
}
System.out.println();
}
}
}
Enter the value:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
/*f
Scanner s= new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int i,j;
for(i=1;i<=a;i++){
for(j=1;j<=a;j++){
System.out.print(j%2==0?"0":"1");
}
System.out.println();
}
}
}
Enter the value:
5
10101
10101
10101
10101
10101
*/
/*g
Scanner s= new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int i,j,k;
for(i=1;i<=a;i++){
for(j=1;j<=a-i;j++){
System.out.print(" ");
}
for(k=1;k<=i;k++){
System.out.print("*"+ " ");
}
System.out.println();
}
}
}
Enter the value:
5
    *
   * *
  * * *
 * * * *
* * * * *
*/
/*h
Scanner s= new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int i,j,k;
for(i=1;i<=a;i++){
for(j=1;j<=a-i;j++){
System.out.print(" ");
}
for(k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}
Enter the value:
5
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10
*/
/*i
{
System.out.println("I");
System.out.println("IN");
System.out.println("IND");
System.out.println("INDI");
System.out.println("INDIA");
}
}
}
I
IN
IND
INDI
INDIA
*/

/*j
int size = 5;
for (int i = 1; i <= size; i++)
{
for (int j = 1; j <= size; j++)
{
if (i == 1 || i == size || j == 1 || j == size)
{
System.out.print("* ");
} else {
System.out.print("  ");
}
}
System.out.println();
}
}
}
* * * * *
*          *
*          *
*          *
* * * * *
*/


/*k
int n = 4;
for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
       *
     * * *
   * * * * *
* * * * * * *
   * * * * *
     * * *
        *
*/
/*l
int n = 4;
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.print("*");
           if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++)

                System.out.print(" ");
             System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   *
  * *
 *   *
*     *
 *   *
  * *
   *
*/



/*m
int n = 7;
 int mid = n / 2;
 for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
  if (i == mid || j == mid) {
  System.out.print("*");
  } else {
 System.out.print(" ");
 }
 }
System.out.println();
 }
}
}
   *
   *
   *
*******
   *
   *
   *
*/

/*n
 int n = 7;
 for (int i = 1; i <= n; i++)
 {
 for (int j = 1; j <= n; j++)
{
 if (j == i || j == n - i + 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
 }
}
}
*     *
 *   *
  * *
   *
  * *
 *   *
*     *
*/


/*o
int n = 5;
for (int i = 0; i <= n; i++)
{
for (int j = 0; j < i; j++)
System.out.print("*");
System.out.println(i);
}
}
}
0
*1
**2
***3
****4
*****5
*/














