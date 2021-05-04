public abstract class Poligono {
    private int base;
    private int vertici;
    private int altezza;

    public Poligono(int v, int base, int h) { //costruttore
        vertici = v;
        this.base = base;
        altezza = h;
    }
    public int getNumeroVertici (){
        return vertici;
    }
    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }
    public abstract int getArea();



}
