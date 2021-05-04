public class Operazioni extends Thread {
    int sleep;
    int numThread;
    Thread aspetta;
    public Operazioni(int sleep , int numThread,Thread aspetta){
        this.sleep=sleep;
        this.numThread=numThread;
        this.aspetta=aspetta;
    }
    public void run() {
        try {
            if(aspetta!=null)
                aspetta.join();
            System.out.println("Inizio Tread "+ numThread);
            sleep(sleep);
            System.out.println("Fine Tread "+ numThread);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
