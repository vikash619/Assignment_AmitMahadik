package com.company;
//import java.lang.annotation.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//don't use "@Target()" annotation then this annotation will become available for all like Class,Method,Field.
@interface info{

        //just write and don't use "default" keyword then properties will become "mandatory"
        //if uh use "default" keyword then property will become "optional"
        int AuthorID();
        String Author() default "vikash";
        String Supervisior() default "amit";
        String Date();
        String Time();
        float Version();
        String Description() default "perfoming java annotation example";
}

@info(AuthorID = 1,Date = "02/10/2022", Time = "08:38+ PM", Version = 0.1f, Description = "applied on class")
class AnnotationExample{

    @info(AuthorID = 2,Author = "akash",Date = "02/10/2022", Time = "08:40+ PM", Version = 0.2f, Description = "applied on method")
    public void annotationOnClassMethodField(){

        @info(AuthorID = 3,Author = "prakash",Date = "02/10/2022", Time = "08:40+ PM", Version = 0.2f, Description = "applied on field")
        int value = 10;
        System.out.println("Annotation applied on Class,Method,Field and filled all Mandatory information");
    }
}
public class Question2 {
    public static void main(String [] args){
        AnnotationExample ae = new AnnotationExample();
        ae.annotationOnClassMethodField();
    }
}
