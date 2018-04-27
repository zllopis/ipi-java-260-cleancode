import java.util.Scanner;

public class BowlingConsole {
    public static void main (String [] args){
        BowlingGame game=new BowlingGame();
        Scanner scanner= new Scanner(System.in);
        Integer nbquilles;
        Integer [] monScore=new Integer[20];
        int j=0;
        for(int i=1;i<10;i++){
            System.out.println("Vous êtes dans le frame "+i);
            do{
                System.out.println("Combien de quilles vous avez fait tomber");
                String nbquillesAsString= scanner.nextLine();
                 nbquilles=Integer.parseInt(nbquillesAsString);
                game.roll(nbquilles);
                j++;
                monScore[i]=nbquilles;


            }
            while(nbquilles<10||j<2);


        }


    }


}
