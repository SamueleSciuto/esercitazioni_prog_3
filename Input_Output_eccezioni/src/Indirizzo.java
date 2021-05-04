public class Indirizzo {
    String nome;
    String cognome;
    String via;
    int numeroCivico;
    String citta;

    public Indirizzo(String n,String cogn,String v,int num,String cit){
        cognome = cogn;
        nome = n; via = v;
        numeroCivico = num; citta = cit;
    }
    public String toString() {
        return "Cognome: "+cognome + "; " + "nome: "+nome + "; via: " + via +
                "; numero civico: " + numeroCivico + "; citta: " + citta;
    }

}
