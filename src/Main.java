import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayIndex = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrayIndex.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ");
        int num = scanner.nextInt();
        try{
            System.out.println("chi so cua " + num +" la " + arr[num]);
        }catch (Exception ex){
            System.out.println("loi");
        }
    }
}
