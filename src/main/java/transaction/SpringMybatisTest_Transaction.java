package transaction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisTest_Transaction {
public static void main(String[] args) {
//1. spring bean ���� ���� �о��
	ApplicationContext factory
	= new ClassPathXmlApplicationContext
	("transaction/springbean_transaction.xml");
	
//2. ���񽺰�ü ���Ͷ�
//spring-service�������̽�/serviceImpl���/dao/vo/db	
	EmpService service = (EmpService)factory.getBean("empService");
//3.���񽺰�ü : ��� ��� ��ȸ mybatis ����
	List<EmpVO> list = service.getEmpList();
//4.���	
	System.out.println("test222");
	for(int i = 0; i < list.size(); i++){
		EmpVO vo2 = list.get(i);
		System.out.println(vo2.getEmployee_id() + " / " + vo2.getLast_name()
				+ " / " + vo2.getJob_id() );
	}
}
}








