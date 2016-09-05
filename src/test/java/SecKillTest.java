import com.test.seckill.service.SecKillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by chengwanchao on 2016/8/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class SecKillTest {

    @Resource
    private SecKillService secKillService;
    @Test
    public void empty(){
        secKillService.query(1);
    }

}
