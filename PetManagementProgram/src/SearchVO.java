
public class SearchVO {

	int num;
	String name;
	int gender;
	String spec;
	String dspec;
	int age;
	int weight;
	String a;
	String b;
	String c;
	String d;
	
	
	@Override
	public String toString() {
		return "SearchVO [num=" + num + ", name=" + name + ", gender=" + gender + ", spec=" + spec + ", dspec=" + dspec
				+ ", age=" + age + ", weight=" + weight + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	public SearchVO(int num, String name, int gender, String spec) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.spec = spec;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getDspec() {
		return dspec;
	}
	public void setDspec(String dspec) {
		this.dspec = dspec;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	
}
