package com.example.danielkellam.ballotmania2;

/**
 * Created by danielkellam on 4/3/15.
 */
public class CategoryModel {
    private String CategoryName;
    private int CategoryID;

    public CategoryModel(String name, int id)
    {
        CategoryName = name;
        CategoryID = id;
    }

    public String getCategoryName()
    {
        return CategoryName;
    }

    public int getCategoryID()
    {
        return CategoryID;
    }
}
