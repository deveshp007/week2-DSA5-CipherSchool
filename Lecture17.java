public class MinStack {

    class Node {
        int value;
        int min;
        Node next;

        public Node(int value, int min) {
            this.value = value;
            this.min = min;
            next = null;
        }
    }

    Node head;

    public void push(int x) {
		MinStack.Node head;
		    if (head == null) {
		        Node n = new Node(x, x);
		        head = n;
		    } else {
		        Node n = new Node(x, Math.min(x
		        n.next = head;
		        head = n;
		    }
		}

    public int top() {
        Object head;
        if (head != null)
            return head.value;
        return -1;
    }

    public int getMin() {
        if (head != null)
            return head.min;
        return -1;

    }

    public void main(String[] args) {
        MinStack s = new MinStack();
        s.push(2);
        s.push(10);
        s.push(12);
        s.push(5);
        s.push(18);
        System.out.println(s.getMin());
    }
}