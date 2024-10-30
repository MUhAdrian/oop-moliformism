public class segitiga extends bangundatar {

    private int alas;
    private int tinggi;

public segitiga(int alas,int tinggi){
    this.alas=alas;
    this.tinggi=tinggi;
}
    public float luas(){
        return (float)(0.5*this.alas*this.tinggi);
    }

    public float keliling(){
        return(float)(3* this.alas);
    }
}
