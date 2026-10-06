package model;

import java.util.*;

public class Table {
    private String name;
    private ArrayList<String> columns;
    private ArrayList<Row> rows;
    public Table(String TableName)
    {
        name = TableName;
        columns = new ArrayList<>();
        rows = new ArrayList<>();
    }
    public void insert(Row row)
    {
        rows.add(row);
    }
    public void printAll()
    {
        int n = rows.size();
        for(int i = 0; i < n; i++)
        {
            System.out.println(rows.get(i));
        }
    }
    public String getName()
    {
        return name;
    }
}
