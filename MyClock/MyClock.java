public class MyClock{
    private int mn;
    private int hs;
    private int state;

    public MyClock(int hours, int mins){
        mn = mins;
        hs = hours;
        state = 0; //stest = 0 --> not set, state = 1 --> set hours, state = 2 --> set mins
    }

    public void holdCenter(){
        if(state == 0){
            state++;
        }
        else{
            state = 0;
            printTime();
        }
    }

    public void pressCenter(){
        if(state == 1){
            state = 2;
        } 
        else if(state == 2){
            state = 1;
        }
    }

    public void pressUp(){
        if(state == 1){
            hs++;
        } 
        else if(state == 2){
            mn++;
        }  
    }

    public void pressDown(){
        if(state == 1){
            hs--;
        } 
        else if(state == 2){
            mn--;
        }
    }

    public void printTime(){
        System.out.println(hs + ":" +mn);
    }
}