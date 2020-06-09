public class A {
    private int A1;
    private float A2;

    public int getA1() {
        return A1;
    }
    public float getA2() {
        return A2;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }
    public void setA2(float A2) {
        this.A2 = A2;
    }
    
    public String MA1(){
        return "Método A1";
    }
    public String MA2(){
        return "Método A2";
    }
    public void MA3(){
        System.out.println("Alteração da classe A a partir do clone.");
    }
}
