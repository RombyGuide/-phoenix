package Concurrency.concurrency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Stateless
@LocalBean
public class SimpleEJB {

    private static final Logger log = LoggerFactory.getLogger(Concurrency.contextService.SimpleEJB.class);

    @Resource
    private ManagedScheduledExecutorService managedScheduledExecutorService;

    public void testMethod() {

        managedScheduledExecutorService.scheduleWithFixedDelay(new MyRunnable(), 0, 1000, TimeUnit.MILLISECONDS);
        // be careful, infinite loop

    }

    private class MyRunnable implements Runnable {

        @Override
        public void run() {
            log.debug("Runnable: hello");
        }
    }

}
