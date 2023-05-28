package Nodes;

public class DefineInstanceOf extends DefineNode{
    private int _count;
    public DefineInstanceOf(int count){
        _count = count;
    }
    @Override
    public String generateCode() {
        StringBuilder result = new StringBuilder("\n(define \"@isInstanceOf\"\n"
                + "\t(= 0\n"
                + "\t\t(min (array {\n");

        for (int i = 0; i < _count; i++) {
            result.append("\t\t\t(\"@DistanceBetweenPieceInstanceAndPieceType\" \"@AncestralPieces_")
                    .append(String.format("%02d", i + 1)).append("\" #1 #2)\n");
        }
        result.append("\t\t}))\n"
                + "\t)\n"
                + ")\n");

        //System.out.println(result);
        return result.toString();
    }
    /*
        (define "@isInstanceOf"
	(= 0
		(min (array {
			("@DistanceBetweenPieceInstanceAndPieceType" "@AncestralPieces_01" #1 #2)
			("@DistanceBetweenPieceInstanceAndPieceType" "@AncestralPieces_02" #1 #2)
			("@DistanceBetweenPieceInstanceAndPieceType" "@AncestralPieces_03" #1 #2)
			("@DistanceBetweenPieceInstanceAndPieceType" "@AncestralPieces_04" #1 #2)
			("@DistanceBetweenPieceInstanceAndPieceType" "@AncestralPieces_05" #1 #2)
		}))
	)
)
                "\t\t\t(\"@DistanceBetweenPieceInstanceAndPieceType\" \"@AncestralPieces_01\" #1 #2)\n" +
                "\t\t\t(\"@DistanceBetweenPieceInstanceAndPieceType\" \"@AncestralPieces_02\" #1 #2)\n" +
                "\t\t\t(\"@DistanceBetweenPieceInstanceAndPieceType\" \"@AncestralPieces_03\" #1 #2)\n" +
                "\t\t\t(\"@DistanceBetweenPieceInstanceAndPieceType\" \"@AncestralPieces_04\" #1 #2)\n" +
                "\t\t\t(\"@DistanceBetweenPieceInstanceAndPieceType\" \"@AncestralPieces_05\" #1 #2)\n" +
         */
}
