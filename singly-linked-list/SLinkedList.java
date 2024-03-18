public class SLinkedList {
    int count;
    Node head;
    Node tail;

    public SLinkedList(){
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
    }

    public void addToIndex(int index, int value){
        if(index < 0 || index > count) {
            System.out.println("Invalid index");
        }
    }

    public void remove(int index){
        if(index < 0 || index >= count){
            System.out.println("Invalid index");
        } else {
            if (index == 0){
                head = head.next;
                if(head == null){
                  tail = null;
                }
            } else {
                Node previous = head;
                for(int i=0; i<index-1; i++){
                    previous = previous.next;
                }
                Node current = previous.next;
                previous.next = current.next;
                if(previous.next == null){
                    tail = previous;
                }
            }
            count--;
        }
    }

    public Node get(int index){
        return null;
    }

    public int size(){
        return count;
    }

}
