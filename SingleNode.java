public class SingleNode {

    /** 头节点指针 */
    private Node head;

    /** 尾节点 */
    private Node tail;

    /** 链表的长度 */
    private int size;


    public void insert(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("超出链表节点范围");
        }

        Node insertedNode = new Node(data);

        if (size == 0) {
            // 头节点插入
            head = insertedNode;
            tail = insertedNode;
        } else if (size == index) {
            // 尾节点插入
            tail.next = insertedNode;
            tail = insertedNode;
        } else {
            //
            Node prevNode = get(index - 1);
            Node nextNode =  prevNode.next;
            prevNode.next = insertedNode;
            insertedNode.next = nextNode;
        }
        size ++;
    }

    
    
    public Node get(int index) throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("超出链表节点范围");
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    private static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }
}
