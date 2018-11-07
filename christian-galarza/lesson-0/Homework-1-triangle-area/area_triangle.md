# Modelo Matermatico/logico
Calcular area de un rectangulo
Formula calcular Area		
base * altura

# Datos de entrada
Point1 = x1, y1 
Point2 = x2, y2
Formulas para calcular los otros puntos
Point3 = x1 + x2 , y1	
Point4 = x1 , y1 - y2										

rectangulo 
Formula calcular distancia de dos puntos
d =  √ (x2 – x1)² + (y2 – y1)²
Base = Point3 to Point2 =>  √ (x2 – (x1 + x2) )² + (y2 – y1)²
Altura = Point2 to Point4 => √(x2 – x1 )² + ((y1 - y2) – y1)²

# Algoritmo
base * altura
Point1 = x1, y1 
Point2 = x2, y2
E =   x1, x2 ,y1 ,y2 ,Point1, Point2, base, altura
1.	Leer x1, x2 ,y1 ,y2 
2.	Calcular Point1, = x1, y1
3.	Calcular Point2, = x2, y2
4.	Calcular findPoint3(x1, x2, y1)
5.	Calcular findPoint4(x1, y1, y2)
6.	Calcular findBase(x2 ,x1, y1, y2)
7.	Calcular findAltura(x2 ,x1, y1, y2)
8.	Calcular Area_Rectangulo(base,altura)



findPoint3(x1,  x2 , y1)
1.	Point3 = x1 + x2 , y1

Calcular findPoint4(x1, y1, y2)
1.	Point4 = x1 , y1 - y2
findBase()
1.	Base = √ (x2 – (x1 + x2) )² + (y2 – y1)²

findAltura()
1.	Altura = √(x1, y1)² + (x1 + x2 , y1)²

Area_Rectangulo(base,altura)
1.	area = base * altura
 

