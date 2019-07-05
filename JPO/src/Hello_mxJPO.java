import matrix.db.*;
import java.io.*;
import java.util.*;
public class ${CLASSNAME}
{
public ${CLASSNAME} () {
}
public ${CLASSNAME} (Context context, String[] args) throws
Exception
{
}
public void testing(Context context, String []args) throws
Exception
{
	System.out.println("Enter your name");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	System.out.println("Your Name is "+name);
	/*
	BufferedWriter writer = new BufferedWriter(new
MatrixWriter(context));

writer.write(Avneesh+" Shrivastav\n");
writer.flush();
	*/
}

public int mxMain(Context context, String []args) throws
Exception
{
BufferedWriter writer = new BufferedWriter(new
MatrixWriter(context));

writer.write("Hello World!\n");
writer.flush();
return 0;
}

}