package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tasks.GetListUserTasks;
import tasks.UpdateTasks;
import testcases.CreateTestCase;
import testcases.GetListUsersTestCase;
import testcases.GetSingleUserTestCase;
import testcases.UpdateTestCase;

import java.io.File;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CreateTestCase.class,
                GetSingleUserTestCase.class,
                GetListUsersTestCase.class,
                UpdateTestCase.class
        }
)
public class ApiRunner {
    @BeforeClass
    public static void start(){
        //criar reports
    }

    @AfterClass
    public static void close(){
        //fechar reports
    }

}
