public class Triangolo extends Poligono{

    public Triangolo(int v, int base, int h) {
        super(v, base, h);
    }

    public int getArea(){
        return getBase()*getAltezza()/2;
    }
}
