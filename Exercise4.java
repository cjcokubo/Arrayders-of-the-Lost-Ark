/*Final Password: emerald*/

public class Exercise4 {

	public static void main(String[] args) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		String inscription = "treasurelieswithinthischest";
		int stringLen = inscription.length();

		int sum = 0;
		for (int i=0; i<stringLen; i++){
			char letter = inscription.charAt(i);

			for (int j=0; j<26; j++){
				if (letter == alphabet[j]){
					sum += j;
					break;
				}
			}
		}
		
		int[] intSeries = {323, 331, 323, 336, 319, 330, 322};
		String finalPassword = "";

		for (int i=0; i<intSeries.length; i++){
			int difference = intSeries[i] - sum;
			finalPassword += alphabet[difference];
		}

		System.out.println(finalPassword);

	}
}