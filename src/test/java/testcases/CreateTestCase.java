package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tasks.CreateTasks;

public class CreateTestCase {
    private CreateTasks createTasks;

    @Before
    public void setUp(){
        createTasks = new CreateTasks();
    }

    @Test
    public void createTestCase(){
        createTasks.requestCreate();
    }
}
