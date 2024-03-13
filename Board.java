package board;

public class Board {
    public int size;
    public char matrix[][];
    public Board(int size,char sym){
       this.size=size;
       matrix=new char[size][size]; 
       for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        matrix[i][j]=sym;
        }
      }
    }
    //or u can add a function for default char here;
    public void boardconfig(){
      int s=this.size;  
      for(int i=0;i<s;i++){
        for(int j=0;j<s;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }

    } 
}
