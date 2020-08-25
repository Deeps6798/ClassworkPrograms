package Conditional;

import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
int num1 , num2;

// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);

System.out.println("Enter the Frist Number: ");
num1 = s.nextInt();
System.out.println("Enter the Second Number: ");
num2 = s.nextInt();

int opr;
System.out.println("Enter the peration number /1:Add /2:Sub /3:Mul /4:Div ");
opr = s.nextInt();


int result =0;

switch(opr)
{
case 1:
result = num1 + num2 ;

break;
case 2:
result = num1 - num2 ;

break;
case 3:
result = num1 * num2 ;

break;
case 4:
result = num1 / num2 ;

}
System.out.println("Result is :"+result);
}
}


