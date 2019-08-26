package com.jatin.contactsdisplayapp;

public class MyRow
{
    private String name,contact;
    private int image;

    public MyRow(String name,String contact,int image)
    {
        this.name = name;
        this.contact = contact;
        this.image = image;
    }

    public String getName()
    {   return name;    }

    public String getContact()
    {   return contact; }

    public int getImage()
    {   return image;   }
}
