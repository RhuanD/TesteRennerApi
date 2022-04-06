package testcases;

import org.junit.Before;
import org.junit.Test;
import tasks.GetListUserTasks;

public class GetListUsersTestCase {
    private GetListUserTasks getListUserTasks;

    @Before
    public void setUp(){
        getListUserTasks = new GetListUserTasks();
    }

    @Test
    public void createTestCase(){
        getListUserTasks.getListUser();
    }
}
