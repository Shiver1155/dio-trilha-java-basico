import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) throws ParseException {
        Number valor;
        valor = NumberFormat.getInstance().parse("a1.75", null);
        System.out.println(valor);
    }
}
