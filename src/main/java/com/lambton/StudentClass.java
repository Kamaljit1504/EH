package com.lambton;

public class StudentClass
{
    int Id;
    String name;
    public StudentClass()
    {
        this.Id = 1;
        this.name = "Kamal";
    }

    public StudentClass(int Sid, String Sname)
    {
        this.Id=Sid;
        this.name=Sname;
    }
    int id()
    {
        return Id;
    }
    String NAMe()
    {
        return name;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalize");
    }




}
