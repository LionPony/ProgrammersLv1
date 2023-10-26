package programmers.lv1.dataStructure;

public class CharDLL {
    CharNode head;
    int length;
    public CharDLL(){
        this.head = null;
        this.length = 0;
    }
    public void add(char letter){
        CharNode newNode = new CharNode(letter);
        if(length == 0){
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        }
        else {
            newNode.prev = head.prev;
            newNode.next = head;

            head.prev.next = newNode;
            head.prev = newNode;

        }
        length++;
    }
    public CharNode getHead(){
        return head;
    }
}
