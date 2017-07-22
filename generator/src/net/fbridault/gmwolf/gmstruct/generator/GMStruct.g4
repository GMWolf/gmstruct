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

function : name=id '(' idList? ')' block;

idList : id ( ',' id)*;

block: '{' stat* '}';

stat: block
    | assignment ';'
    | functionCall ';'
    | ifStat
    | ret ';';



ret : 'return' expr?;

assignment : 'var'? id ('['value']')? ('=' | '*=' | '/=' | '+=' | '/=') expr;

functionCall : id '(' exprList? ')';

exprList : expr ( ',' expr)*;

ifStat: 'if' expr stat ('else' stat)?;

expr : expr '.' expr #dotExpr
     | expr '*' expr #mulExpr
     | expr '/' expr #divExpr
     | expr '+' expr #addExpr
     | expr '-' expr #subExpr
     | expr '||' expr #orExpr
     | expr '&&' expr #andExpr
     | expr '==' expr #eqExpr
     | expr '!=' expr #neqExpr
     | value #valExpr
     | '(' expr ')' #parenExpr;

constructor: 'new' id'(' exprList ')';

value : NUM | id | STR | functionCall | arrayLiteral | arrayAccess | constructor;

arrayLiteral: '[' (value (',' value)*)? ']';

arrayAccess: id '[' NUM ']';

id: ID;

structPath : id ('.' id)*;


STR: '"' .+? '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;
NUM: [+-]?([0-9.]+) | '$'([0-9a-fA-F]+);
WS : (' ' | '\n' | '\r' | '\t') -> skip;
