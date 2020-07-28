package tech.codingclub.database;

import tech.codingclub.entity.Coders;

public class TestCodersTable {

    public static void main(String[] args) {

        Coders akshat = new Coders("Rudra Mishra", 21L );

        //Insert this object into DB !

//           < ENTITY CLASS>
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, akshat);
    }
}