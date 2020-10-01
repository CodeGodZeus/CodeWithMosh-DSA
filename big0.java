import java.util.*;
class Big
{
public void log(int []arr)
{
System.out.println(arr[0]);
}
}
//O(n)
import java.util.*;
class Big
{
public void log(int []arr)
{
System.out.println(arr[0]);  //O(1)
for(int numbers:arr)
{
System.out.println(numbers);//O(N)
}
System.out.println();//O(1)
}
}

//TC=O(N+2)
import java.util.*;
class Big
{
public void log(int []arr,String []arr1)
{
System.out.println(arr[0]);  //O(1)
for(int numbers:arr)
{
System.out.println(numbers);//O(N)
}
for(String name:arr1)
{
System.out.println(name);
}
System.out.println();//O(1)
}
}
TC=O(n+m)
if len(n)==len(m)
TC=o(n)

//O(n^2)

import java.util.*;
class Big
{
public void log(int []arr)
{
for(int i=0;i<arr.length;++)
{
for(int j=i+1;j<arr.length;j++)
{
System.out.println((arr[i],arr[j]);
}
}
}
}

//o(n^3)
for(int number:numbers)
   for(int number2:numbers)
       for(int number3:numbers)
             System.out.println(number1+number2+number3);
 //o(log n)
 int i=0
 int j=arr.length-1
 while(i<=j)
 {
 mid=(i+j)//2
 if(a[mid]==Target)
      System.out.println("found at mid");  //o(logn)
  elif(a[mid]>Target)
      j=mid-1
  else
      i=mid+1
 }
 
 //O(2^n)
 
public int  fact(int n)
if(n==0)
  return 0;
if(n==1)
  return 1;
else
  return n*fact(n-1);
  
  
--------------------------------------------Space---------------------Complexity------------------------------------------------------------------------
public void greet(int arr[])
{
String names[]=new String(names.length);  //0(n) space
{
for(int i=0;i<arr.length;i++)
{
}
}
}
