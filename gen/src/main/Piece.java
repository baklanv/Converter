package src.main;

import java.util.List;

public class Piece {
    private boolean _absctact;
    private String _name;
    private List<String> _parents;
    private List<String> _define;
    private List<String> _move;

    public Piece( boolean absctact, String name){
        _absctact = absctact;
        _name = name;
    }

    public Piece( boolean absctact, String name, List<String> parents, List<String> define){
        _absctact = absctact;
        _name = name;
        _parents = parents;
        _define = define;
        //_move = move;
    }
}
