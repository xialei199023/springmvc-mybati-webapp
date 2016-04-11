package demo.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.dao.UserMapper;
import demo.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testDoLoginWrong() {
		User user = this.userMapper.check("eroor", "error");
		Assert.assertNull(user);
	}
	
	@Test
	public void testDoLoginRight() {
		User user = this.userMapper.check("test", "test");
		Assert.assertNotNull(user);
	}
}
