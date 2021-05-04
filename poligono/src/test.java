public class test {
    public static void main(String[] args){

        System.out.println("Triangolo");
        Triangolo x=new Triangolo(2,4,2);
        System.out.println("aria= "+x.getArea());
        System.out.println("vertici= "+x.getNumeroVertici()+"\n");

        System.out.println("Parallelogramma");
        Parallelogramma y=new Parallelogramma(4,4,2);
        System.out.println("aria= "+y.getArea());
        System.out.println("vertici= "+y.getNumeroVertici()+"\n");

        System.out.println("Rettangolo");
        Rettangolo z=new Rettangolo(4,4,2);
        System.out.println("aria= "+z.getArea());
        System.out.println("vertici= "+z.getNumeroVertici());
        System.out.println("Perimetro= "+z.getPerimetro()+"\n");
    }
}
