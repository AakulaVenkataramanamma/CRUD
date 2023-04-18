package com.practice.crud.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name="Emp")
 public class Emp  
   {	
	@Id
	@GeneratedValue
	private int  eid;
	private String ename;
	private int age;
	
	
	public Emp() {
		super();
	}
	public Emp(int eid, String ename, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", age=" + age + "]";
     }
	
}

