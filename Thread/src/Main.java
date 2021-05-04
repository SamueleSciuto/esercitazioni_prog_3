public class Main extends Thread{
    public static void main (String[] args) throws InterruptedException {
        Thread Azione1= new Operazioni(800,1,null);
        Azione1.start();
        Thread Azione2= new Operazioni(500,2,Azione1);
        Azione2.start();
        Thread Azione3= new Operazioni(100,3,Azione2);
        Azione3.start();
    }
}
