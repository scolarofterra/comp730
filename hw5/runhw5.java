
public class runhw5 {

	public static void main(String[] args) {
		decorater str1 = new decorater("Without precise <noun>s we could <verb> "
				+ "right through a <noun> or <verb> too close to"
				+ " a <noun>, and that’d end your <noun>"
				+ " real quick, wouldn’t it?");
		decorater str2 = new decorater("Hokey <noun>s and ancient <noun>s are no <verb> "
				+ "for a good <noun> at your side, kid.");
		verbs vrb1 = new verbs(str1);
		nouns nn1 = new nouns(vrb1.mlDecorator);
		System.out.println(nn1.mlDecorator.getMadLibsString());
		verbs vrb2 = new verbs(str2);
		nouns nn2 = new nouns(vrb2.mlDecorator);
		System.out.println(nn2.mlDecorator.getMadLibsString());

	}

}
