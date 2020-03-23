import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so bac ma tran");
        int row = scanner.nextInt();
        int col = row;
        int sum = 0;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhap vao so co hang " + (i + 1) + " cot: " + (j + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh la: "+sum);

    }
}
