package iflyer;

import iflyer.dao.UserDao;
import iflyer.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Package: iflyer
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/23 上午10:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IflyerApplication.class)
public class IflyerApplicationTest {

    @Autowired
    UserDao userDao;
    @Test
    public void getUser() {
//        try {
//            User zhangsan = new User("zhangsan", "234");
//            //zhangsan.setId("dasdad");
//            userDao.save(zhangsan);
//          //  userDao.selectById(1);
//            System.out.println("===========xxxxxxx=============");
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}