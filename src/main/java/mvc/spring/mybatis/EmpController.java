package mvc.spring.mybatis;

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
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService service ;
	
	@RequestMapping
	(value="insert.emp", method=RequestMethod.GET)
	public ModelAndView insertEmp(){
		ModelAndView mav = new ModelAndView();
		/* select job_id from jobs;--> JobVO<-resultType
		 * JobVO �� ����Ʈ :list
		 * 1. job-mapper.xml ����
		 * 2. select job_id from jobs;--> JobVO<-resultType
		 * 3. JobVO : �÷�=��������
		 * 4. EmpDAO: �޼ҵ��߰�. 2������SQL�������
		 * 5. EmpService....:4��ȣ�� ���� �޼ҵ��߰�
		 * =================================
		 * 6.  */
		List<String> list = service.getJobs();
		mav.addObject("jobList", list);
		//6. jsp : <c:forEach var="vo" ${vo.job_id} �ݺ� 
		//<option> ���
		mav.setViewName("insertform");
		return mav;
	}

	@RequestMapping
	(value="insert.emp", method=RequestMethod.POST)
	public String insertEmpSubmit
	(@ModelAttribute("empvo") EmpVO vo){
		service.insertEmp(vo);
		return "insertsubmit";
	}
	
	
	@RequestMapping("list.emp")
	public ModelAndView getList(){
		ModelAndView mav = new ModelAndView();
		//List<EmpVO> list = service.getAllEmp();
		List<EmpVO> list = service.getEmpReuseCollection();		
		mav.addObject("empList", list);
		mav.setViewName("emplist");
		return mav;
	}
	
	@RequestMapping("one.emp")
	public ModelAndView getOneEmp(int id){
		EmpVO vo = service.getEmp(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo", vo);
		mav.setViewName("emp");
		return mav;
		// Model <--100�� employee_id ����� ��� �̸� �޿� �μ� ��ȸ
		// emp.jsp �̵� ��� ���
	}
	public static void main(String[] args) throws IOException{
		//spring bean ?��?�� ?��?�� 
		ApplicationContext factory = 
		new ClassPathXmlApplicationContext
		("mybatis/spring/spring_mybatis.xml");		
		//3개객체생?��
		//dATAsOURCE, SQLSessionFactoryBean, SqlSessionTemplate
		//@Service("empService")
		EmpServiceImpl service = 
		(EmpServiceImpl)factory.getBean("empService");
		//@Component()
		EmpVO vo = (EmpVO)factory.getBean("empVO");
//======================================		
		//test14 : rownum
//		List<EmpVO> list = service.getEmpRownum();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//			+ " : " + vo.getJob_id()
//			+ " : " + vo.getHire_date());
//		}//for end		
		
		//test13: ?���? ?��?��미터(리스?��)
//		List<EmpVO> list = service.getEmpReuseCollection2();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//			+ " : " + vo.getJob_id()
//			+ " : " + vo.getHire_date());
//		}//for end		
		
		//test12: ?���? ?��?��미터(int 배열)
//		List<EmpVO> list = service.getEmpReuseCollection();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//			+ " : " + vo.getJob_id()
//			+ " : " + vo.getHire_date());
//		}//for end
		
		//test11:
//		service.updateDynamicEmp();
		
		//test10:
		List<EmpVO> list = service.getEmpDynamicWhere(vo);
		for(EmpVO vo2:list){
			System.out.println
			(vo2.getId() + ":" + vo2.getName()
			+ " : " + vo2.getJob_id()
			+ " : " + vo2.getHire_date());
		}//for end
		
		//test 9: 
//		List<EmpVO> list = service.getEmpReuse();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//			+ " : " + vo.getJob_id()
//			+ " : " + vo.getHire_date());
//		}//for end
		
		//test8:resultmap?��?��결과
//		List<EmpVO> list = service.getAllEmp2();
//		EmpVO target = new EmpVO();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//			+ " : " + vo.getJob_id()
//			+ " : " + vo.getHire_date());
//		}//for end
		
	//test1	
//		List<EmpVO> list = service.getAllEmp();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//		+ " : " + vo.getJob_id()
//		+ " : " + vo.getHire_date());
//		}
		
//		//test2 : ?��?�� ?��코드 조회(?��?��미터)
//		EmpVO vo = service.getEmp(500);
//		System.out.println
//		(vo.getId() + ":" + vo.getName()
//	+ " : " + vo.getJob_id()
//	+ " : " + vo.getHire_date());
		
		//test3 : ?��?�� ?��코드 조회(vo)
//		EmpVO vo = new EmpVO();
//		vo.setEmployee_id(200);
//		vo = session.selectOne("test.oneEmpVO", vo);
//		System.out.println
//		(vo.getEmployee_id() + ":" + vo.getFirst_name()
//	+ ": " + vo.getDepartment_id() + ":" + vo.getJob_id()
//	+ ": " + vo.getHire_date());
	
		//test4 : insert
//		EmpVO vo = new EmpVO();
//		vo.setEmployee_id(600);//BOARD SEQ 
//		vo.setFirst_name("?���?");
//		vo.setLast_name("�?");
//		vo.setEmail("java1@bit.com");
//		vo.setPhone_number("010-222-3333");
//		//vo.setHire_date(hire_date);
//		vo.setJob_id("IT_PROG");
//		vo.setSalary(12000);
//		vo.setCommission_pct(0.1);
//		vo.setManager_id(100);
//		vo.setDepartment_id(50);
////		
//		session.insert("test.insertEmp", vo);
		
		//test5 :update: test.updateEmp
		//employee_id 500
		//department_id 80
		//job_id ST_CLERK
		
		//EmpVO 객체 ?��?��. �? 3�? SETTER 문장
//		EmpVO vo = new EmpVO();
//		vo.setEmployee_id(500);
//		vo.setDepartment_id(80);
//		vo.setJob_id("ST_CLERK");
		
		//test.updateEmp ID ?���? ?��?�� 문장
//		session.update("test.updateEmp", vo);
		
		
		//TEST6 : test.deleteEmp id ?���? ?��?�� 문장
		// id 500�? ?��?��
		//session.delete("test.deleteEmp", 600);

		//test 7: ?��???���? ?��?�� insert
//		EmpVO vo = new EmpVO();
//		vo.setFirst_name("?���?");
//		vo.setLast_name("�?");
//		vo.setEmail("java2@bit.com");
//		vo.setPhone_number("010-222-3333");
//		//vo.setHire_date(hire_date);
//		vo.setJob_id("IT_PROG");
//		vo.setSalary(12000);
//		vo.setCommission_pct(0.1);
//		vo.setManager_id(100);
//		vo.setDepartment_id(50);
////		
//		session.insert("test.insertEmpWithSelectKey", vo);
//		
//		EmpVO vo2 = session.selectOne("test.one", 3);
//		System.out.println
//		(vo2.getEmployee_id() + ":" + vo2.getFirst_name()
//	+ ": " + vo2.getDepartment_id() + ":" + vo2.getJob_id()
//	+ ": " + vo2.getHire_date());
	}
}





