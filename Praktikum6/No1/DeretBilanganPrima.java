package Praktikum6.No1;

import java.util.Scanner;

public class DeretBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;

        System.out.print("Masukkan bilangan pertama : ");
        awal = input.nextInt();
        System.out.print("Masukkan bilangan terakhir : ");
        akhir = input.nextInt();

        int pilihan;
        do {
            System.out.println("\nPilihan tampilan :");
            System.out.println("1. Bilangan prima");
            System.out.println("2. Bilangan bukan prima");
            System.out.println("3. Keluar dari program");
            System.out.print("Masukkan pilihan dari (1-3) : ");
            pilihan = input.nextInt();


            switch (pilihan) {
                case 1:
                    System.out.print("Deret bilangan prima antara " + awal + " dan " + akhir + " : ");
                    for (int i = awal; i <= akhir; i++) {
                        bil = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                bil = bil + 1;
                            }
                        }
                        if (bil == 2) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Deret bilangan bukan prima antara " + awal + " dan " + akhir + " : ");
                    for (int i = awal; i <= akhir; i++) {
                        bil = 0;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0) {
                                bil = bil + 1;
                            }
                        }
                        if (bil != 2) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Keluar program");
                    System.exit(0);
                    break;
                default:
                   System.out.println("Pilihan tidak valid. Harap masukkan angka 1-4.");
            }
            System.out.println();
        } while (pilihan != 4);
    }
}
