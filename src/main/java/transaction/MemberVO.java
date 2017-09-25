package transaction;
//member 테이블 각 컬럼 select/insert 매핑객체
public class MemberVO {
	int id;
	String name;
	int dept_no;
	String addr;
	String[] addrs;
	public String[] getAddrs() {
		return addrs;
	}
	public void setAddrs(String[] addrs) {
		this.addrs = addrs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return 
		id + ":" + name + ":" 
		+ dept_no + ":" + addr;
	}
	
}








