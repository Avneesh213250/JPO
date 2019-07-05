import matrix.db.*;
import java.io.*;
import java.util.*;
public class ${CLASSNAME}
{
public ${CLASSNAME} () {
}
public String retriveMap(Context context, String[] args)throws
Exception
{
	

	
HashMap map = (HashMap) JPO.unpackArgs(args);
String name=(String)map.get("name");
String company=(String)map.get("company");
String age=(String)map.get("age");

String str="name= "+name+" company= "+company+" age= "+age;
return str;
}


public ${CLASSNAME} (Context context, String[] args) throws
Exception
{
}
}