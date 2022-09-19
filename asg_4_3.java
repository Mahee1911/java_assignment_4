//21CE029 : MAHEE GADHIYAZ
//PART : 4
//PRACTICAL : 1
import java.util.*;
class asg_4_3
{
public static void main(String ...arg)
{
try
{
System.out.println("Try block");
int [] arr= new int[4];
int i= arr[4];
} //Exception
catch(ArithmeticException e) //catch block 2
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e) //catch block 2
{
System.out.println(e);
}
finally //finally block
{
System.out.println("This is finally block");
}
}
}