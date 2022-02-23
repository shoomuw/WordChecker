public class WordCheck {
    public static void main(String[] args){
        ReadFile read = new ReadFile("Wordlist.txt");
        read.run();
        read.checkEtoJ();
        read.checkJtoE();
    }
}
