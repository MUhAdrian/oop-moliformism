public class lingkaran extends bangundatar {

    private int r;
    private  float pi = 3.14f;

    public lingkaran(int r){
        this.r = r;
    }

    @Override
    public float luas(){
        return (float) (pi * r*r);
        
    }
    
    public double luas(double d){
        return (double)(pi *(d*2/2)*2);
        
    }
    
    @Override
public float keliling() {
    return (float)(pi * 2 * r);
}

}
