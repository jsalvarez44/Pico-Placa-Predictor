package pico.placa.classes;

/**
 *
 * @author SEBASTIAN ALVAREZ
 */
public class pTime{
    private Integer hour;
    private Integer minute;
    
    /**
     * 
     * @param hour the new value of 'hour'
     * @param minute the new value of 'minute'
     */
    public pTime(Integer hour, Integer minute) {
        this.hour = hour;
        this.minute = minute;
    }
 /**
  * 
  * @return the value of 'hour'
  */
    public Integer getHour() {
        return hour;
    }

    /**
     * 
     * @param hour the new value of 'hour'
     */
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    
    /**
     * 
     * @return  the value of 'minute'
     */
    public Integer getMinute() {
        return minute;
    }
    
    /**
     * 
     * @param minute the new value of 'minute'
     */
    public void setMinute(Integer minute) {
        this.minute = minute;
    }
    
    /**
     * 
     * @return the time expressed in minutes
     */
    public int timeInMinutes(){
        return this.getHour()*60 + this.getMinute();
    }
    
    /**
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