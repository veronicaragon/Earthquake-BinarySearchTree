public class EarthquakeBinarySearchTree {
		private Earthquake root;
  
    /*Adds an earthquake object to the tree @return True if the earthquake was added to the tree*/
    public boolean add(Earthquake quake) {
    	if (root == null) {
      	root = quake;
        return true;
      }
			Earthquake current = root;
      while (true) {
      	if (quake.getMagnitude() < current.getMagnitude()) {
        	if (current.getLeft() == null) {
          	current.setLeft(quake);
            return true;
          }
          current = current.getLeft();
        }
        else if (quake.getMagnitude() > current.getMagnitude()) {
        	if (current.getRight() == null) {
          	current.setRight(quake);
            return true;
          }
          current = current.getRight();
        } 
        else {
        	return false; // Duplicate magnitude, not added to the tree
       	}
      }
    }

    /*Iterative method: search and return the earthquake that matches the target magnitude. If not earthquake is found, return null. @return An earthquake object or null*/
    public Earthquake search(double targetMagnitude) {
    	Earthquake current = root;
      while (current != null) {
      	if (current.getMagnitude() == targetMagnitude) {
        	return current;
        }
        else if (targetMagnitude < current.getMagnitude()) {
        	current = current.getLeft();
        }
        else {
        	current = current.getRight();
        }
      }
      return null; // Earthquake with target magnitude not found
    }

    /*Display the tree. Don't modify this method*/
    public void display() {
        if (root == null) {
            System.out.println("The tree is empty.");
        }
        inOrderTraversal(root);
    }

    /*Helper recursive method: Use recursion to display the tree inOrder */
    private void inOrderTraversal(Earthquake current) {
    	if (current != null) {
      	inOrderTraversal(current.getLeft());
        System.out.println(current);
        inOrderTraversal(current.getRight());
      }
    }
}