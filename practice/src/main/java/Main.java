import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
        String text = "Amikor a nap ölel én Elférek tenyerében Nyújtózom a zsebében Pihenek sugarán";
        TextReverse reverse = new TextReverse();
        String[] printedResult = reverse.ReverseStringArray(text);

        for (String value: printedResult) {
            System.out.println(value);

        }


    }

}
