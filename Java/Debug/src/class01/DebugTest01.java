package class01;

public class DebugTest01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            int sum;
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1-10之間的偶數和是：" + sum);
    }
}