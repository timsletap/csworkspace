package Trees;

public class Morse  implements Comparable<Morse> {
    private int number;
    private char character;

    public Morse(int number, char character) {
        this.number = number;
        this.character = character;
    }

    public int getNumber() {
        return number;
    }

    public char getCharacter() {
        return character;
    }

    public int compareTo(Morse o) {
        if (this.number < o.number) {
            return -1;
        } else if (this.number > o.number) {
            return 1;
        }

        if (this.character < o.character) {
            return -1;
        } else if (this.character > o.character) {
            return 1;
        }
        return 0;
    }

   

}





