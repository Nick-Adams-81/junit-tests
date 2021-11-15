import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class StudentTest {

    Student test = new Student("test", 2);

    @Test
    public void testCreateStudent() {
        assertNotNull(test);
    }

    @Test
    public void testId() {
        long expected = 2;
        long actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testName() {
        String expected = "test";
        String actual = test.getName();
        assertEquals(expected, actual);
    }



}
