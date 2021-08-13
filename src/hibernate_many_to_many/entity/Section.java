package hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "child_section"
			, joinColumns = @JoinColumn(name = "section_id")
			, inverseJoinColumns = @JoinColumn(name = "child_id"))
	private List<Child> childrens;

	public Section() {
	}

	public Section(String name) {
		this.name = name;
	}

	public void addChildToSection(Child child) {
		if (childrens == null) {
			childrens = new ArrayList<>();
		}
		childrens.add(child);
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

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "child_section"
			, joinColumns = @JoinColumn(name = "section_id")
			, inverseJoinColumns = @JoinColumn(name = "child_id")
	)
	public List<Child> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Child> childrens) {
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "Section{" +
				"id = " + id +
				", name = '" + name + '\'' +
				'}';
	}
}