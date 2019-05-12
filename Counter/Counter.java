public class Counter{
    int count;

    public Counter(){
        count = 0;
    }

    public void inc(){
        count++;
    }

    public void reset(){
        count = 0;
    }

    public int getVal(){
        return count;
    }
}