public class ArrayOrdinabile <T extends Comparable> {
    private SortableList<T> obj;

    public void addModulo(SortableList<T> m){
        obj=m;
    }

    public void add(T e) {
        obj.add(e);
    }

    public void remove(T e) {
        obj.remove(e);
    }

    public void sort() {
        obj.sort();
    }

    public void print() {
        obj.print();
    }
}
