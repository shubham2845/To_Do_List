package mypackage.sts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo_system")
public class entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Discription;
	private String target;
	
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	@Override
	public String toString() {
		return "entity [id=" + id + ", Discription=" + Discription + ", target=" + target + "]";
	}
	
}
