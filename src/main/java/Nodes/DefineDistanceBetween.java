package Nodes;

public class DefineDistanceBetween extends DefineNode{
    @Override
    public String generateCode() {
        /*System.out.println("(define \"@DistanceBetweenPieceInstanceAndPieceType\"\n" +
                "\t(abs (- (mapEntry #1 #2) #3 ) )\n" +
                ")");*/
        return "(define \"@DistanceBetweenPieceInstanceAndPieceType\"\n" +
                "\t(abs (- (mapEntry #1 #2) #3 ) )\n" +
                ")";
    }
}
