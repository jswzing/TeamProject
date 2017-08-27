
public class InfoVO {
	
	int regiNum;
	private String petName;
	private int gender;
	private String species;
	private String detailSpecies;
	private int age;
	private int kg;
	private String etc;
	
	public InfoVO(int regiNum, String petName, int gender, String species, String detailSpecies, int age, int kg,
			String etc) {
		super();
		this.regiNum = regiNum;
		this.petName = petName;
		this.gender = gender;
		this.species = species;
		this.detailSpecies = detailSpecies;
		this.age = age;
		this.kg = kg;
		this.etc = etc;
	}

	public int getRegiNum() {
		return regiNum;
	}

	public String getPetName() {
		return petName;
	}

	public int getGender() {
		return gender;
	}

	public String getSpecies() {
		return species;
	}

	public String getDetailSpecies() {
		return detailSpecies;
	}

	public int getAge() {
		return age;
	}

	public int getKg() {
		return kg;
	}

	public String getEtc() {
		return etc;
	}
	
}
