/*
 * trida timespan predstavuje casovy interval a zapouzdruje hodnoty
 * hour [0..60]
 * minute [0..60]
 * second [0..60]
 */
package cars;

import java.time.LocalTime;
import java.util.Random;

/**
 *
 * @author Milan Zlamal
 *
 */
public class Timespan {

    private int hours = 0;
    private int minute = 0;
    private int second = 0;

    public Timespan(int hours, int minute, int second) {
        setTime(hours, minute, second);

    }

    public Timespan(int second) {
        this(second / 60, second % 60);

    }

    public Timespan(int minute, int second) {
        this(minute / 60, minute % 60, second);

    }

    public int getTotalseconds() {
        return hours * 3600 + minute * 60 + second;
    }

    public void setTime(int hours, int minute, int second){
        if (second >= 60|| second < 0) {
            this.second =0;
        } else {
            this.second = second;
        }
    
        if (minute >= 60 || minute < 0) {
            this.minute =0;
        } else {
            this.minute = minute;
        }
            if (hours < 0) {
                this.hours = 0;
            
        }else {
            this.hours = hours;
        }
        }
    
    public void setHours(int hours){

        /*
            // toto byl muj napad - pouzit interval, bohuzel mi to nejde ;((
         if (!hours.compareTo("[0-24])") {
         throw new Exception("Chyba v zadani hodin, prosim opakujte");
         }
         
         this.hours = hours;
         */

    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    
    public int getSecond(int second){
        return second;
    }
    
    public int getMinute(int minute){
        return minute;
    }
    
    public int getHours(int hours){
        return hours;
    }

    @Override
    public boolean equals(Object obj) {  // tato trida je delana pro tridu object, proto ji zachovavam
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) { // padaji pod stejne tridy objektu
            return false;
        }
        
        final Timespan other = (Timespan) obj; // zpristupnuji si metody - kvuli tomu prapredkovi || final - dela hodnotu co je nemenna pro potomky
        
        if (this.getTotalseconds() != other.getTotalseconds()){
            return false;
        }
        return true;
    }

}
