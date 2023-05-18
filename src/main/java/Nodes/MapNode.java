package Nodes;


import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.Map;

public class MapNode extends Node{
    private int _number;
    private Map<Pair<String, String>, String> map;

    public MapNode(int number){
        map = new HashMap<>();
        _number = number;
    }

    public void addPair( String typePlayer, String type, String player){
        map.put(new Pair<>(typePlayer, type), player);
    }

    @Override
    public String generateCode() {
        if (map.isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder("(map \"@AncestralPieces_" + String.format("%02d", _number) + "\" {\n");

        map.forEach((key, value) ->
                result.append("\t(pair (id  ").append(key.a).append("\t").append(key.b).append(")\t")
                .append(value).append(")\n"));

        result.append("})");

        System.out.println(result);
        return result.toString();
    }
}
