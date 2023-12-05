
import java.util.Scanner;

public class SemiFinalAct4_Casul {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      BSTClass bst = new BSTClass();

      while (true) {
         System.out.println("\n=============================================");
         System.out.println("\t \t (: Binary Tree Operation :)");
         System.out.println("=============================================");

         System.out.println("[[a]] Insert Item");
         System.out.println("[[b]] Search");
         System.out.println("[[c]] Node Count");
         System.out.println("[[d]] Height Tree");
         System.out.println("[[e]] In Order Display");
         System.out.println("[[f]] Pre-Order Display");
         System.out.println("[[g]] Post-Order Display");
         System.out.println("[[0]] Exit");
         
         System.out.println("=============================================");

         System.out.print("Enter your choice: ");
         
         System.out.println("\n=============================================");


         String choice = sc.nextLine();

         switch (choice) {
            case "a":
               System.out.println("Enter Elements you want to add on the tree: ");
               int num = sc.nextInt();
               sc.nextLine();
               
               for (int i = 1; num >= i; i++) {
                  System.out.print("\nEnter Element to be added on the tree: ");
                  int element = sc.nextInt();
                  bst.insertNode(element);
                  sc.nextLine();
                  System.out.println("Element added.\n");
               }
               
               break;
            case "b":
               System.out.print("Enter the value to search: ");
               int searchValue = sc.nextInt();
               sc.nextLine();

               if (bst.search(searchValue)) {
                  System.out.println("Value found in the tree.");
               } else {
                  System.out.println("Value not found in the tree.");
               }
               break;
            
            case "c":
                int nodeCount = bst.countNodes();
                System.out.println("Total nodes in the tree: " + nodeCount);
                break;
            
            case "d":
               int treeHeight = bst.height();
               System.out.println("Height of the tree: " + treeHeight);
               break;
            
            case "e":
               System.out.println("\nInOrdered Element: ");
               bst.inorder(bst.root);
                  
               break;
            case "f":
               System.out.println("\nPreOrdered Element: ");
               bst.preorder(bst.root);
               
               break;
               
            case "g":
               System.out.println("\nPostOrdered Element: ");
               bst.postorder(bst.root);
               
               break;
               
            case "0":
               System.out.println("Exiting the program. Goodbye!");
               System.exit(0);
               break;
               
            default:
               System.out.println("Invalid choice. Please enter a valid option.");
               break;
            }
        }
    }
}