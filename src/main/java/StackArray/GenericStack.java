package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E>  {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[10];
    }

    public void push(E e){
        elements[findNextAvailSpot()] = e;
    }

    public Boolean isEmpty(){
        return elements[0]==null;
    }

    public E pop() {
        if(findNextAvailSpot()==0){
            throw new IndexOutOfBoundsException("out of bounds");
        }
        E retVal = (E) elements[findNextAvailSpot()-1];
        elements[findNextAvailSpot()-1] = null;
        return retVal;

    }

    private Integer findNextAvailSpot(){
        Integer index = 0;

        for(int j=elements.length; j>0; j--){
            if(elements[j-1] != null ){
                index = j;
                break;
            }
        }

        return index;
    }


}
