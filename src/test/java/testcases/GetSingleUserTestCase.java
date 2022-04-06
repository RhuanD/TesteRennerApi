package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tasks.GetSingleUserTasks;

public class GetSingleUserTestCase {
    private GetSingleUserTasks getSingleUserTasks;

    @Before
    public void setUp(){
        getSingleUserTasks = new GetSingleUserTasks();
    }

    @Test
    public void createTestCase(){
        getSingleUserTasks.getSingleUser();
    }
}
