import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin ");
        int x = input.nextInt();
        int[] dizi = new int[x];

        System.out.println("Elemanları girin: ");
        for (int i = 0; i < x; i++) {
            System.out.print((i+1) + ".eleman: ");
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}