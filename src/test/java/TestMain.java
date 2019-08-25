import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void basicTest() {
        assertEquals("covfefe", Main.covfefe("coverage"));
        assertEquals("covfefe covfefe", Main.covfefe("coverage coverage"));
        assertEquals("nothing covfefe", Main.covfefe("nothing"));
        assertEquals( "double space  covfefe" ,Main.covfefe("double space "));
        assertEquals("covfefe covfefe", Main.covfefe("covfefe"));
    }
}
