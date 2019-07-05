import matrix.db.*;
import java.io.*;
import matrix.util.*;
import java.util.*;
public class ${CLASSNAME}
{
public ${CLASSNAME} () {
}
public void retriveMap(Context context, String[] args)throws
Exception
{
	/*Query qry = new Query();
qry.open(context);
qry.setBusinessObjectType("Pen");
qry.setBusinessObjectName("ClassMate");
qry.setBusinessObjectRevision("A1");
qry.setWhereExpression(null);
	qry.update(context);
BusinessObjectList list = qry.elavuate(context);
BusinessObjectItr itr = new BusinessObjectItr(list);

*/
BusinessObject bo = new BusinessObject("Pen", "ClassMate", "A1", "eService Administration");
bo.create(context,"car_policy");
bo.close(context);
BufferedWriter writer = new BufferedWriter(new
MatrixWriter(context));

writer.write("Hello World!\n");
writer.flush();

}


public ${CLASSNAME} (Context context, String[] args) throws
Exception
{
}
}