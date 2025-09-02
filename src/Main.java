import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 1;
        while (choice != 0){
            try {
                Cupcake cake = new Cupcake();

                System.out.println("**************************************");
                System.out.println("1:  Expected Oven Time");
                System.out.println("2:  Remaining Oven Time");
                System.out.println("3:  Preparation Time");
                System.out.println("4:  Total working Time");
                System.out.println("0:  To quit");
                System.out.println("**************************************");
                System.out.print("Entrer un choix: ");

                choice = scan.nextInt();
                switch (choice){
                    case 1 -> cake.expected_time();
                    case 2 -> option2();
                    case 3 -> option3();
                    case 4 -> option4();
                }
            }
            catch (Exception e){
                System.out.println("input error");
                choice = 0;
            }
            scan.close();
        }
    }
    public static void option2(){
        Cupcake cake = new Cupcake();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time the cupcake has been in the oven: ");
        int been = scan.nextInt();
        int time = cake.remaining_time(been);
        System.out.print("The remaining time is: "+time+" min\n\n");

        scan.close();
    }

    public static void option3(){
        Cupcake cake = new Cupcake();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of layers of the cupcake: ");
        int layers = scan.nextInt();
        int time = cake.preparation_time(layers);
        System.out.print("The remaining time is: "+time+" min\n\n");
        scan.close();
    }

    public static void option4(){
        Scanner scan = new Scanner(System.in);
        Cupcake cake = new Cupcake();

        System.out.print("Enter the time the cupcake has been in the oven: ");
        int been = scan.nextInt();
        System.out.print("Enter the number of layers of the cupcake: ");
        int layers = scan.nextInt();

        int time = cake.total_time(layers, been);
        System.out.print("The remaining time is: "+time+" min\n\n");
        scan.close();
    }
}
