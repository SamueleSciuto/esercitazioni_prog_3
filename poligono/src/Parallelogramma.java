public class Parallelogramma extends Poligono{

    public Parallelogramma(int v, int base, int h) {
        super(v, base, h);
    }

    public int getArea(){
        return getBase()*getAltezza();
    }
}
