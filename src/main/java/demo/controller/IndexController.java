package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index���������������󲢽���ҵ���߼�����
 * @author xialei
 * @version 1.0 2016��3��21������8:38:45
 */
@Controller
public class IndexController {
	
	/**
	 * ��ҳӳ�䡣��ʾ����url pathΪ"/index"������
	 * @return ����String���͵����ݣ���ʾ�������κ����ݣ�ֱ�ӽ�����ת����index.jsp��
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
