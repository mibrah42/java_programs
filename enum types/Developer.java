public class Developer {
	private Language language;

	public Developer(Language language){
		this.language = language;
	}

	public static void main(String[] args) {
		Developer Mohamed = new Developer(Language.Ruby);

		System.out.println(Mohamed.language);

	}
}