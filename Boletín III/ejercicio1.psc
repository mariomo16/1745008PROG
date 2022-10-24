Algoritmo ejercicio1
	
	Escribir "¿Cuantos teclados vas a comprar?";
	Leer nteclados;
	
	pteclados = 26;
	
	Si nteclados<4 Entonces
		pteclados = 30
	SiNo 
		Si nteclados>8 Entonces
			pteclados = 20
		FinSi
	FinSi
	
	pfinal = (nteclados * pteclados);
	
	Escribir "Cada teclado cuesta " , pteclados , " euros";
	Escribir "El precio final es " , pfinal , " euros";
	
FinAlgoritmo
