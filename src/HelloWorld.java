/**
 * Created by IntelliJ IDEA.
 * User: Evan Marks
 * Date: 10/25/11
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld
{
    private static final String HelloWorldStr = "Hello World!";

    public void printStr()
    {
        System.out.println(HelloWorldStr);
    }

    public static void main(String[] args)
    {
        HelloWorld hw = new HelloWorld();
        hw.printStr();
    }
}
