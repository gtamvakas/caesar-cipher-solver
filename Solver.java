
public class Solver {
    private String cipherText;

    public Solver(String cipherText){
        this.cipherText = cipherText;
    }


    public String solve(int key){
        char[] characters = this.cipherText.toUpperCase().toCharArray();
        String onlyAlphaNumeric = this.cipherText.toUpperCase().replaceAll("[^A-Z]","");
        key = key % 26;

        for (int i = 0; i < characters.length; i++) {
            if(onlyAlphaNumeric.contains(""+characters[i])) {
                characters[i] = rotate(characters[i], key);
            }
        }
        return new String(characters);
    }

    private char rotate(char character, int rotation){
        int baseAsciiValue = character + 'A';
        int valueAfterRotation = (baseAsciiValue - rotation) % 26;

        return (char) (valueAfterRotation + 'A');
    }
}