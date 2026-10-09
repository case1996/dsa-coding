package org.dsa.Stack.List;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

    public T pop(){
        if(isEmpty()) return null;
        return stackList.remove(stackList.size()-1);
    }

    // WRITE POP METHOD HERE //
    //                       //
    //                       //
    //                       //
    ///////////////////////////


    public static String reverseString(String str){

        Stack stack=new Stack();
        String reversedString = "";
        for(char ch:str.toCharArray())
        {
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            reversedString+=stack.pop();
        }
        return reversedString;
    }

}

