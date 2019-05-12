public class GamePlay{
    public static void main(String args[]){
        GameSnake g = new GameSnake(30);

        g.addTunnel(5, 8);
        g.addTunnel(12, 18);
        g.addTunnel(7, 1);
        g.addTunnel(28, 16);
        
        while(!g.isEnded()){
            g.play();
        }
    }
}