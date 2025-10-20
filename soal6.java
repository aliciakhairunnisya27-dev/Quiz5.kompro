import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah langkah rotasi (k): ");
        int k = input.nextInt();

        k = k % data.length;

        reverse(data, 0, data.length - 1);
        reverse(data, 0, k - 1);
        reverse(data, k, data.length - 1);

        System.out.println("Hasil rotasi array ke kanan sebanyak " + k + " langkah:");
        for (int angka : data) {
            System.out.print(angka + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


