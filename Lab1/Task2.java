package Lab1;

public class Task2 {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public Task2(int shiftSteps) {
		this.n = shiftSteps;
	}

	// Encrypt a character according to the given shif steps.
	// Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char encryptChar(char c) {
		// TODO
		return 0;
	}

	// Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		// TODO
		return "";
	}

	// Decrypt a character according to the given shif steps.
	// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char decryptChar(char c) {
		// TODO
		return 0;
	}

	// Decrypt a encrypted text using the above function for decrypting a charater.
	public String decrypt(String input) {
		// TODO
		return "";
	}

	// Encrypt a encrypted the text content in the srcfile and save it into desFile.
	public void encrypt(String srcFile, String desFile) {
		// TODO
	}

	// Decrypt a encrypted the text content in the srcfile and save it into desFile.
	public void decrypt(String srcFile, String desFile) {
		// TODO
	}
}