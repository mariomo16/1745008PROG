Algoritmo ejercicio1
	
	diahoy = 10;
	meshoy = 10;
	a�ohoy = 2022;
	
	resto = (a�ohoy-a�o);
	
	Escribir "Introduce el d�a de tu nacimiento:";
	Leer dia;
	Escribir "Introduce el mes de tu nacimiento:";
	Leer mes;
	Escribir "Introduce el n�mero del a�o de tu nacimiento:";
	Leer a�o;
	
	Si (mes<meshoy) Entonces
		resto = (a�ohoy-a�o);
	SiNo 
		Si (mes>meshoy) Entonces
			resto = (a�ohoy-a�o)-1;
		SiNo
			Si (dia>diahoy) Entonces
				resto = (a�ohoy-a�o)-1;
			SiNo
				resto = (a�ohoy-a�o);
			FinSi
		FinSi
	Fin Si
	
	Escribir "Hoy es " , diahoy , "-" , meshoy , "-" , a�ohoy , ", " , "por lo tanto tienes " , resto , " a�os.";
	
FinAlgoritmo