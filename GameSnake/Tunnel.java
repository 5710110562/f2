public class Tunnel{
    private int slotIn;
    private int slotOut;

    public Tunnel(int in, int out){
        slotIn = in;
        slotOut = out;
    }

    public int walkIn(int slot){
        if(slot == slotIn)
            return slotOut;
        return slot;
    }
}