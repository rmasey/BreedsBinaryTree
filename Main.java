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
        Node currentNode = root;

        boolean found = false;
        boolean stop = false;

        //enter code here
        while ( found==false && stop == false){
            System.out.println("Currnet node vaue is " + currentNode.getBreed());

            if (currentNode.getBreed().equals(name)){
                System.out.println(name + " is in the tree");
                found = true;
            } else if (name.compareTo(currentNode.getBreed())>0) {  // true if name > getBreed
                System.out.println("name is greater than current node value");
                if (currentNode.getRightNode() == null) {
                    System.out.println(name + " is not in the tree rigg");
                    stop = true;
                } else{
                    currentNode = currentNode.getRightNode();
                }

            }else {
                System.out.println("name is not greater than current node value");
                System.out.println("current nodee " +currentNode.getBreed());

                if (currentNode.getLeftNode() == null) {
                    System.out.println(name + " is not in the tree");
                    stop = true;
                } else{
                    currentNode = currentNode.getLeftNode();
                }

            }
        }

        //enter code here
        // while (currentNode != null && found==false){
        // if (currentNode.getBreed().equals(name)){
        // System.out.println(name + " is in the tree");
        // found = true;
        // } else if (currentNode.getBreed().compareTo(name)==1){
        // currentNode = currentNode.getLeftNode();
        // }else {
        // currentNode = currentNode.getRightNode();
        // }
        // }
        // if (found == false){
        // System.out.println(name + " is not in the tree");
        // }
    }

    public static void addNodeRecursively(Node root, Node newNode){
        if(newNode.getBreed().compareTo(root.getBreed()) <0 ){ //Go LEFT:   >0) {  // true if getBreed  < name
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
