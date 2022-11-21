Algoritmo ejercicio1
	
	diahoy = 10;
	meshoy = 10;
	añohoy = 2022;
	
	resto = (añohoy-año);
	
	Escribir "Introduce el día de tu nacimiento:";
	Leer dia;
	Escribir "Introduce el mes de tu nacimiento:";
	Leer mes;
	Escribir "Introduce el número del año de tu nacimiento:";
	Leer año;
	
	Si (mes<meshoy) Entonces
		resto = (añohoy-año);
	SiNo 
		Si (mes>meshoy) Entonces
			resto = (añohoy-año)-1;
		SiNo
			Si (dia>diahoy) Entonces
				resto = (añohoy-año)-1;
			SiNo
				resto = (añohoy-año);
			FinSi
		FinSi
	Fin Si
	
	Escribir "Hoy es " , diahoy , "-" , meshoy , "-" , añohoy , ", " , "por lo tanto tienes " , resto , " años.";
	
FinAlgoritmo