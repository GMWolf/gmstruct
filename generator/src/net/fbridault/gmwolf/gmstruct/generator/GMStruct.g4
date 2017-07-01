grammar GMStruct;

file: includeList structList;

includeList: include*;

include: 'include' STR;


structList: struct*;

struct: 'struct' name=ID (':' parent=ID)? '{' attributeList '}';

attributeList : (attribute (','attribute)*)?;

attribute : name=ID  ('=' def=value)?;


value : ALPHANUM | ID | STR;

STR: '"' .+? '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;
ALPHANUM: [a-zA-Z0-9_$()<>!%.]+;
WS : (' ' | '\n' | '\r' | '\t') -> skip;
