Algoritmo ejercicio3
	
	Escribir "A. El valor del �rea de un tri�ngulo, dada la base y la altura.";
	Escribir "B. El valor de la base de un tri�ngulo, dada la altura y el �rea";
	Escribir "C. El valor de la altura de un tri�ngulo, dada la base y el �rea.";
	Escribir "Elige tu opci�n:";
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
		Escribir "El �rea del tri�ngulo es " area;
	SiNo 
		Si eleccion="a" Entonces
			Escribir "Introduce la Base:";
			Leer base;
			Escribir "Introduce la Altura:";
			Leer altura;
			area = (base * altura / 2);
			Escribir "El �rea del tri�ngulo es " area;
		FinSi
	FinSi
	
	Si eleccion="B" Entonces
		Escribir "Introduce la Altura:";
		Leer altura;
		Escribir "Introduce la �rea:";
		Leer area;
		base = (2 * area / altura);
		Escribir "La base del tri�ngulo es " base;
	SiNo 
		Si eleccion="b" Entonces
			Escribir "Introduce la Altura:";
			Leer altura;
			Escribir "Introduce la �rea:";
			Leer area;
			base = (2 * area / altura);
			Escribir "La base del tri�ngulo es " base;
		FinSi
	FinSi
	
	Si eleccion="C" Entonces
		Escribir "Introduce la Base:";
		Leer base;
		Escribir "Introduce el �rea:";
		Leer area;
		altura = (area * 2 / base);
		Escribir "La altura del tri�ngulo es " altura;
	SiNo 
		Si eleccion="c" Entonces
			Escribir "Introduce la Base:";
			Leer base;
			Escribir "Introduce el �rea:";
			Leer area;
			altura = (area * 2 / base);
			Escribir "La altura del tri�ngulo es " altura;
		FinSi
	FinSi
	
FinAlgoritmo
