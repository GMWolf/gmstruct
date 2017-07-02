grammar GMStruct;

file: includeList (struct | nameSpace)*;

nameSpace: 'namespace' name=ID '{' (struct|nameSpace)* '}';

includeList: include*;

include: 'include' STR;

struct: 'struct' name=ID (':' parent=structPath)? '{' attributeList '}';

attributeList : (attribute (','attribute)*)?;

attribute : name=ID  ('=' def=value)?;

value : NUM | ID | STR;

structPath : ID ('.' ID)*;

STR: '"' .+? '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;
NUM: ([0-9.]+) | '$'([0-9a-fA-F]+);
WS : (' ' | '\n' | '\r' | '\t') -> skip;
