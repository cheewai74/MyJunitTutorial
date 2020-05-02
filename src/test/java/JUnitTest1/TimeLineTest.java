package JUnitTest1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeLineTest {

    @Test
    public void setFetchCount(){

        TimeLine timeline = new TimeLine();
        int expected = 5;
        timeline.setFetchCount(expected);
        int actual = timeline.getFetchCount();
        assertEquals(expected, actual);
    }
}
