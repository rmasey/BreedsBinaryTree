public class Node {
    
    //attributes
    private String breed;
    private Node left;
    private Node right;
    
    //constructor    
    public Node(String givenBreed) {
            breed = givenBreed;
    }

    //getters and setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String givenBreed) {
        breed = givenBreed;
    }

    public Node getLeftNode() {
        return left;
    }

    public void setLeftNode(Node left) {
        this.left = left;
    }

    public Node getRightNode() {
        return right;
    }

    public void setRightNode(Node right) {
        this.right = right;
    }
    
}
