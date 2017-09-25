package mvc.spring.mybatis.mapper;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMapperController {
	private static final Logger logger = LoggerFactory.getLogger(EmpMapperController.class);
	
	@Autowired
	EmpMapperService service ;
	//mapper===============
	
	@RequestMapping("list.empmapper")
	public ModelAndView getList(){
		ModelAndView mav = new ModelAndView();
		List<EmpVO> list = service.getAllEmpMapper();
		mav.addObject("empList", list);
		mav.setViewName("mapper/emplist");
		return mav;
	}
	
	@RequestMapping("one.empmapper")
	public ModelAndView getOneEmp(int id){
		EmpVO vo = service.getEmpMapper(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo", vo);
		mav.setViewName("mapper/emp");
		return mav;
		// Model <--100�� employee_id ����� ��� �̸� �޿� �μ� ��ȸ
		// emp.jsp �̵� ��� ���
	}
}
