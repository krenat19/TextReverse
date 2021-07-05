import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

public class TextReverseTest {
    public String input;
    public TextReverse textreverse;

    @BeforeEach
    public void Setup() {
        textreverse = new TextReverse();
    }
    @Test
    public void ReverseTest() {
        input = "Géza kék az ég";
        String[] result = textreverse.ReverseStringArray(input);
        Assertions.assertArrayEquals(new String[]{"gé", "az", "kék", "Géza"}, result );
    }
}
