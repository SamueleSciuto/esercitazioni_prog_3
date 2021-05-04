import java.util.List;

public class CodaGenerica  <T>  {
    List <T> coda;
    public CodaGenerica(List <T> x){
        this.coda=x;
    }
    public T get (){
        T ris = null;
        if (coda.size()>0) {
            ris = coda.remove(0);
        }
        return ris;
    }
    public void put (T x){
       coda.add(x);
    }
    public boolean empty (){
        return coda.isEmpty();
    }

}
