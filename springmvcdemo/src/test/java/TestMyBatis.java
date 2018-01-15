/**
 * Created by gao.guangcai on 2017-10-27.
 */

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.will.pojo.User;
import com.will.service.IUserService;


public class TestMyBatis extends TestMyBatisBase {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    // private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

    // @Before
    // public void before() {
    // ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // userService = (IUserService) ac.getBean("userService");
    // }

    @Test
    public void test() {
        User user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }

    @Test
    public void testInsert() {

        User user = new User();
        user.setUserName("Andy");
        user.setPassword("123");
        user.setAge(18);

        int result = userService.insert(user);

        System.out.println(result);
        System.out.println(user.getId());


    }

}