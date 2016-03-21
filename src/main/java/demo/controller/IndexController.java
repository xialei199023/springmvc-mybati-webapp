package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index控制器，拦截请求并进行业务逻辑处理。
 * @author xialei
 * @version 1.0 2016年3月21日下午8:38:45
 */
@Controller
public class IndexController {
	
	/**
	 * 主页映射。表示拦截url path为"/index"的请求。
	 * @return 返回String类型的数据，表示不附加任何数据，直接将请求转发到index.jsp。
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
