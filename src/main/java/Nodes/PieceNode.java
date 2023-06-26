package Nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PieceNode {
    private int _number;
    private boolean _abstract;
    private String _name;
    private List<String> _parentsName;
    private List<PieceNode> _parents;
    private List<String> _define;
    private List<String> _move;

    public PieceNode(int number, boolean _abstract, String name) {
        this._abstract = _abstract;
        _name = name;
        _define = new ArrayList<>();
        _move = new ArrayList<>();
    }

    public PieceNode(int number, boolean _abstract, String name, List<String> parentsName, List<String> define) {
        _number = number;
        this._abstract = _abstract;
        _name = name;
        _parentsName = parentsName;
        _define = define;
        //_move = move;
        _parents = new ArrayList<>();
    }

    public List<PieceNode> getParents() {
        return _parents;
    }

    public void addParent(PieceNode parent) {
        _parents.add(parent);
    }

    public List<String> getParentsName() {
        return _parentsName;
    }

    public String getName() {
        return _name;
    }

    public boolean isAbstract() {
        return _abstract;
    }

    public int getNumber() {
        return _number;
    }

    public void addDefine (String define){
        _define.add(define);
    }

    public void addMove(String move){
        _move.add(move);
    }
}
