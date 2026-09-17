public class Variable004 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka1, angka2, jumlah, kurang, bagi, kali;

        // Isi variabel
        angka1 = 58;
        angka2 = 3;
        jumlah = angka1 + angka2;
        kurang = angka1 - angka2;
        kali = angka1 * angka2;
        bagi = angka1 / angka2;

        // Cetak variable
        System.out.println("Angka 1 = " + angka1);
        System.out.println("Angka 2 = " + angka2);
        System.out.println("Hasil:");
        System.out.println("(+) " + jumlah);
        System.out.println("(-) " + kurang);
        System.out.println("(*) " + kali);
        System.out.println("(/) " + bagi);
    }
}
