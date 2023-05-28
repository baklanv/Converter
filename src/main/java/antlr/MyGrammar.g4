grammar MyGrammar;
/*---------------------------------------------------------------
 * A very basic implementation of a Lisp grammar.
 *------------------------------------------------------------------*/

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
program : (COMMENT | expression)* EOF ;
expression: OP (IDENTIFIER | STRING | pieces) OC? (NAMEIDENTIFIER | IDENTIFIER | STRING | NUMBER |expression | COMMENT)* CC? CP;
pieces: PIECE ABSTRACT? STRING parent? define* move*;
parent: ISA (STRING | (OC STRING (RAZ STRING)* CC));
define : OP DEFINE STRING expression CP;
move : expression |STRING ;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
ISA: '@is_a:' ;
PIECE : '@piece' ;
DEFINE : 'define';
ABSTRACT : '@abstract';

IDENTIFIER : ((LETTER (LETTER | DIGIT)*)| ARITHMETIC | LOGICAL | EMTPY | PARAM)  ;
NAMEIDENTIFIER : IDENTIFIER ':' ;

EMTPY : '~';
STRING : '"' '@'?(LETTER | DIGIT | WHITESPACE | RAZ)+ '"';
PARAM : '#'NUMBER;
ARITHMETIC: '+' | '-' | '*' | '/' | '^';
LOGICAL: '!=' | '>=' | '<=' | '>' | '<' | '=' ;
OP : '(';
CP : ')';
OC : '{';
CC : '}';

NUMBER : (DIGIT)+ ;

RAZ : '.' | ',' | '/' | '\'' | '_' | ':' | '-';
WHITESPACE : [ \r\n\t] + -> channel (HIDDEN);

DIGIT : '0'..'9';
LETTER : LOWER | UPPER ;

LOWER : ('a'..'z') ;
UPPER : ('A'..'Z') ;


COMMENT
    :   ('//' ~[\r\n]*
    |   '/*' .*? '*/') -> skip
    ;

