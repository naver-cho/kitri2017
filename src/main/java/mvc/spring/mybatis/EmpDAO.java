package mvc.spring.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository//empDAO = new EmpDAO()
public class EmpDAO {
	@Autowired  //empDAO.session = SqlSession???ûÖÍ∞ùÏ≤¥?ûê?èôÏ£ºÏûÖ
	SqlSession session ; 

	public List<String> getJobs(){
		return session.selectList("job.all");
	}
	public void insertEmp(EmpVO vo){
		session.insert("insertEmp",  vo);
	}
	public List<EmpVO> getAllEmp(){
		List<EmpVO> list = session.selectList("test.all");
		return list;
	}
	
	public EmpVO getEmp(int id){
		EmpVO vo = session.selectOne("test.one", id);
		return vo;
	}
	
	public List<EmpVO> getAllEmp2(){
		List<EmpVO> list = session.selectList("test.allByResultMap");
		return list;
	}

	public List<EmpVO> getEmpReuse(){
		List<EmpVO> list = 
				session.selectList("dynamic.getEmpReuse3", new int[] {100,200});
		return list;
	}
	
	public List<EmpVO> getEmpReuse2(){
		int[] i = {200, 205};
		List<EmpVO> list = 
				session.selectList("dynamic.getEmpReuse2");
		return list;
	}
	
	public List<EmpVO> getEmpDynamicWhere(EmpVO vo){
		//EmpVO vo = new EmpVO();
		vo.setName("William");//first_name= #{name}
		List<EmpVO> list = 
				session.selectList
				("dynamic.getEmpDynamicWhere", vo);
		
		return list;
	}
	
	public void updateDynamicEmp(){
		EmpVO vo = new EmpVO();
		vo.setId(5);
		vo.setName("Í∏∏Îèô");
		////
		session.update("dynamic.updateEmp", vo );
	}
	
	public List<EmpVO> getEmpReuseCollection(){
		int[] condition = {100, 110};
		return session.selectList
		("dynamic.getEmpReuseCollection", condition);
	}

	public List<EmpVO> getEmpReuseCollection2(){
		List list = new ArrayList();
		list.add("IT_PROG");
		list.add("ST_MAN");
		list.add("SA_CLERK");
		return session.selectList
		("dynamic.getEmpReuseCollection2",list);
	}
	public List<EmpVO> getEmpRownum(){
		int[] rownum={5, 10};
		return
		session.selectList("dynamic.getEmpRownum", rownum);
	}
}






