package mvc.spring.mybatis.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empMapperService") 
public class EmpMapperServiceImpl implements EmpMapperService {
	
	@Autowired 
	EmpMapperDAO dao;
	
	//===mapper====
		public List<EmpVO> getAllEmpMapper(){
			List<EmpVO> list = dao.getAllEmpMapper();
			return list;
		}
		
		public EmpVO getEmpMapper(int id){
			return dao.getEmpMapper(id);
		}
	//===mapper=====	

}
