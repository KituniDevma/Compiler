package Parser;


// AST uses first child, next sibling representation

public class AST {
  private ASTNode root;

  public AST(ASTNode node) {
    this.root = node;
  }



  // Printing

  public void print() {
    preOrderPrint(root, "");
  }

  private void preOrderPrint(ASTNode node, String printPrefix) {
    if (node == null)
      return;

    printASTNodeDetails(node, printPrefix);
    preOrderPrint(node.getChild(), printPrefix + ".");
    preOrderPrint(node.getSibling(), printPrefix);
  }

  private void printASTNodeDetails(ASTNode node, String printPrefix) {
    if (node.getType() == ASTNodeType.IDENTIFIER ||
        node.getType() == ASTNodeType.INTEGER) {
      System.out.printf(printPrefix + node.getType().getPrintName() + "\n", node.getValue());
    } else if (node.getType() == ASTNodeType.STRING)
      System.out.printf(printPrefix + node.getType().getPrintName() + "\n", node.getValue());
    else
      System.out.println(printPrefix + node.getType().getPrintName());
  }
}
