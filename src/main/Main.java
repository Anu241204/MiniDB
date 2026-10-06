package main;

import java.util.*;
import model.*;
import storage.*;

public class Main
{
    public static void main(String[] args)
    {
        Database DB = new Database();
        Table Users = new Table("Users");
        Row row1=new Row();
        row1.put("id", 1);
        row1.put("name", "Anukrati");
        row1.put("age", 21);
        Users.insert(row1);
        DB.addTable(Users);
        Row row2=new Row();
        row2.put("id", 2);
        row2.put("name", "Jai");
        row2.put("age", 24);
        Users.insert(row2);
        Users.printAll();
    }
}
