public class PoligonoRegular {
    // ATRIBUTOS
    private int n;
    private float c;
    private float areaPoligono;

    // METODOS
    private float calculaPerimetro(){
        return c*n;
    }
    private float calculaApotema(){
        return (float) (c / (2 * Math.tan(Math.toRadians(180/n))));
    }
    public void calculaArea(int nLados, float cLados){
        n = nLados;
        c = cLados;
        areaPoligono = calculaPerimetro() * calculaApotema() / 2;
    }
    public float getAreaPoligono() {
        calculaArea(n,c);
        return areaPoligono;
    }
}
