package mvc.spring.mybatis.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpMapperDAO {
	@Autowired  
	SqlSession session ; 
//mapper사용================
	@Autowired
	EmpMapper mapper;
	
	public List<EmpVO> getAllEmpMapper(){
		List<EmpVO> list = mapper.getEmpList();
		for(EmpVO vo:list){
			System.out.println(vo.toString());
		}
		return list;
	}
	
	public EmpVO getEmpMapper(int id){
		EmpVO vo = mapper.getEmp(id);
		return vo;
	}
//=========================	
}