package Homwork;

public class StudentDTO {

	//field
	int studentNum;
	String name;
	
	//constructor
	
	public void StudentDTO() {}
	public void StudentDTO(int studentNum, String name) {
		this.studentNum=studentNum;
		this.name=name;
	}
	//method
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentNum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentNum != other.studentNum)
			return false;
		return true;
	}
	
	

}
