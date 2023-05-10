import java.util.Stack;

public class MyLispListener extends LispBaseListener{
    private Stack<ExprNode> nodeStack;

    public MyLispListener() {
        nodeStack = new Stack<>();
    }

    @Override
    public void exitExpression(LispParser.ExpressionContext ctx) {
        {
            int s = 8;
            int k = s+9;
            /*if (Objects.equals(ctx.expression(0).getText(), "game")) {
                ExprNode node = new ExprNode(ctx.getText());
                nodeStack.push(node);
            }*/
        }
    }

    @Override
    public void exitProgram(LispParser.ProgramContext ctx) {
        {
            //тут должен быть корень дерева
            int s = 8;
            int k = s+9;
            /*if (Objects.equals(ctx.expression(0).getText(), "game")) {
                ExprNode node = new ExprNode(ctx.getText());
                nodeStack.push(node);
            }*/
        }
    }
}