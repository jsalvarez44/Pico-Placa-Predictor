package pico.placa.classes;

/**
 *
 * @author SEBASTIAN ALVAREZ
 */
public class pTime{
    private Integer hour;
    private Integer minute;
    
    /**
     * constructor of 'pTime' where the data of 'hour' and 'minute' are entered during the creation of the object
     * 
     * @param hour     the new value of 'hour'
     * @param minute the new value of 'minute'
     */
    public pTime(Integer hour, Integer minute) {
        this.hour = hour;
        this.minute = minute;
    }
 /**
  * getter of 'hour' value
  * 
  * @return the value of 'hour'
  */
    public Integer getHour() {
        return hour;
    }

    /**
     * setter of 'hour' value
     * 
     * @param hour the new value of 'hour'
     */
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    
    /**
     * getter of 'minute' value
     * 
     * @return  the value of 'minute'
     */
    public Integer getMinute() {
        return minute;
    }
    
    /**
     * setter of 'minute' value
     * 
     * @param minute the new value of 'minute'
     */
    public void setMinute(Integer minute) {
        this.minute = minute;
    }
    
    /**
     * transform time data into minutes
     * 
     * @return the time expressed in minutes
     */
    public int timeInMinutes(){
        return this.getHour()*60 + this.getMinute();
    }
    
    /**
     * validates if time data is within set ranges
     * 
     * @param nMinutes the time in minutes
     * @return a boolean variable named "funcFlag" true if the 'xMinutes' value is on the interval
     */
    public boolean validateTimeInMinutes(int nMinutes){
        boolean funcFlag = false;
        /*
                    Validation intervals in minutes
        
                    7:00  -> 420 minutes
                    9:30  -> 570 minutes
                    16:00 -> 960 minutes
                    19:30 -> 1170 minutes
                    */
        if((nMinutes >= 420 && nMinutes <= 570) || (nMinutes >=960 && nMinutes <= 1170)) 
            funcFlag = true;
        
        return funcFlag;
    }
}