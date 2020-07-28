package tech.codingclub.database;

import com.sun.org.apache.bcel.internal.classfile.Code;
import tech.codingclub.entity.Coders;

import java.util.Date;
import java.util.List;

public class CRUDExample {

    public static void main(String[] args) {

        System.out.println("This side is Risabh Jain");
        System.out.println("Reading rows at "+new Date().toString());

        Coders code = new GenericDB<Coders>().getRow(tech.codingclub.tables.Coders.CODERS,Coders.class,null);

        readTableCoders();

        new GenericDB<String>().updateColumn(tech.codingclub.tables.Coders.CODERS.NAME,"Ganesh Mishra",tech.codingclub.tables.Coders.CODERS,tech.codingclub.tables.Coders.CODERS.NAME.eq("Dikhsa"));

        readTableCoders();
    }

    private static void readTableCoders() {

        List<Coders> rows = (List<Coders>) GenericDB.getRows(tech.codingclub.tables.Coders.CODERS,Coders.class,null,null);

        for(Coders row : rows)
        {
            System.out.println("Row : "+row.getName() + " "+ row.getAge());
        }

    }
}

