package cn.neusoft.retailer.web;

import cn.neusoft.retailer.web.mapper.BrandMapper;
import cn.neusoft.retailer.web.mapper.UserMapper;
import cn.neusoft.retailer.web.service.BrandService;
import cn.neusoft.retailer.web.service.OrderService;
import cn.neusoft.retailer.web.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 林跃涛
 * @version 1.0
 * @date 2019/7/19 11:08
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml","classpath*:springmvc.xml"})

public class Test {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BrandService brandService;
    @Autowired
    private BrandMapper brandMapper;

    /**
     * @描述
     * @参数
     * @返回值
     * @创建人
     * @创建时间 2019/7/22 12:35
     * @修改人和其它信息
     */
    @org.junit.Test
    public void test() {
        System.out.println(userService.selectAll());
//        User user = new User();
//        user.setUserId(124);
//        user.setUserName("阿里云");
//        user.setMvoType(4);
//        userService.insertByUserInfo(user);
//
//
//        User user1 = new User();
//        user1.setUserId(14);
//        user1.setUserName("阿里云ddwd");
//        user1.setMvoType(5);
//        userService.insertByUserInfo(user1);
//
//        for (int i = 0; i < 10; i++) {
//            User user2 = new User();
//            user2.setUserId(new Random().nextInt(1000));
//            user2.setUserName("图形" + i);
//            user2.setMvoType(new Random().nextInt(9));
//            userService.insertByUserInfo(user2);
//        }
//        System.out.println(userService.selectAll());
//        for (int i = 0; i < 20; i ++){
//            Brand brand = new Brand();
//            brand.setBrandId(i+2000);
//            brand.setBrandMerId(123);
//            brandService.insert(brand);
//        }
    }

    /**
     * @描述 测试OrderService
     * @参数
     * @返回值
     * @创建人 胡献涛
     * @创建时间 2019/7/24 21:35
     * @修改人和其它信息
     */
    @org.junit.Test
    public void testOrderService() {
        orderService.selectByBrandUserId(1).forEach(map -> {
            System.out.println(map);
        });
    }
}
