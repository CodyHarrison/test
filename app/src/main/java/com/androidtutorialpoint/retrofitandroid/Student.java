package com.androidtutorialpoint.retrofitandroid;


import android.util.Log;

/**
 * Created by navneet on 2/6/16.
 */

public class Student {

    //Variables that are in our json
    private int StudentId;
    private String StudentName;
    private int StudentMarks;
    private static final String Tag = "Student!";

    //Getters and setters
    public int getStudentId() {
        Log.d(Tag, "getStudentID aufgerufen");
        return StudentId;
    }

    public void setStudentId(int bookId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        Log.d(Tag, "getStudentName aufgerufen");
        return StudentName;
    }

    public void setStudentName(String name) {
        this.StudentName = StudentName;
    }

    public int getStudentMarks() {
        Log.d(Tag, "getStudentMarks aufgerufen");
        return StudentMarks;
    }

    public void setStudentMarks(String price) {
        this.StudentMarks = StudentMarks;
    }

}