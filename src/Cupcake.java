public class Cupcake {
    public static void expected_time(){
        System.out.println("The expected time for the cupcake to get cooked is: 40");
    }
    public static int remaining_time(int time_pass){
        return 40 - time_pass;
    }
    public static int preparation_time(int layers){
        return layers * 2;
    }
    public static int total_time(int layers, int time_pass){
        return remaining_time(time_pass) + preparation_time(layers);
    }
}
