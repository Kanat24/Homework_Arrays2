import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
    }

    public static void Task1(){
        int[]array = new int[30];
        int sum =0;
        Random random = new Random();
        for (int arr: array){
            arr=random.nextInt(100000)+ 100000;
            sum+=arr;
        }
        System.out.println(sum);

    }

    public static void Task2() {
        int[]array2 = new int[30];
        int max =0;
        int min=200000;
        Random random = new Random();
        for (int arr: array2){
            arr=random.nextInt(100000)+ 100000;
            if (arr>max){
                max=arr;
            }
            if (arr<min){
                min=arr;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min+ " рублей. Максимальная сумма трат за день составила "+ max+" рублей");
    }

    public static void Task3() {
        int[]array3 = new int[30];
        float sum =0f;
        float mediumSum =0f;
        Random random = new Random();
        for (int arr: array3){
            arr=random.nextInt(100000)+ 100000;
            sum+=arr;
        }
        mediumSum=sum/ array3.length;
        System.out.println("Средняя сумма трат за месяц составила " +mediumSum+ " рублей");

    }
    public static void Task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}