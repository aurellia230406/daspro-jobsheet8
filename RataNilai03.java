import java.util.Scanner;

public class RataNilai03 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        float nilai, totalNilai, rataNilai;
        i = 1;
        while (i <= 5) {
            j = 1;
            totalNilai = 0;
            System.out.println("Masukan nilai Siswa ke-" + i);


            while (j <= 5) {
                System.out.print("Masukkan Nilai = ");
                nilai = sc.nextInt();
                totalNilai += nilai;
                j++;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Total nilai dari siswa ke " + i + " \t: " + totalNilai);
            System.out.println("Rata-rata Nilai \t\t: " + rataNilai + "\n");
            i++;
        }
    sc.close();
    }
}