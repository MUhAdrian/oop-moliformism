public class persegi extends bangundatar {
 private int sisi;

 public persegi(int sisi) {
     this.sisi = sisi;
 }

 public float luas() {
     return (float) (sisi * sisi);
 }

 public float keliling() {
     return (float) (4 * sisi);
 }
}