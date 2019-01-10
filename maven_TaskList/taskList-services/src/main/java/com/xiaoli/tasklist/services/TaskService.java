package com.xiaoli.tasklist.services;

import com.xiaoli.tasklist.dao.TaskDao;
import com.xiaoli.tasklist.entities.Task;

import java.util.List;

public class TaskService implements ITaskService {
    TaskDao taskDao = new TaskDao();

    public List<Task> queryAllTask(){
        return taskDao.getAllTasks();
    }
}
