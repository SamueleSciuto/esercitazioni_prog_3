public class EsercizioKernelModulo3 {

    public static void main(String args[]) {
        ArrayOrdinabile<String> kernel = new ArrayOrdinabile<>();
        kernel.addModulo(new SortableListImpl<String>());
        kernel.add("farfalla");
        kernel.add("ragno");
        kernel.add("zanzara");
        kernel.add("mosca");
        kernel.sort();
        kernel.print();
        kernel.remove("ragno");
        System.out.println();
        kernel.print();

        System.out.println();
        ArrayOrdinabile<Integer> kernel1 = new ArrayOrdinabile<Integer>();
        kernel1.addModulo(new SortableListImpl<Integer>());
        kernel1.add((Integer)20);
        kernel1.add((Integer)30);
        kernel1.add((Integer)10);
        kernel1.add((Integer)5);
        //kernel1.add("ciao"); // error: incompatible types...
        kernel1.sort();
        kernel1.print();

    }
}

