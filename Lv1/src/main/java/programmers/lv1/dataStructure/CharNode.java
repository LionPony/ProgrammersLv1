package programmers.lv1.dataStructure;

// Char node to make list.
public class CharNode {
    char letter;
    CharNode next;
    CharNode prev;
    public CharNode(char letter){
        this.letter = letter;
        this.next = null;
        this.prev = null;
    }
    public char getLetter(){
        return letter;
    }
    public CharNode getNext(){
        return next;
    }
}
