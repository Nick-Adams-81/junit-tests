import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class StudentTest {


    Student test = new Student("test", 2);



    @Test
    public void testCreateStudent() {
        assertNotNull(test);
    }

    @Test
    public void testSetId() {
        assertNotNull(test.getId());
    }

    @Test
    public void testName() {
        assertNotNull(test.getName());
    }


}
