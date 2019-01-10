package test.com.xiaoli.dao;

import com.xiaoli.tasklist.dao.TaskDao;
import com.xiaoli.tasklist.entities.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * TaskDao Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>09/21/2018</pre>
 */
public class TaskDaoTest {

    TaskDao dao;
    @Before
    public void before() throws Exception {
        dao=new TaskDao();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getAllTasks()
     */
    @Test
    public void testGetAllTasks() throws Exception {
        List<Task> tasks=dao.getAllTasks();
        Assert.assertEquals(5, tasks.size());
    }


}

