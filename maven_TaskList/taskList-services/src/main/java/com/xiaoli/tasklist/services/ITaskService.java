package com.xiaoli.tasklist.services;

import com.xiaoli.tasklist.entities.Task;

import java.util.List;

public interface ITaskService {
    List<Task> queryAllTask();
}
