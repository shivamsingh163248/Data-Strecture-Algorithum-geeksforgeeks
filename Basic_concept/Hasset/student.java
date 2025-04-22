package Hasset;

import java.util.Objects;

public class student {
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	private int id ; 
	private String name ; 
	private String  branch ;
	public student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public int hashCode() {
		return Objects.hash(branch, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(branch, other.branch) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
	

}
