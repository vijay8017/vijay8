import java.util.scanner;
public class Calculator 
{
public static void main(string[] args
{
scanner input=new scanner(system.in)
doule num1,num2;
system.out.println("Enter first num");
num1=input.nextdouble();
system.out.println("enter second num");
num2=input.nextdouble();
system.out.println("Enter operator(+,*,-,/):
char operator =input.next().charAt;
double result;
switch (operator) 
{
case "+":
result =num1+num2;
break;
case "-";
resut=num1-num2;
break;
case "*";
result=num1*num2;
break;
case "/";
result=num1/num2;
break;
default:
system.out.println("invalid");
return;
}
system.out.println(num1 +""+operator+""+num2+"="+result);
}
}