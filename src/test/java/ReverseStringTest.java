import com.google.common.truth.Truth;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void testReverse_emptyString() {
        Main main = new Main();
        Truth.assertThat(main.reverse("")).isEqualTo("");
    }

    @Test
    public void testReverse_singleCharacter() {
        Main main = new Main();
        Truth.assertThat(main.reverse("a")).isEqualTo("a");
    }

    @Test
    public void testReverse_multipleCharacters() {
        Main main = new Main();
        Truth.assertThat(main.reverse("abc")).isEqualTo("cba");
    }

    @Test
    public void testReverse_specialCharacters() {
        Main main = new Main();
        Truth.assertThat(main.reverse("!@#")).isEqualTo("#@!");
    }

    @Test
    public void testReverse_nullString() {
        Main main = new Main();
        Truth.assertThat(main.reverse(null)).isNull();
    }
}