import matrix.db.*;
import java.io.*;
import java.util.*;
public class ${CLASSNAME}
{
public ${CLASSNAME} () {
}
public void insertMap(Context context, String[] args)throws
Exception
{
BufferedWriter writer = new BufferedWriter(new
MatrixWriter(context));
Map map=new HashMap();
map.put("name", "Avneesh Shrivastav");
map.put("company", "Tech Mahindra");
map.put("age","23");

args = JPO.packArgs(map);
String obj=(String)JPO.invoke(context, "getMap", null, "retriveMap", args, String.class);
writer.write(obj+"\n");
writer.flush();
}


public ${CLASSNAME} (Context context, String[] args) throws
Exception
{
	BufferedWriter writer1 = new BufferedWriter(new MatrixWriter(context));
	writer1.write("defaul constructor\n");
	writer1.flush();
}
}