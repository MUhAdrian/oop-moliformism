public class main {
    public static void main(String[] args) {
        lingkaran Lingkaran = new lingkaran(50);
        persegi Persegi = new persegi(17);
        segitiga Segitiga = new segitiga(13, 18);

        System.out.println("Menghitung Luas dan Keliling Lingkaran:");
        System.out.println("Luas Lingkaran: " + Lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + Lingkaran.keliling());

        System.out.println("\nMenghitung Luas dan Keliling Segitiga:");
        System.out.println("Luas Segitiga: " + Segitiga.luas());
        System.out.println("Keliling Segitiga: " + Segitiga.keliling());

        System.out.println("\nMenghitung Luas dan Keliling Persegi:");
        System.out.println("Luas Persegi: " + Persegi.luas());
        System.out.println("Keliling Persegi: " + Persegi.keliling());
    }
}