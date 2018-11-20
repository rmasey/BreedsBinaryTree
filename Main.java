import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Node root = new Node("Harrier");
        Node node2 = new Node("Greyhoud");
        Node node3 = new Node("Rottweiler");
        Node node4 = new Node("Chihuahua");
        Node node5 = new Node("Pug");
        Node node6 = new Node("Whippet");

        addNodeRecursively(root, node2);
        addNodeRecursively(root, node3);
        addNodeRecursively(root, node4);
        addNodeRecursively(root, node5);
        addNodeRecursively(root, node6);
        
        System.out.println(node5.getRightNode());
        System.out.println(node5.getLeftNode());
        

        System.out.println("Enter breed of dog: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Node breedNode = root;

        //put your code here to see if a breed is in the tree!
        //you can use compareTo() to compare strings, see https://www.tutorialspoint.com/java/lang/string_compareto.htm 
        
    }

    public static void addNodeRecursively(Node root, Node newNode){
        if(newNode.getBreed().compareTo(root.getBreed()) < 0 ){ //Go LEFT  <0 means getBreed is less than name
            if(root.getLeftNode() == null){ //If parent (root) has no child node to left:
                root.setLeftNode(newNode);
            }else{ //If child node (to left) does exist:
                addNodeRecursively(root.getLeftNode(), newNode); //Recursion
            }
        }else{ //Go RIGHT:
            if(root.getRightNode() == null){ //If parent (root) has no child node to right:
                root.setRightNode(newNode);
            }else{ //If child node (to right) does exist:
                addNodeRecursively(root.getRightNode(), newNode); //Recursion 
            }
        }
    }

}
