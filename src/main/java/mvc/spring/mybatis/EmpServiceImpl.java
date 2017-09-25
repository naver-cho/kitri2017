package mvc.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.spring.mybatis.EmpVO;

@Service("empService") 
public class EmpServiceImpl implements EmpService {
	
	@Autowired 
	EmpDAO dao;
	
	
	public List<EmpVO> getAllEmp(){
		return dao.getAllEmp();
	}

	public EmpVO getEmp(int id) {
		return dao.getEmp(id);
	}

	@Override
	public List<EmpVO> getAllEmp2() {
		return dao.getAllEmp2();		
	}

	@Override
	public List<EmpVO> getEmpReuse() {
		return dao.getEmpReuse();
	}
	
	@Override
	public List<EmpVO> getEmpReuse2() {
		return dao.getEmpReuse2();
	}

	@Override
	public List<EmpVO> getEmpDynamicWhere(EmpVO vo) {
		return dao.getEmpDynamicWhere(vo);
	}

	@Override
	public void updateDynamicEmp() {
		dao.updateDynamicEmp();		
	}

	@Override
	public List<EmpVO> getEmpReuseCollection() {
		return dao.getEmpReuseCollection();
	}

	@Override
	public List<EmpVO> getEmpReuseCollection2() {
		return dao.getEmpReuseCollection2();
	}

	@Override
	public List<EmpVO> getEmpRownum() {
		return dao.getEmpRownum();
	}

	@Override
	public void insertEmp(EmpVO vo) {
		dao.insertEmp(vo);
	}

	@Override
	public List<String> getJobs() {
		return dao.getJobs();
	}
}
