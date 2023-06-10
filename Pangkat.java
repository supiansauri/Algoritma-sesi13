package sesi13;

public class Pangkat {
    public static int pemangkatan(int bilangan, int eksponen) {
        if (eksponen == 0) {
            return 1;
        } else {
            return bilangan * pemangkatan(bilangan, eksponen - 1);
        }
    }

    public static void main(String[] args) {
        int bilangan = 2;
        int eksponen = 5;
        int hasil = pemangkatan(bilangan, eksponen);
        System.out.println(bilangan + " pangkat " + eksponen + " adalah " + hasil);
    }
}
