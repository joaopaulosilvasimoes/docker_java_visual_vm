import java.lang.management.MemoryMXBean;
import java.lang.management.ManagementFactory;

public class Main
{

    public static void main(String... args) throws Exception{

        int mb = 1024 * 1024;
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long xmx = memoryBean.getHeapMemoryUsage().getMax() / mb;
        long xms = memoryBean.getHeapMemoryUsage().getInit() / mb;
        System.out.println(String.format("Initial Memory (xms) : %dmb", xms));
        System.out.println(String.format("Max Memory (xmx) : %dmb", xmx));

        for(int i = 1; i <= 10000; i++)
        {
            
            System.out.println("Count: " + i);

            Thread.sleep(6000);

        }

    }

}
