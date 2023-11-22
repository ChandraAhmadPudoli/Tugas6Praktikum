package Praktikum6.No1;

import java.util.Scanner;

public class DeretBilanganJilNap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal, akhir;

        System.out.print("Masukkan Angka Awal  : ");
        awal = input.nextInt();
        System.out.print("Masukkan Angka Akhir : ");
        akhir = input.nextInt();

        System.out.println("Angka Awal  : " + awal);
        System.out.println("Angka Akhir : " + akhir);

        int pilihan;
        do {
            System.out.println("\nPilih output :");
            System.out.println("1. Bilangan Ganjil");
            System.out.println("2. Bilangan Genap");;
            System.out.println("3. Keluar Dari Program");

            System.out.print("Masukkan pilihan (1-3) : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    int i = awal;
                    do {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                        i++;
                    } while (i <= akhir);
                    break;

                case 2:
                    int j = awal;
                    do {
                        if (j % 2 == 0) {
                            System.out.println(j);
                        }
                        j++;
                    } while (j <= akhir);
                    break;

                case 3:
                    System.out.println("Keluar Dari Program. Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan. Harap masukkan angka dari 1-3.");
            }

        } while (pilihan != 3);
    }
}