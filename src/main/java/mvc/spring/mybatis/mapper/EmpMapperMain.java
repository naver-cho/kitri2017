package mvc.spring.mybatis.mapper;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMapperMain {
	
public static void main(String[] args) throws IOException {
	
	ApplicationContext context
	= new ClassPathXmlApplicationContext
	("mvc/spring/mybatis/mapper/springmybatis.xml");
	
	String names []= context.getBeanDefinitionNames();
	for(String n  : names){
		System.out.println(n);
	}
	
	SqlSession session = context.getBean("sqlSessionTemplate", 
			SqlSessionTemplate.class);
		
	EmpMapper mapper = session.getMapper(EmpMapper.class);
	
	List<EmpVO> list = mapper.getEmpList();
	for(EmpVO vo:list){
		System.out.println(vo.toString());
	}
	
//	EmpVO vo = 
//	service.getEmpOne(Integer.parseInt(args[0]));
//	System.out.println(vo);
}
}


