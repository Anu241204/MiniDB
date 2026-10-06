package storage;

import model.Table;

import java.util.*;

public class Database
{
    private HashMap<String, Table> database;
    public Database()
    {
        database = new HashMap<>();
    }
    public void addTable(Table table)
    {
        database.put(table.getName(), table);
    }
    public Table getTable(String tableName)
    {
        return database.get(tableName);
    }
}
