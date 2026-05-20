
public class Department {

	private String name;
	private int studs = 0;
	private Prof[] lectureres = new Prof[10];
	private int lectureres_counter = 0;

	private void realloc_lect() {
		Prof[] temp = new Prof[lectureres.length + 10];
		int i = 0;

		while (i < lectureres.length && lectureres[i] != null) {
			temp[i] = lectureres[i];

		}
		lectureres = temp;
	}

	Department(String name, int studs) {
		this.name = name;
		this.studs = studs;
	}

	public String GetName() {
		return this.name;
	}

	public int GetStuds() {
		return this.studs;

	}

	public int avg_salery() {
		int i = 0;
		int avg = 0;

		while (i < lectureres.length && lectureres[i] != null) {
			avg += lectureres[i].GetSalery();
			i++;
		}
		return (i == 0) ? 0 : avg / i;
	}

	public void add_prof(Prof p) {
		if (lectureres_counter >= lectureres.length)
			realloc_lect();
		lectureres[lectureres_counter] = p;
		p.SetDepartment(this);
		lectureres_counter++;

	}

	public String ToString() {
		return this.name;
	}

}
