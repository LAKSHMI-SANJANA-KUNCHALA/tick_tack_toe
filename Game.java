package game;
import java.util.Scanner;
import player.Player;
import board.Board;
public class Game {
    Player[] players;
    Board board;
    int turn;
    int noofmoves;
    boolean gameover;
    String zero;// to check wether 3 zeroes are in a line;
    String cross;
    public Game(Player[]players,Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.noofmoves=0;
        this.gameover=false;

        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<board.size;i++){
            z.append("0");
             c.append("x");
        }
       this.zero= z.toString();
       this.cross=c.toString();

    }
    public void printboardconfig(){
        int n=board.size;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board.matrix[i][j]);
            }
            System.out.println();

        }
    }
    public void play() {
        printboardconfig();
        int n = board.size;
        
        while (!gameover) { // Continue playing until the game is over
            int idx = getindex();
            int row = idx / n;
            int col = idx % n;
            noofmoves++;
    
            board.matrix[row][col] = players[turn].getPlayersym();
    
            // Check for a winner after each move
            if (noofmoves>=2*n-1 && checkcombinations()) {
                gameover = true;
                printboardconfig();
                System.out.println("Winner is " + players[turn].getPlayername());
                return;
            }
    
            // Check for a draw
            if (noofmoves == n * n) {
                System.out.println("Game Draw");
                gameover = true;
                return;
            }
    
            turn = (turn + 1) % players.length;
            printboardconfig();
        }
    }
    
 public int getindex(){
    while(true){
        System.out.println("Player " + players[turn].getPlayername()+" choose your desired position");
    Scanner scn=new Scanner(System.in);
// as array indexing starts from 0;
    int index=scn.nextInt()-1;
     int n=board.size;
     int row=index/n;
     int col=index%n;
     //checking wether index is valid for given size
     if(row<0 ||row>=n || col<0 || col>=n){
        System.out.println("Invalid choice ");
    continue; 
    }
    if(board.matrix[row][col] !='-'){
        System.out.println("This position is already filled ");
     continue;
    }
    return index;
    

} 

}

public boolean checkcombinations(){
// row wise
    int n=board.size;
    for(int i=0;i<n;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<n;j++){
        sb.append(board.matrix[i][j]);
        }
    
    String pattern= sb.toString();
     if(pattern.equals(zero) || pattern.equals(cross)){
        return true;
     }
}
//coloumn wise
for(int i=0;i<n;i++){
    StringBuilder sb=new StringBuilder();
    for(int j=0;j<n;j++){
    sb.append(board.matrix[j][i]);
    }

String pattern= sb.toString();
 if(pattern.equals(zero) || pattern.equals(cross)){
    return true;
 }
}
// diagnol wise
int i=0,j=0;
StringBuilder sb=new StringBuilder();
while(i<n){
    sb.append(board.matrix[i][j]);
    i++;
    j++;
}
String pattern=sb.toString();
if(pattern.equals(zero) || pattern.equals(cross)){
    return true;
}
// anti Diagnol
 i=0;j=n-1;
 sb=new StringBuilder();
while(i<n){
    sb.append(board.matrix[i][j]);
    i++;
    j--;
}
pattern=sb.toString();
if(pattern.equals(zero) || pattern.equals(cross)){
    return true;
}

return false;
} 
 //scn.close();
}
