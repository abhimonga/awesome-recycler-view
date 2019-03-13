package com.example.recyclerview;
public class data {
    private String title, rate, year,open,close,high,low;


    public data(String title, String rate, String year,String open,String close,String high,String low) {
        this.title = title;
        this.rate = rate;
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }
    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }
    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }
    
}