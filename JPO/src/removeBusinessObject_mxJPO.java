import matrix.db.*;
import java.io.*;
import java.util.*;
public class ${CLASSNAME} extends BusinessObject
{
public ${CLASSNAME} () {
}
public void retriveMap(Context context, String[] args)throws
Exception
{
BusinessObject bo = new BusinessObject("Pen", "ClassMate", "A1", "eService Administration", "car_policy");
bo.remove();
bo.close();
BufferedWriter writer = new BufferedWriter(new
MatrixWriter(context));

writer.write("Object removed!\n");
writer.flush();

}


public ${CLASSNAME} (Context context, String[] args) throws
Exception
{
}
}