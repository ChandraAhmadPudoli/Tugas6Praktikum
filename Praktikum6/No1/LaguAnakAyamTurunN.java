package Praktikum6.No1;

public class LaguAnakAyamTurunN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Lagu Anak Ayam Turun " + n);
        while (n > 0) {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
    }
}