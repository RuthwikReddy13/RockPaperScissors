import java.util.Random;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String choice="rps";
        char user;
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        char w='y';
        while(w=='y'){
        int ind=rnd.nextInt(choice.length());
        char ch=choice.charAt(ind);
        System.out.print("Enter your choice(r for rock,p for paper and s for Scissors):");
        user=sc.next().charAt(0);
        user=Character.toLowerCase(user);
        if(!choice.contains(Character.toString(user))){
            System.out.println("Invalid choice!!! Choose one from r,p,s");
        }
        else{
        System.out.println("Computer's Choice is:"+ch);
        if(user=='r' && ch=='p' || user=='r' && ch=='s' || user=='s' && ch=='p' || user=='p' && ch=='r'){
            System.out.println("Congratulations you won");
        }
        else if(user==ch){
            System.out.println("It's a draw");
        }
        else{
            System.out.println("Sorry you lost!!!");
        }
        System.out.println("Do you want to play again?:");
        w=sc.next().charAt(0);
        }}
        System.out.println("Game Over!!!");
    }
}