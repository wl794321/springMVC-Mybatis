import cn.com.wl.entry.User;
import cn.com.wl.mapper.UserMapper;
import cn.com.wl.utils.MD5Utils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {

	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		List<User> users = userMapper.findAll();
		User user = userMapper.findUserById(1);
		System.out.println(user);
		System.out.println(users);
	}
	@Test
	public void MD5(){
		System.out.println(MD5Utils.changeToMD5("wl794321"));
	}

}
