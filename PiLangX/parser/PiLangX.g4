// antlr4 -package parser -o antlr-generated  -no-listener parser/PiLangX.g4
grammar PiLangX;

prog: varDecls funcDecl*
	;

funcDecl: 'function' IDENTIFIER '(' params ')' '{' varDecls stmt* '}'
    ;

params:   /* no parameter */
    | IDENTIFIER (',' IDENTIFIER)*
    ;

varDecls: ('var' IDENTIFIER ';')*
    ;

stmt: '{' stmt* '}'							# compoundStmt
	| IDENTIFIER '=' expr ';'				# assignStmt
	| 'if' '(' expr ')' stmt 'else' stmt	# ifStmt
	| 'while' '(' expr ')' stmt				# whileStmt
	| 'break' ';'								# breakStmt
	| 'return' expr ';'						# returnStmt
	| 'print' expr ';'						# printStmt
	;

expr: logOrExpr
    ;
    
logOrExpr: logOrExpr LOROP logAndExpr
	| logAndExpr
	;

logAndExpr: logAndExpr LANDOP orExpr
	| orExpr
	;
      
orExpr: orExpr OROP andExpr
	| andExpr
	;

andExpr: andExpr ANDOP cmp1Expr
	| cmp1Expr
	;
	
cmp1Expr: cmp1Expr CMP1OP cmp2Expr
	| cmp2Expr
	;

cmp2Expr: cmp2Expr CMP2OP addExpr
	| addExpr
	;

addExpr: addExpr (ADDOP|SUBOP) mulExpr
	| mulExpr
	;

mulExpr: mulExpr MULOP unaryExpr
	| unaryExpr
	;

unaryExpr: VALUE			# literalExpr
	| IDENTIFIER			# varExpr
	| '(' expr ')'			# parenExpr
	| IDENTIFIER '(' args ')' # callExpr
	| (NOTOP|SUBOP) unaryExpr	# unaryOpExpr
	;

args: /* no arguments */
	| expr ( ',' expr )*
	;

ADDOP:   '+';
SUBOP:	  '-';
MULOP:   '*'|'/';
ANDOP:   '&';
OROP:    '|';
NOTOP:   '~'|'!';
LANDOP:  '&&';
LOROP:	  '||';
CMP1OP:  '=='|'!=';
CMP2OP:  '>'|'<'|'>='|'<=';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
VALUE: [1-9][0-9]*|'0';
WS: [ \t\r\n] -> skip;
