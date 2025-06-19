1./*class Loop
{
public static void main(String [ ] args)
{
for (int i=0;i<10;i++)
{
System.out.println("Bright It Career");
}
}
}
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
*/



2./*int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
*/



3./*import java.util.Scanner;
class Loop
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter value");
int a=s.nextInt();
int target=a;
for(int i=0;i<=a;i++)
{
if(i==target)
{
System.out.println(i+"is equal to"+target);
}
else
{
System.out.println(i+"is  not equal to"+target);
}
}
}
}
*/



4./*import java.util.Scanner;
class Loop
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter value");
int i=s.nextInt();
if(i%2==0)
{
System.out.println("Number is even"+i);
}
else
{
System.out.println(" Number is odd"+i);
}
}
}
8
Number is even8



5./*
import java.util.Scanner;
class Loop
{
public static void main(String [] args)
{
Scanner s =new Scanner(System.in);
System.out.print("Enter the number:");
int num=s.nextInt();
System.out.print("Enter the second number:");
int num2=s.nextInt();
System.out.print("Enter the third number:");
int num3=s.nextInt();
int [] numbers = { num1,num2,num3};
int largest = numbers[0];
for(int i=1; i < numbers.length;i++)
{
if(numbers[i]>largest)
{
largest=numbers[i];
}
}
System.out.println("the largest number is:"+largest);
}
}
nter the first number:8
Enter the second number:7
Enter the third number:2
the largest number is:8
*/



6./*
int a = 10;
while(a<=100)
{
if(a%2==0)
{
System.out.println(a);
}
a++;
}
}
}
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100
*/



7./*
int a=1;
do
{
System.out.println(a);
a++;
}
while(a<=10);
}
}
1
2
3
4
5
6
7
8
9
10
*/



8./*
int originalNum = num;
int sum=0;
int digits=0;
int temp = num;
while(temp!=0)
{
temp/=10;
digits++;
}
temp=num;
while(temp!=0)
{
int remainder=temp%10;
sum += Math.pow(remainder,digits);
temp/=10;
}
if(sum == originalNum)
{
System.out.println(originalNum +"is an armstrong number");
}
else
{
System.out.println(originalNum +"is not an armstrong number");
}
}
}
Enter the number:78
78is not an armstrong number
Enter the number:371
371is an armstrong number
*/



9./*
if(num <= 1)
{
System.out.println(num+"is not a prime number");
return;
}
boolean isPrime = true;
int i =2;
while(i<=num/2)
{
if(num%i==0)
{
isPrime=false;
break;
}
i++;
}
if(isPrime)
{
System.out.println(num+"is a prime number");
}
else
{ 
System.out.println(num+"is not a prime number");
}
}
}
4is not a prime number
3is a prime number
*/



10./*import java.util.Scanner;
class Loop
{
public static void main(String [] args)
{
Scanner s =new Scanner(System.in);
System.out.print("Enter the number:");
int num=s.nextInt();*/
/*
int originalNum = num;
int reversedNum = 0;
int remainder;
while(num !=0)
{
remainder = num%10;
reversedNum = reversedNum *10+remainder;
num /=10;
}
if(originalNum == reversedNum){
  System.out.println(originalNum + "is a palindrome");
}
else
{
System.out.println(originalNum + " is not  a palindrome");
}
}
}
313is a palindrome
371 is not  a palindrome
*/




11./*
switch (num %2)
{
case 0:
System.out.println(num + "is Even");
break;
case 1:
System.out.println(num + "is Odd");
break;
default:
System.out.println("Invalid input");
}
s.close();
}
}

2is Even
3is Odd
*/




12./*
System.out.println("Enter m or f");
char ch = s.next().charAt(0);
switch (ch)
{
case 'f':
System.out.println("Female");
break;
case 'm':
System.out.println("male");
break;
default:
System.out.println("Invalid input");
}
}
}
Enter m of f
m
male
f
Female
*/




13./*
class Loop{
public static void main(String[] args)
{
int a = 70;
int b = 80;
int c = 53;
if (a > b && a > c)
{
System.out.println("Largest number is: " + a);
} else if (b > a && b > c)
{
System.out.println("Largest number is: " + b);
} else {
System.out.println("Largest number is: " + c);
}
}
}
*/









