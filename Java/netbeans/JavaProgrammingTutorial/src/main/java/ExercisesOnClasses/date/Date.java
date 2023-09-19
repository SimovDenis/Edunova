/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercisesOnClasses.date;

/**
 *
 * @author Denis
 */
public class Date {
    
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString(){
        
        if(day > 31 || month > 12){
            return "Day or month not in right format";
        }
        
        if(day < 10 && month < 10){
            return "0" + day + "/0" + month + "/" + year;
        }
        
        if(day < 10 && month >= 10){
            return "0" + day + "/" + month + "/" + year;
        }                
        
        return day + "/" + month + "/" + year;
    }
    
    
    
}
