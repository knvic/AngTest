package ru.javatest.Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Николай on 12.07.2017.
 */
public interface ThreadRun {
    String thread_run(String count_vlue, String count_threads, AtomicInteger ai);


}
