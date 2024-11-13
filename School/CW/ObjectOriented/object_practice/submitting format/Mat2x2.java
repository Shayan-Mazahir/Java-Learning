// package School.CW.ObjectOriented.object_practice;

public class Mat2x2 {
    //attributes
    private int m11;
    private int m12;
    private int m21;
    private int m22;

    //constructors
    public Mat2x2() {
        this.m11 = 1;
        this.m12 = 1;
        this.m21 = 1;
        this.m22 = 1;
    }

    public Mat2x2(int m11, int m12, int m21, int m22) {
        this.m11 = m11;
        this.m12 = m12;
        this.m21 = m21;
        this.m22 = m22;
    }
    
    //accessors
    //getters
    public int getm11(){
        return this.m11;
    }

    public int getm12(){
        return this.m12;
    }
    public int getm21(){
        return this.m21;
    }
    public int getm22(){
        return this.m22;
    }
    
    //setters
    public void setm11(int m11){
        this.m11 = m11;
    }
    public void setm12(int m12){
        this.m12 = m12;
    }
    public void setm21(int m21){
        this.m21 = m21;
    }
    public void setm22(int m22) {
        this.m22 = m22;
    }

    //functions/methods
    public Mat2x2 Multiply(Mat2x2 m) {
        int row_1 = (this.m11 * m.m11) + (this.m21 * m.m12);
        int row_2 = (this.m12 * m.m11) + (this.m22 * m.m12);
        int row_3 = (this.m11 * m.m21) + (this.m21 * m.m22);
        int row_4 = (this.m12 * m.m21) + (this.m22 * m.m22);
        
        return new Mat2x2(row_1, row_2, row_3, row_4); 
    }

    //overrides
    public String toString(){
        String output = "The matrix values are: " + m11 + m12+ m21+ m22;
        return output;
    }
}
