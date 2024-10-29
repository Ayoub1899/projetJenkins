import org.example.app.App;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void test(){
        App app = new App();
        assertEquals(6, app.Sum(4,2));

    }
}
