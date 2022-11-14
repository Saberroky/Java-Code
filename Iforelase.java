import java.util.Scanner;

public class Iforelase {

    public static void main(String[] args) {
        int y;
        int z;


        System.out.println("please enter your age : ");
        Scanner input = new Scanner(System.in);
        y = input.nextInt();
        if( y < 18 ){
            System.out.println("access denied in brazzer");
        }
        else{
            System.out.println("you are welcome in brazzer");

        }
        System.out.println("please enter your penis size in inc: ");
        Scanner input1 = new Scanner(System.in);
        z = input1.nextInt();
        switch (z){
            case 1:
                System.out.println("leave the earth");
            case 2:
                    System.out.println(" fuck a dog");
            case 3:
                        System.out.println("choti bassi ho keya");
            case 8:
                System.out.println(" life jingga lala");
            default:
                System.out.println("u got some thing else");

        }


    }

}
