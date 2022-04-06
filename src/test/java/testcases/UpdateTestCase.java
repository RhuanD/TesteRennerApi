package testcases;

import org.junit.Before;
import org.junit.Test;
import tasks.CreateTasks;
import tasks.UpdateTasks;

public class UpdateTestCase {
    private UpdateTasks updateTasks;

    @Before
    public void setUp(){
        updateTasks = new UpdateTasks();
    }

    @Test
    public void createTestCase(){
        updateTasks.requestUpdate();
    }
}
