import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int baris, kolom;
        String[][] penonton = new String[4][2]; 

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi (1-3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    
                    while (true) {
                        System.out.print("Masukan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Input tidak valid!");
                        } else {
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Tempat duduk sudah diisi. Silakan pilih tempat lain.");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil disimpan.");
                                break; 
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t"); 
                            } else {
                                System.out.print(penonton[i][j] + "\t"); 
                            }
                        }
                        System.out.println(); 
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close(); 
                    return; 

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}