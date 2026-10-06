package model;

import java.util.*;

public class Row
{
    private Map<String, Object> data;
    public Row()
    {
        data = new HashMap<>();
    }
    public void put(String column, Object value)
    {
        data.put(column, value);
    }
    public Object get(String column)
    {
        return data.get(column);
    }
    public Map<String, Object> getData()
    {
        return data;
    }
    @Override
    public String toString()
    {
        return data.toString();
    }
}