import matrix.db.*;
import java.io.*;
import java.util.*;
public class ${CLASSNAME} extends ${CLASS:A} 
{
	public void extendsClass(Context context, String[] args)throws
Exception {
	BufferedWriter writer = new BufferedWriter(new MatrixWriter(context));
	writer.write(super.name+"  "+super.company+"  "+super.age+"\n");
	writer.flush();
	}
	
	
}