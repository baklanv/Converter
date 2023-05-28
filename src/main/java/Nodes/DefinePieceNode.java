package Nodes;

public class DefinePieceNode extends DefineNode{
    private String _name;
    private int _number;

    public DefinePieceNode(String name, int number){
        _name = name;
        _number = number;
    }
    @Override
    public String generateCode() {
        //System.out.println("(define " + _name.replaceFirst("\"", "\"@") + " " + _number + ")"); // todo добавить @
        return "(define " + _name.replaceFirst("\"", "\"@") + " " + _number + ")\n";
    }
}
