1.Package switch case

2.public class Switchcase{

3.   public static void main (string []args){

4.      int choice;

5.      System.out.println("pick one:1.Hi\t2.Hey\t3.hello\t");

6.      Scanner s=new Scanner(System.in);

7.      choice=s.nextInt();

8.      Switch (choice)
9.       {    
10.        case 1:System.out.println("you said hi");
11.                 break;
12.        case 2:System.out.println("you said Hey");
13.                 break;
14.        case 3:System.out.println("you said hello");
15.                   break;
16.        default:System.out.println("invalid choice");
17.        }
18.     }
19. }
