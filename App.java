import board.Board;
import player.Player;
import game.Game;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("first project ->tic tac toe");
         Board b=new Board(3, '-');

         // call default char function;
       
         Player p1=new Player("Sanjana",19, '0', "8997956875", "sanjana@gmail.com", "uk");
         
         Player p2=new Player("Bhavya",17, 'x', "8678790980", "bhavya@gmail.com", "india");
         Game game=new Game(new Player[] {p1,p2}, b);
         
                game.play();
}


}
