import java.util.*;
import java.io.*;

class Stack{

     private class Node{
          int data;
          Node next;
     }

     Node top;
     Stack(){
          this.top = null;
     }

     public void insertNode(int data){

          Node newNode = new Node();
          newNode.data = data;
          newNode.next = top;
          top = newNode;
     }

     public void deleteNode(){

          if(top == null){
               System.out.println("Stack is empty\n");
          }else{
               top = top.next;
          }

     }

     public void displayStack(){

          Node temp;
          temp = top;

          if(top == null){
               System.out.println("Stack is empty\n");
          }

          while(temp != null){
               System.out.print("<-"+temp.data);
               temp = temp.next;
          }
     }
}

public class LinkedStack{

     public static void main(String[] args) {

          Stack stack = new Stack();

          int choice, data;

          Scanner sc = new Scanner(System.in); 

          while(true){

               System.out.println("\nenter your choice\n");
               System.out.println("1. Insert Data into Stack");
               System.out.println("2. Delete data from stack");
               System.out.println("3. View Stack elements");
               System.out.println("4. Exit\n");
               choice = sc.nextInt();

               switch(choice){

                    case 1: 
                         System.out.println("Enter data to be inserted");
                         data = sc.nextInt();
                         stack.insertNode(data);
                         break;

                    case 2:
                         stack.deleteNode();
                         break;
                    
                    case 3:
                         stack.displayStack();   
                         break;
                    
                    default:
                         System.exit(0);     
               }
          }
     }
}
