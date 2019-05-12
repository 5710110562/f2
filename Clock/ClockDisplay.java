public class ClockDisplay{
    private NumDisplay hrs;
    private NumDisplay minutes;
    private String currTimeString;           // the current time as a string
    

    public ClockDisplay(){
    // intialize the clock to 00:00
  
      hrs = new NumDisplay(24);
      minutes = new NumDisplay(60);
      setTimeString();
    }
    private void setTimeString(){
    /* store the current time as a string    of the form "hours:minutes"  */
      currTimeString = hrs.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
    public void setTime(int hr, int minute){
    // set time to the specified hour and minute

      hrs.setValue(hr);
      minutes.setValue(minute);
      setTimeString();
    }  // end of setTime()
  
  
    public String getTime(){
    // return the current time as a string
      return currTimeString; 
    }
    public void minIncrement(){
    // increment the clock by one minute;
    // hour increments when minutes roll over to 0
      minutes.increment();
      if (minutes.getValue() == 0) // mins rolled
        hrs.increment();
      setTimeString();
    }  // end of minIncrement()
  
  
  }  // end of ClockDisplay class
  
  