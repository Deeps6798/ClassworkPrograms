package Conditional;

public class Grade {


public static void main(String[] args) {

int marathi=80, hindi=85, english=90, sanskrit=80, history=75, sum;
float per;
sum= marathi+hindi+english+sanskrit+history;
System.out.println("The sum of marks is " +sum);
per= sum/5;

System.out.println("The percentage is " +per);
if(per>=90)
{
System.out.println("Grade A");
}
else if(per>=80)
{
System.out.println("Grade B");
}
else if(per>=70)
{
System.out.println("Grade C");
}
else if(per>=60)
{
System.out.println("Grade D");
}
else if(per>=40)
{
System.out.println("Grade E");
}
else{
System.out.println("Grade F");
}
}

}