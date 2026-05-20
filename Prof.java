
public class Prof {
	private String name;
	private String id;// its a string cause double 00 at the start doesnt work
	private Degrees deg;
	private String course;
	private int salary;
	private Department dep;
	public static enum Degrees {
		First,
		Second,
		Doctor,
		Phd

	};

	Prof(String _name, int _sal, String _id, Degrees _deg, String _course) {
		this.name = _name;
		this.salary = _sal;
		this.id = _id;
		this.deg = _deg;
		this.course = _course;
	}

	Prof(Prof p) {
		this.name = p.GetName();
		this.salary = p.GetSalery();
		this.dep = p.GetDepartment();

	}

	public String[] ToPrint() {
		if (this.dep != null) {

			String[] temp = { "name: " + this.name, "id: " + this.id, "Degree: " + this.deg,
					"salery: " + this.salary, "Department: " + this.dep.ToString() };
			return temp;
		} else {
			String[] temp = { "name: " + this.name, "id: " + this.id, "Degree: " + this.deg,
					"salery: " + this.salary,
					"Department: " + "not assigned" };
			return temp;
		}

	}

	public String GetName() {
		return this.name;
	}

	public String GetId() {

		return this.id;

	}

	public String GetCourse() {
		return this.course;
	}

	public Degrees GetDegress() {
		return this.deg;
	}

	public int GetSalery() {
		return this.salary;
	}

	public void SetDepartment(Department d) {
		this.dep = d;

	}

	public Department GetDepartment() {
		return this.dep; // returns the addrs
	}

}
