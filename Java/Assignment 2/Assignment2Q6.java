package com.company;

import java.io.File;

abstract class Persistence{
    abstract public String Persist();
}

class FilePersistence extends Persistence{
    @Override
    public String Persist(){
        return "File Persistence";
    }
}

class DatabasePersistence extends Persistence{
    @Override
    public String Persist(){
        return "Database Persistence";
    }
}

public class Assignment2Q6 {
    public static void main(String [] args){
        FilePersistence fp = new FilePersistence();
        System.out.println(fp.Persist());

        DatabasePersistence dp = new DatabasePersistence();
        System.out.println(dp.Persist());
    }
}
