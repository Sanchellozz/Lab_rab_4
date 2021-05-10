package com.edu;

public class lecture implements Comparable <lecture>{
    public String name;
    public Double startTime;
    public Double endTime;
    double getStartTime(){return startTime;}
    double getEndTime(){return endTime;}

    @Override
    public int compareTo(lecture l)
    {
        double a = this.getStartTime() - l.getStartTime();
        if (a == 0)
            a = this.getEndTime() - l.getEndTime();
        return (int) a;
    }

    @Override
    public String toString() {
        return name + ": " + startTime + "0 - " + endTime + "0";
    }
}
