package com.company;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;


public class Holiday {
    int month;
    int dayOfMonth;
    String name;
    String description;
    boolean federallyRecognized;

    public Holiday(int month, int dayOfMonth, String name, String description, boolean federallyRecognized) {
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.name = name;
        this.description = description;
        this.federallyRecognized = federallyRecognized;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFederallyRecognized() {
        return federallyRecognized;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFederallyRecognized(boolean federallyRecognized) {
        this.federallyRecognized = federallyRecognized;
    }

    public boolean isToday(){
        LocalDateTime now= LocalDateTime.now();
        int monthIs= now.getMonthValue();
        int dayIs= now.getDayOfMonth();
        return(month==monthIs && dayOfMonth==dayIs);
    }

    public String celebrate(){
        if(month==12 && dayOfMonth==25){
            return "Merry "+ name + "!";
        }
        return "Happy " + name + "!";
    }

}
