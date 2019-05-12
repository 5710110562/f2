import java.util.ArrayList;
public class GameSnake{
    private int p1;
    private int p2;
    private int maxSlot;
    private int turn;
    private Dice dice1;
    private Dice dice2;
    ArrayList<Tunnel> tunnels;

    public GameSnake(int totalSlot){
        p1 = 0;
        p2 = 0;
        maxSlot = totalSlot;
        turn = 1;
        dice1 = new Dice();
        dice2 = new Dice();
        tunnels = new ArrayList<Tunnel>();
    }

    public boolean isEnded(){
        return p1 >= maxSlot || p2 >= maxSlot;
    }

    public void play(){
        dice1.roll(); dice2.roll();
        walk(dice1.getVal() + dice2.getVal());
        if(dice1.getVal() != dice2.getVal())
            changeTurn();
    }

    private void changeTurn(){
        turn = turn == 1 ? 2 : 1;
    }
    public void walk(int slot){
        if(turn == 1){
            p1 += slot;
            for(Tunnel t : tunnels){
                p1 = t.walkIn(p1);
            }
        }
        else if(turn == 2){
            p2 += slot;
            for(Tunnel t : tunnels){
                p2 = t.walkIn(p2);
            }
        }

        if(p1 >= maxSlot)
            System.out.println("Player 1 win !!");
        else if(p2 >= maxSlot)
            System.out.println("Player 2 win !!");
    }

    public void addTunnel(int s_in, int s_out){
        Tunnel t = new Tunnel(s_in, s_out);
        tunnels.add(t);
    }
}