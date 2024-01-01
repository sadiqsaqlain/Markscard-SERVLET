package Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
    private String usn;
	private String name;
	private int maths;
	private int science;
	private int social;
	private int hindi;
	private int kannada;
	private int physics;
	private int total;
	private double percentage;
	private String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getKannada() {
		return kannada;
	}
	public void setKannada(int kannada) {
		this.kannada = kannada;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [usn=" + usn + ", name=" + name + ", maths=" + maths + ", science=" + science + ", social="
				+ social + ", hindi=" + hindi + ", kannada=" + kannada + ", physics=" + physics + ", total=" + total
				+ ", percentage=" + percentage + ", dept=" + dept + "]";
	}
	
	
	
	
	
	
}
