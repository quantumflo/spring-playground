package com.quantumflo.restapi;

public class Course {
    private String name;
    private int duration;
    private String instructor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuration() {
        return duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public Course(String name, int duration, String instructor) {
        this.name = name;
        this.duration = duration;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + ", duration=" + duration + ", instructor" + instructor + "]";
    }
}