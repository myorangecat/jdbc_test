import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    private static int CORE_POOL_SIZE=5;
    private  static int MAXIMUM_POOL_SIZE=10;
    private static boolean KEEP_ALIVE=true;
    ThreadPoolExecutor threadPool=new ThreadPoolExecutor(5,10,2,TimeUnit.SECONDS,
            new LinkedBlockingDeque<Runnable>(5),
            new ThreadPoolExecutor.DiscardOldestPolicy());
    threadPool.(new ThreadPoolExecutorTest(){
        @Override
                public void run(){



        }




    })





}
