grammar GMStruct;

file: includeList (struct | nameSpace)*;

nameSpace: 'namespace' name=id '{' (struct|nameSpace)* '}';

includeList: include*;

include: 'include' STR;

struct: 'struct' name=id (':' parent=structPath)? '{'
 attributeList
 ( ';' funtionList)?
'}';

attributeList : (attribute (','attribute)*)?;


attribute : (type=id)? name=id  ('=' def=expr)?;

funtionList : function*;

function : (type=id)? name=id '(' idList? ')' block;

idList : id ( ',' id)*;

block: '{' stat* '}';

stat: block
    | declaration ';'
    | assignment ';'
    | functionCall ';'
    | ifStat
    | ret ';';



ret : 'return' expr?;

declaration : ('var' | type=id) name=id '=' expr;

assignment : variable ('=' | '*=' | '/=' | '+=' | '/=') expr;

variable : var #varId
         | (expr '.') id #varDot
         | variable '['value']' #varArray;

var : id;

functionCall : name=id '(' exprList? ')';

exprList : expr ( ',' expr)*;

ifStat: 'if' expr stat ('else' stat)?;

expr : l=expr '.' r=expr #dotExpr
     | l=expr '*' r=expr #mulExpr
     | l=expr '/' r=expr #divExpr
     | l=expr '+' r=expr #addExpr
     | l=expr '-' r=expr #subExpr
     | l=expr '||' r=expr #orExpr
     | l=expr '&&' r=expr #andExpr
     | l=expr '==' r=expr #eqExpr
     | l=expr '!=' r=expr #neqExpr
     | expr '(' exprList? ')' #funcExpr
     | value #valExpr
     | '(' expr ')' #parenExpr;

constructor: 'new' id'(' exprList? ')';

value : num #valNum
      | id #valVar
      | str #valStr
      | arrayLiteral #valArray
      | constructor #valConstruct;

arrayLiteral: '[' (value (',' value)*)? ']';


id: ID;

num : NUM;

str : STR;

structPath : id ('.' id)*;


STR: '"' .+? '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;
NUM: [+-]?([0-9.]+) | '$'([0-9a-fA-F]+);
WS : (' ' | '\n' | '\r' | '\t') -> skip;
