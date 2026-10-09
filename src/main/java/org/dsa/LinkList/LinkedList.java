package org.dsa.LinkList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void append(int value){
        Node newNode=new Node(value);
        if (length == 0) {
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        if (length == 0) return null;
        Node pre = head;
        Node temp = head;
        while (temp.next!=null) {
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if (length == 0){
            head=null;
            tail=null;
        }
        return temp;

    }

    public void prepend(int value)
    {
        Node newNode=new Node(value);
        if (length == 0)
        {
            head=newNode;
            tail=newNode;
        } else {
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst()
    {

        if (length == 0) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if (length == 0)
        {
            tail=null;
        }
        return temp;
    }
    public void printLinkList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public Node get(int index)
    {
        if (index<0 || index >= length) return null;
        Node temp=head;
        for (int x=0;x<index;x++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value)
    {
        Node temp=get(index);
        if (temp != null) {
            temp.value=value;
            return true;
        }
        return false;

    }
    public boolean insert(int index,int value){
        Node newNode=new Node(value);
        if (index<0 || index > length) return false;
        if (index == 0){
            prepend(newNode.value);
            return true;
        }
        if (index == length)
        {
            append(newNode.value);
            return true;
        }
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }
    public void getHead() {
        System.out.println(head.value);
    }

    public void getTail() {
        System.out.println(tail.value);
    }

    public void getLength() {
        System.out.println(length);
    }

    public Node remove(int index)
    {
        if (index<0 || index >=length) return null;
        if (index == 0 )
        {
           return removeFirst();
        }
        if (index == length-1){
            return removeLast();
        }

        Node pre=get(index-1);
        Node temp=get(index);
        pre.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    public void revers()
    {
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for (int i=0; i<length;i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
    public void partitionList(int x)
    {
        Node dummy1=new Node(0);
        Node prev1=dummy1;
        Node dummy2=new Node(0);
        Node prev2=dummy2;
        Node current=head;
        while(current!=null)
        {
            if(current.value < x)
            {
                prev1.next=current;
                prev1=prev1.next;
            } else {
                prev2.next=current;
                prev2=prev2.next;
            }
            current=current.next;
        }

        prev2.next=null;
        prev1.next=dummy2.next;

        head=dummy1.next;
    }

    public Node findKthFromEnd(int k) {
        if (head == null || k <= 0) return null;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;

        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }

    public void removeDuplicates(){

        Node current=head;

        while(current!=null)
        {
            Node runner=current;
            while(runner.next!=null){

                if(runner.next.value == current.value){
                    runner.next= runner.next.next;
                    length--;

                } else {
                    runner=runner.next;
                }

            }
            current=current.next;

        }


    }
    public int binaryToDecimal() {
        int num = 0;
        Node current = head;
        while(current!=null)
        {
            num=num*2 + current.value;
            current=current.next;
        }

        return num;

    }
    public void reverseBetween(int startIndex, int endIndex) {
        // Check: If linked list is empty, nothing to reverse.
        // Exit the method.
        if (head == null) return;

        // Create a 'dummyNode' that precedes the head.
        // Simplifies handling edge cases.
        Node dummyNode = new Node(0);
        dummyNode.next = head;

        // 'previousNode' is used to navigate to the node
        // right before our sublist begins.
        Node previousNode = dummyNode;

        // Move 'previousNode' to node just before sublist.
        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        // 'currentNode' marks the first node of sublist.
        Node currentNode = previousNode.next;

        // Loop reverses the section from startIndex to endIndex.
        for (int i = 0; i < endIndex - startIndex; i++) {

            // 'nodeToMove' is the node we'll move to sublist start.
            Node nodeToMove = currentNode.next;

            // Detach 'nodeToMove' from its current position.
            currentNode.next = nodeToMove.next;

            // Attach 'nodeToMove' at the beginning of the sublist.
            nodeToMove.next = previousNode.next;

            // Move 'nodeToMove' to the start of our sublist.
            previousNode.next = nodeToMove;
        }

        // Adjust 'head' if the first node was part of sublist.
        head = dummyNode.next;
    }
    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node previous = dummy;
        Node first = head;

        while (first != null && first.next != null) {
            Node second = first.next;

            // Perform the swap
            previous.next = second;
            first.next = second.next;
            second.next = first;

            // Move pointers
            previous = first;
            first = first.next;
        }

        head = dummy.next;
    }
    public class Node
    {
        public int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }
}
