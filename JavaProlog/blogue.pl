% Autor:
% Data: 01/12/2019

blogue(a).
blogue(b).
blogue(c).
blogue(d).
blogue(e).
acima_de(a,b).
acima_de(b,c).
acima_de(d,c).
livre(a).
livre(d).
abaixo(c).
abaixo(e).
mais_acima_de(X,Y):-acima_de(X,Y).
mais_acima_de(X,Y):-acima_de(X,Z),mais_acima_de(Z,Y).