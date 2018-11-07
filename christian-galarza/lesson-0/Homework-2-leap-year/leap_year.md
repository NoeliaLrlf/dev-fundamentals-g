# Modelo Matematico/lógico                                                                            
Calcular año bisiesto
•	p:   Es divisible entre 4
•	¬q: No es divisible entre 100
•	r:    Es divisible entre 400
Leap-Year = p ∧ (¬q v r )
Cociente = dividendo / divisor
Residuo = (cociente * divisor) - dividendo

# Algoritmo
p ∧ (¬q v r )
p = year % 4
¬q = year % 100
r = year % 400
R = (¬q v r )
leap-year = p ∧ (¬q v r )
E = year, p, ¬q, r, leap-year, dividendo, divisor, cociente, residuo, R
1.	leer year
2.	calcular findP (year, 4)
3.	calcular find¬Q(year, 100)
4.	calcular findR (year, 400)
5.	calcular leap_year
findP(year, 4)
1.	findResiduo(year, 4, case, p)
2.	si case 1
   residuo= 0
p = True
3.	si case 2
residuo != 0
p = False
findR(year, 400, case, r)
1.	findResiduo(year, 400)
2.	si case 1
   residuo= 0
r = True
3.	si case 2
residuo != 0
r = False
find¬Q(year, 100, case, ¬q)
1.	findResiduo(year, 100)
2.	si case 1
   residuo != 0
¬q = True
3.	si case 2
residuo = 0
¬q = False
findResiduo(dividendo, divisor)
1.	cociente = dividendo/ divisor
2.	residuo = (Cociente * divisor) – dividendo
3.	Mostrar residuo

leap_year
1.	CalcularDisyuncion(¬q v r)
2.	CalcularConjuncion(p ∧ R)
3.	Mostrar leap-year

CalcularDisyuncion(¬q v r , case , R)
1.	Si case 1
False v False 
R = False
2.	Si case 2
R = True
CalcularConjuncion(p ∧ R, leap-year)
1.	Si case 1
True ∧ True
leap-year = True
2.	Si case 2
leap-year = False

