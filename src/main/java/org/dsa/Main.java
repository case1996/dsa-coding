package org.dsa;

import org.dsa.Queue.Queue;
import org.dsa.Tree.BST;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        LinkedList linkedList=new LinkedList(10);
//        linkedList.append(12);
//        linkedList.prepend(8);
//        linkedList.prepend(9);
//
//        linkedList.printLinkList();

//        System.out.println(linkedList.get(3).value);
//        System.out.println(linkedList.set(2,100));
//        System.out.println("\n"+linkedList.insert(2,500));
//        System.out.println("\n"+linkedList.remove(2));

//        linkedList.revers();
//        System.out.println("\n");
//        linkedList.printLinkList();

//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast());
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst());

//        DoublyLinkedList doublyLinkedList=new DoublyLinkedList(10);
//        doublyLinkedList.append(12);
//        doublyLinkedList.append(14);
//        doublyLinkedList.append(16);
//        doublyLinkedList.removeLast();
//        doublyLinkedList.removeLast();
//        doublyLinkedList.prepend(8);
//        doublyLinkedList.printList();
//        System.out.println(doublyLinkedList.removeFirst().value);
//        System.out.println(doublyLinkedList.get(1).value);
//        System.out.println(doublyLinkedList.set(1,100));
//        System.out.println(doublyLinkedList.insert(5,500));
//        doublyLinkedList.printList();
//        System.out.println(doublyLinkedList.remove(5));
//        doublyLinkedList.printList();
//        System.out.println(doublyLinkedList.getHead().value);
//        System.out.println(doublyLinkedList.getTail().value);
//        System.out.println(doublyLinkedList.getLength());

//        Stack stack=new Stack(10);
//        stack.push(12);
//        stack.push(14);
//        stack.push(16);
//        stack.printStack();
//        System.out.println("\n");
//        stack.pop();
//        stack.printStack();
//        System.out.println("\n");
//        System.out.println("Height: " + stack.getHeight());
//        System.out.println("Top: " + stack.getTop());


//        Queue queue=new Queue(10);
//        queue.enqueue(12);
//        queue.enqueue(14);
//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();
//        queue.printQueue();
//        queue.deQueue();
//        queue.printQueue();
//        System.out.println("\n");
//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();

        BST bst = new BST();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        System.out.println(bst.getRoot().getValue());
        System.out.println(bst.getRoot().getLeft().getValue());
        System.out.println(bst.getRoot().getRight().getValue());
    }
}