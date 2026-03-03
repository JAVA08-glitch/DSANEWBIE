package LinkedList;
import java.sql.SQLOutput;
import java.util.*;

public class singlyLinkedlist {
    class node{
        int x;
        node next;
    }
  public   class single{
        node head=null;
        void insertAtBeg(int x){
            node nn=new node();
            nn.x=x;
            if(head==null){
                nn.next=head;
                head=nn;
            }else{
                nn.next=head;
                head=nn;
            }
        }
        void insertAtEnd(int x){
            node nn=new node();
            nn.x=x;
            if(head==null){
                nn.next=null;
                head=nn;
            }else{
                node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }temp.next=nn;
                nn.next=null;
            }
        }
        void display(){
            if(head==null)System.out.println("List is Empty");
            else{
                node temp=head;
                while(temp!=null){
                    System.out.print(temp.x+(temp.next==null?"":"->"));
                    temp=temp.next;
                }
            }
        }
        void deleteAtBeg(){
            if(head==null)return;
            else{
                node temp=head;
                head=temp.next;
                temp.next=null;

            }
        }
        void deleteAtEnd(){
            if(head==null)return;
            else if(head.next==null){
                head=null;

            }else{
                node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
        boolean search(int data){
            node temp=head;boolean truth=false;
            while(temp.next!=null){
                if(temp.x==data)truth=true;
                temp=temp.next;
            }return truth;
        }
        node reverseLinkedList(node head ){
         node prev=null;
         node curr=head;
         node next=null;
         while(curr!=null){
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;

         }return prev;


        }
        void createCycle(node head,int pos){
           if(head==null || pos<0)return;
           node temp=head;
           node cycleNode=null;
           int index=0;
           while(temp.next!=null){
               if(index==pos){
                   cycleNode=temp;
               }index++;
               temp=temp.next;
           }temp.next=cycleNode;
        }
        boolean detectCycle(node head){
            node slow=head;
            node fast=head;
           while(fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;
               if(slow==fast) {return true;}
           }return false;
        }


    }

    public static void main(String[] args) {
      Scanner sc=new   Scanner(System.in);
    singlyLinkedlist obj=new singlyLinkedlist();
    single l=obj.new single();
        int choice;
    do{
        System.out.println("Choose operations to do:1:insertatbeg 2: insert at end 3: delete at beg 4: delete at end 5: search an element 6:Display ");
        System.out.println("7:Reverse LinkedList 8:Create a cycle ");
        choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Enter Data:");
            int data=sc.nextInt();
            l.insertAtBeg(data);
            break;
            case 5:System.out.println("Enter element to be searched:");
            int temp=sc.nextInt();
            if(l.search(temp))System.out.println("It's present");
            else{
                System.out.println("It's not found");
            }
            break;
            case 7:l.head=l.reverseLinkedList(l.head);
            break;
            case 8:System.out.println("Enter position of cycle node");
            int pos=sc.nextInt();
            l.createCycle(l.head,pos);
            break;
            case 9:if(l.detectCycle(l.head)){
                System.out.println("Cycle Detected");
            }else{
                System.out.println("Cycle didn't detected");
            }

            default:







        }
    }while(choice!=-1);
    }

}
