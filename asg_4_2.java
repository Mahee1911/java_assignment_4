//21CE029 : MAHEE GADHIYA
//PART : 4
//PRACTICAL : 2

import java.io.IOException;
public class asg_4_2  
{
void m()throws IOException
{
throw new IOException("device error"); //throw an exception
}
void n()throws IOException
{
m(); //call the m() method
}
void p()
{
try
{
n(); //call the n() method
}
catch(Exception e)
{
System.out.println(e);
} //catch the Exception
}
public static void main(String args[])
{
asg_4_2 obj=new asg_4_2();
obj.p();
System.out.println("Then Normal flow ");
}
}
