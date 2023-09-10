
package javaapplication19;

public class Stack {
    private int stackSize;
    private char[] stackArr;
    private int top;
    
    //constructor
    public Stack(int size){
        this.stackSize=size;
        this.stackArr = new char[this.stackSize];
        this.top=-1;
    }
    
    //methods
    public void push(char item){
        this.top++;
        this.stackArr[this.top]=item;
    }
    
    public char pop(){
        char poppedItem = this.stackArr[this.top];
        this.top--;
        return poppedItem;
    }
    
    public char peek(){
        return this.stackArr[this.top];
    }
    
    public boolean isStackFull(){
        return this.top==this.stackSize-1;
    }
    
    public boolean isStackEmpty(){
        return this.top<0;
    }
}
