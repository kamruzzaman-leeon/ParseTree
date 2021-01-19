grammar leeon;

root: (declare)+ (fixed)* (func)+ ;
declare : declaresection '#'library ;
declaresection: 'ATTACH';

fixed: fixedlist variable(variable | Number) ;
fixedlist: 'FIXED' ;
library: Letter '.' Letter ;

end:'/';
func: type* Letter '?' (type variable)* '?' block* ;
block: 'START' statements 'STOP' ;
statements:(
    expressions
    | input
    | output
    | iteration
    | select
    | returnvalue
    | breakexp
    | Letter '?' (Number | variable)*'?')* ;

expressions: type expression end ;
returnvalue : 'SEND-IT' expression end| 'SEND-IT' (variable | Number) end ;
expression:
 | expression operation expression
 | expression relational expression
 | expression and_or expression
 | '?' expression '?'
 | Number
 | variable;
breakexp: 'LEAVE';
operation: 'SUM' | 'SUB' | 'MUL' | 'DIV' ;
relational: '==' | '<>' | '>=' | '<' | '>' | '<=' | '$' | '!=' ;
output : 'LOOK' expression end ;
input : 'TAKE' expression end ;
and_or: 'OR'| 'AND';
increment : '++'| '--' ;
iteration: conditional | forloop;
forloop:'FORLOOP' '?' run '?' block;
run: (expression | type expression) '^' (variable | Number) relational (variable | Number)'^' variable increment ;
conditional: 'WHILELOOP' '?' expression '?' block;
type : 'int' | 'bool' | 'char' | 'string'| 'float'| 'double' | 'long long int';
variable: (Letter(Letter | Number)*);
select: 'WHETHER' '?' expression '?' block | 'WHETHER' '?' expression '?' block ( 'UNLESS' '?' expression '?' block )* ('MOREOVER' block)? ;

Letter : [a-z|A-Z]+ ;
Number : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;