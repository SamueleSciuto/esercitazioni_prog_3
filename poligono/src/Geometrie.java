import java.util.ArrayList;

public class Geometrie {
    private ArrayList<Poligono> elenco;
    private int nElem;

    public void insert (Poligono p){
        for (Poligono temp: elenco) {
            if(temp.getClass()==p.getClass()) {
                if (temp.getAltezza() == p.getAltezza() && temp.getBase() == p.getBase() && temp.getNumeroVertici() == p.getNumeroVertici()) {
                    System.out.println("Poligono già presente");
                    return;
                }
            }
        }
        elenco.add(p);
        this.nElem++;
    }
}
