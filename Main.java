import java.util.Random;
import java.util.Scanner;

class Main{

    MineCell[][] Map;

    public static void main(String[] args){
        System.out.println("Welcome to bad mine sweeper");
        System.out.print("Please enter your number of cols here: ");

        int Size = 10;

        MineCell[][] Map = new MineCell[Size][Size];


        Random rand = new Random();

        for (int Row = 0; Row < Map.length; Row++) {
            for (int Col = 0; Col < Map[Row].length; Col++) {
                Map[Row][Col] = new MineCell(rand.nextBoolean());
            }
        }

        

        


    }

    pri

}

class MineCell{

    //Shows Wethier its live ie clicking it will end the game
    Boolean IsActive;

    //is used to show weither it should be show on the map
    Boolean IsFound;

    MineCell(Boolean isActive){
        IsActive = isActive;
    }

}

//this probably isn't going to work but Im trying to set up the number display for the cell
public int cellnumdisplay(int x, int y)
{
    display=0
    ys=y-1
    xs=x-1
    for(a=0;a>=2;a+1)
        ys+=1
        {
            for(b=0;b>=2,b+1)
                {
                    if(Minecell[ys][xs] isActive=True)
                    {
                        display+=1
                    }
                    xs+=1
                }
        
        }
}
