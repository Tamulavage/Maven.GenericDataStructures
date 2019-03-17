package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>  {
    private ArrayList elements;


    public Stack(){
        elements = new ArrayList();
    }

    public void push(E e){
        this.elements.add(e);

    }

    public Boolean isEmpty(){

        return this.elements.size() == 0;
    }

    public E pop(){
        if(size()==0){
            throw new IndexOutOfBoundsException("out of bounds");
        }
        E retVal = (E) elements.get(size()-1);
        elements.remove(size()-1);
        return retVal;
    }

    private Integer size(){
        return elements.size();
    }
}
