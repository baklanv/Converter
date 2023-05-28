package Nodes;


import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.Map;

public class MapNode extends Node{ //todo уровень вложенности - 3
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

        StringBuilder result = new StringBuilder("\t\t(map \"@AncestralPieces_" + String.format("%02d", _number) + "\" {\n"); //todo add @

        /*for (var b : map.keySet()){
            var hj = b.a;
            var jk = b.b;
            var fgf = b.b.replaceFirst("\"", "\"@");
        }*/
        map.forEach((key, value) ->
                result.append("\t\t\t(pair (id  ").append(key.a).append("\t").append(key.b).append(")\t")
                .append(value.replaceFirst("\"", "\"@")).append(")\n"));

        result.append("\t\t})");

        //System.out.println(result);
        return result.toString();
    }
}
