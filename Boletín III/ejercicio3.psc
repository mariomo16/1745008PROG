Algoritmo ejercicio3
	
	Escribir "A. El valor del área de un triángulo, dada la base y la altura.";
	Escribir "B. El valor de la base de un triángulo, dada la altura y el área";
	Escribir "C. El valor de la altura de un triángulo, dada la base y el área.";
	Escribir "Elige tu opción:";
	Leer eleccion;
	
	//area = (base * altura / 2);
	//base = (2 * area / altura);
	//altura = (area * 2 / base);
	
	Si eleccion="A" Entonces
		Escribir "Introduce la Base:";
		Leer base;
		Escribir "Introduce la Altura:";
		Leer altura;
		area = (base * altura / 2);
		Escribir "El área del triángulo es " area;
	SiNo 
		Si eleccion="a" Entonces
			Escribir "Introduce la Base:";
			Leer base;
			Escribir "Introduce la Altura:";
			Leer altura;
			area = (base * altura / 2);
			Escribir "El área del triángulo es " area;
		FinSi
	FinSi
	
	Si eleccion="B" Entonces
		Escribir "Introduce la Altura:";
		Leer altura;
		Escribir "Introduce la Área:";
		Leer area;
		base = (2 * area / altura);
		Escribir "La base del triángulo es " base;
	SiNo 
		Si eleccion="b" Entonces
			Escribir "Introduce la Altura:";
			Leer altura;
			Escribir "Introduce la Área:";
			Leer area;
			base = (2 * area / altura);
			Escribir "La base del triángulo es " base;
		FinSi
	FinSi
	
	Si eleccion="C" Entonces
		Escribir "Introduce la Base:";
		Leer base;
		Escribir "Introduce el Área:";
		Leer area;
		altura = (area * 2 / base);
		Escribir "La altura del triángulo es " altura;
	SiNo 
		Si eleccion="c" Entonces
			Escribir "Introduce la Base:";
			Leer base;
			Escribir "Introduce el Área:";
			Leer area;
			altura = (area * 2 / base);
			Escribir "La altura del triángulo es " altura;
		FinSi
	FinSi
	
FinAlgoritmo
