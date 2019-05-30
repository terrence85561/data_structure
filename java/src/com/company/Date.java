package com.company;

public final class Date implements Comparable<Date> {
    // this is a class for illustrating the sample "equals" model

    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }


    public boolean equals(Object y){
        if (y == this) return true;
        if (y == null) return false;
        if (y.getClass() != this.getClass()){
            return false;
        }
        Date that = (Date) y;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }



    @Override
    public int compareTo(Date that) {
        if (this.year > that.year ) return +1;
        if (this.year < that.year ) return -1;
        if (this.month > that.month) return +1;
        if (this.month < that.month) return -1;
        if (this.day > that.day ) return +1;
        if (this.day < that.day ) return -1;
        return 0;
    }

    @Override
    public String toString() {
       return month + "/" + day + "/" + year;
    }
}
