grammar Lisp;
/*---------------------------------------------------------------
 * A very basic implementation of a Lisp grammar.
 *------------------------------------------------------------------*/

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
program : expression* EOF ;
expression: OP (IDENTIFIER | STRING) OC? (NAMEIDENTIFIER | IDENTIFIER | STRING | NUMBER | expression | PARAM | FLOATDIGIT)* CC? CP;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
NAMEIDENTIFIER : IDENTIFIER ':';
IDENTIFIER : ((LETTER (LETTER | DIGIT)*) | PLUS | MINUS | MULT | DIV | ME | E | L) ;
PARAM : '#'NUMBER;
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
ME : '>=';
E : '=' ;
L : '<' ;
OP : '(';
CP : ')';
OC : '{';
CC : '}';
STRING : '"' (LETTER | DIGIT | WHITESPACE | RAZ)+ '"';

NUMBER : (DIGIT)+ ;

RAZ : '.' | ',' | '/' | '\'' | '_' | ':' | '-';
WHITESPACE : [ \r\n\t] + -> channel (HIDDEN);

DIGIT : '0'..'9';
FLOATDIGIT : DIGIT+ '.' DIGIT+;
LETTER : LOWER | UPPER ;

LOWER : ('a'..'z') ;
UPPER : ('A'..'Z') ;

