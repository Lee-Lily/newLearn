package com.xiaoli.tasklist.dao;

import com.xiaoli.tasklist.entities.Task;
import com.xiaoli.tasklist.utils.JDBCUtils;

import java.util.List;

public class TaskDao {

    /**获得所有任务清单*/
    public List<Task> getAllTasks(){
        return JDBCUtils.queryForList("select id,title,status from task", Task.class);
    }

}
