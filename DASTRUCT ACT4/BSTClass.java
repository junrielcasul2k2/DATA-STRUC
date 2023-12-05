public class BSTClass extends  BTClass 
{
   public BSTClass()
   {
      super();
   }
   
   public BSTClass(BTNode root)
   {
      super(root);
   }

   public boolean isEmpty()
   {
      if(root == null)
         return true;
      else
         return false;
   }
   
   public void insertNode(int insertItem)
   {
      BTNode newNode = new BTNode();
      newNode.llink = null;
      newNode.info = insertItem;
      newNode.rlink = null;
      
      BTNode current;
      BTNode trailcurrent = null;
      
      if(root == null)
         root = newNode;
      else
      {
          current = root;
         while(current != null)
         {
         trailcurrent = current;
         if(current.info == insertItem)
            System.out.println("Item already exist!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
         else
         {
            if(insertItem < current.info)
               current = current.llink;
            else 
            
               current = current.rlink;
            }
         }
         
         if(insertItem < trailcurrent.info)
            trailcurrent.llink = newNode;
         else
            trailcurrent.rlink = newNode;
      }
      
   }
      
      public boolean search(int key) {
        return searchNode(root, key);
    }

    private boolean searchNode(BTNode root, int key) {
        if (root == null) {
            return false;
        }

        if (root.info == key) {
            return true;
        }

        return searchNode(root.llink, key) || searchNode(root.rlink, key);
    }
    // Count the total number of nodes in the binary tree
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BTNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.llink) + countNodes(root.rlink);
    }

    // Calculate the height of the binary tree
    public int height() {
        return calculateHeight(root);
    }

    private int calculateHeight(BTNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateHeight(root.llink);
        int rightHeight = calculateHeight(root.rlink);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
   


   
   
