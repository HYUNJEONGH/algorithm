import java.util.Scanner;

// push X: 정수 X를 큐에 넣는 연산이다.
// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 큐에 들어있는 정수의 개수를 출력한다.
// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

class Queue{
    //현재 위치 노드
    private Node topNode;
    private Node headNode;
    private int size = 0;

    public Queue() {
        topNode = new Node(null);
        headNode = new Node(null);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int in = sc.nextInt();
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.getFront()+"");
        System.out.println(queue.getBack()+"");

        System.out.println(queue.pop()+"");
        System.out.println(queue.pop()+"");
    }

    public void push(Object data) {
        Node node = new Node(data);
        size++;
        if (headNode.data == null) {
            headNode.prev = node;
            headNode = node;
        }
        topNode.prev = node;
        topNode = node;
    }

    public Object pop() {
        if (isEmpty()==1) return -1;
        Object data = headNode.data;
        //노드 위치 수정
        Node prevNode = headNode.prev; 
        headNode = prevNode;
        size--;
        return data;
    }   
    
    public int isEmpty() {
        return (size == 0)? 1 : 0;  
    }

    public int getSize() {
        return size;
    }

    public Object getFront() {
        if(headNode.data == null)
            return -1;
        return headNode.data;
    }

    public Object getBack() {
        if(topNode.data == null)
            return -1;
        return topNode.data;
    }

    private class Node {
        private Object data;
        private Node prev; // 이전 노드의 값
 
        public Node(Object data) {
            this.data = data;
            this.prev = null;
        }
    }

}