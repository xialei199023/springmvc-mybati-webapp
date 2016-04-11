package demo.test.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author xialei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/webapp")
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "file:src/main/webapp/WEB-INF/dispatch-servlet.xml"})
@EnableWebMvc
public class UserControllerTest {

	@Autowired
	private WebApplicationContext wac;

	protected MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void testDoLogin() throws Exception  {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/dologin").param("username", "test").param("password", "test"))
				.andDo(MockMvcResultHandlers.print()).andReturn();
		String viewName = mvcResult.getModelAndView().getViewName();
		Assert.assertEquals("success", viewName);
		
		String value = (String)mvcResult.getModelAndView().getModelMap().get("username");
		Assert.assertEquals("test", value);
	}
	
	@Test
	public void testDoLoginIllegalInput() throws Exception  {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/dologin").param("username", "error").param("password", "error"))
				.andDo(MockMvcResultHandlers.print()).andReturn();
		String viewName = mvcResult.getModelAndView().getViewName();
		Assert.assertEquals("error", viewName);
	}
}
