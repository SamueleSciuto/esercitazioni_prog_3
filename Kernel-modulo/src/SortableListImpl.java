import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortableListImpl <T extends Comparable> implements SortableList<T>{
    ArrayList <T> lista;
    public SortableListImpl(){
        lista=new ArrayList<T>();
    }
    @Override
    public void add(T e) {
        lista.add(e);
    }

    @Override
    public void remove(T e) {
        lista.remove(e);
    }

    @Override
    public void sort() {
        Collections.sort(lista);
    }

    @Override
    public void print() {
        for (T el: lista) {
            System.out.println(el.toString());
        }
    }
}

