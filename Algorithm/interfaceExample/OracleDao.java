package interfaceExample;

public class OracleDao implements DataAccessObject {

	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}

	public void update() {
		System.out.println("Oracle DB에서 수정");
	}

	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}

}
