import java.util.ArrayList;
import java.util.List;

public class ExprNode {
    private String type; // тип узла ("operator" или "number")
    private int value;   // значение узла (для чисел)
    private List<ExprNode> children; // список дочерних узлов

    public ExprNode(String type) {
        this.type = type;
        this.children = new ArrayList<>();
    }

    public ExprNode(int value) {
        this.type = "number";
        this.value = value;
        this.children = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void addChild(ExprNode child) {
        children.add(child);
    }

    public List<ExprNode> getChildren() {
        return children;
    }
}
