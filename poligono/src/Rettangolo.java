public class Rettangolo extends Poligono {
    public Rettangolo(int v, int base, int h) {
        super(v, base, h);
    }

    public int getArea(){
        return getBase()*getAltezza();
    }
    public int getPerimetro(){
        return (getBase()+getAltezza())*2;
    }

}
