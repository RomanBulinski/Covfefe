import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void basicTest() {
        assertEquals("covfefe", Main.covfefe("coverage"));
    }

    @Test
    public void basicTest1() {
        assertEquals("covfefe covfefe", Main.covfefe("coverage coverage"));
    }

    @Test
    public void basicTest2() {
        assertEquals("nothing covfefe", Main.covfefe("nothing"));;
    }

    @Test
    public void basicTest3() {
        assertEquals( "double space  covfefe" ,Main.covfefe("double space "));
        assertEquals("covfefe covfefe", Main.covfefe("covfefe"));
    }


}
