package mvc.spring.mybatis;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.awt.AppContext;

public class EmpMain {

	public static void main(String[] args) throws IOException{
		//spring bean ?Ñ§?†ï ?åå?ùº 
		ApplicationContext factory = 
		new ClassPathXmlApplicationContext
		("mybatis/spring/spring_mybatis.xml");		
		//3Í∞úÍ∞ùÏ≤¥ÏÉù?Ñ±
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
		
		//test13: ?ã§Ï§? ?åå?ùºÎØ∏ÌÑ∞(Î¶¨Ïä§?ä∏)
//		List<EmpVO> list = service.getEmpReuseCollection2();
//		for(EmpVO vo:list){
//			System.out.println
//			(vo.getId() + ":" + vo.getName()
//			+ " : " + vo.getJob_id()
//			+ " : " + vo.getHire_date());
//		}//for end		
		
		//test12: ?ã§Ï§? ?åå?ùºÎØ∏ÌÑ∞(int Î∞∞Ïó¥)
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
		
		//test8:resultmap?ã§?ñâÍ≤∞Í≥º
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
		
//		//test2 : ?äπ?†ï ?†àÏΩîÎìú Ï°∞Ìöå(?åå?ùºÎØ∏ÌÑ∞)
//		EmpVO vo = service.getEmp(500);
//		System.out.println
//		(vo.getId() + ":" + vo.getName()
//	+ " : " + vo.getJob_id()
//	+ " : " + vo.getHire_date());
		
		//test3 : ?äπ?†ï ?†àÏΩîÎìú Ï°∞Ìöå(vo)
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
//		vo.setFirst_name("?ûêÎ∞?");
//		vo.setLast_name("Î∞?");
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
		
		//EmpVO Í∞ùÏ≤¥ ?Éù?Ñ±. Í∞? 3Í∞? SETTER Î¨∏Ïû•
//		EmpVO vo = new EmpVO();
//		vo.setEmployee_id(500);
//		vo.setDepartment_id(80);
//		vo.setJob_id("ST_CLERK");
		
		//test.updateEmp ID ?ÉúÍ∑? ?ã§?ñâ Î¨∏Ïû•
//		session.update("test.updateEmp", vo);
		
		
		//TEST6 : test.deleteEmp id ?ÉúÍ∑? ?ã§?ñâ Î¨∏Ïû•
		// id 500Î≤? ?Ç¨?õê
		//session.delete("test.deleteEmp", 600);

		//test 7: ?ãú???ä§Í∞? ?ù¥?ö© insert
//		EmpVO vo = new EmpVO();
//		vo.setFirst_name("?ûêÎ∞?");
//		vo.setLast_name("Î∞?");
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





