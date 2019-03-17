package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[10];
    }

    public void push(Object o){
        elements[findNextAvailSpot()] = o;
    }

    public Boolean isEmpty(){
        return elements[0]==null;
    }

    public Object pop() {
        if(findNextAvailSpot()==0){
            throw new IndexOutOfBoundsException("out of bounds");
        }
        Object retVal = (Object) elements[findNextAvailSpot()-1];
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
