import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap size array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phan tu o vi tri thu " + i + "la: ");
            array[i] = scanner.nextInt();
        }
//        Nhập số cần chèn X
//        Nhập vị trí cần chèn
//        Kiểm tra điều kiện của vi tri can chen, lon hon 0 va nho hon length
//                thuc hien chen phan tu: tạo ARRAY MOWIS
        System.out.println("Nhap so can chen X: ");
        int X = scanner.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        int index_newArray = scanner.nextInt();
            if(index_newArray < 0 || index_newArray > array.length) {
                System.out.println("Không điền vào được ");
            } else {
                int[] newArray = new int[array.length + 1];
                for (int i = 0, j = 0, i < newArray.length ; i++) {
                    if (i == index_newArray) {
                        newArray[i] = X;
                    } else {
                        newArray[i] = array[j];
                        j++;
                    }

                }
                System.out.println("Mang sau khi chen" + Arrays.toString(newArray));
            }




    }
}