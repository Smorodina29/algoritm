import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                sum+=scanner.nextDouble();
                count++;
            }
            else {
                String str = scanner.next();
                if (str.equals("готово")) break;
                else {
                    System.out.println("ошибка формата данных");
                    return;
                }
            }
        }
        scanner.close();
        System.out.println(sum/count);
    }
}
