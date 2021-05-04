import java.util.ArrayList;
import java.util.List;

public class TestCoda {
    public static void main(String args[]) {
        ArrayList<String> numeri = new ArrayList<>();
        CodaGenerica<String> test = new CodaGenerica<>(numeri);

        System.out.println(test.empty());
        test.put("a");
        System.out.println(test.empty());
        test.get();
        System.out.println(test.empty());

    }
}
