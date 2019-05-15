package Trabalho;

abstract class GeraNomes {
	public static String NomePokemon() {
		String[] Iniciais = 		{"Pi",	"Pu",	"Amu",	"Me",	"Ga",	"Ska",	"Sno",	"Mu",	"Me",	"Aka",	"Shi",	"Ine",	"Ba",	"Ca",	"Sno",	"Mu",	"Cha",	"Squi",	"War",	"Wee",	"Pi",	"Sand",	"Bee"}; //tem 23
		String[] Intermediarias = 	{"pli",	"sa",	"ka",	"ku",	"na",	"ti",	"ca",	"te",	"be",	"ma",	"pli",	"gli",	"na",	"su"}; //tem 14
		String[] Finais = 			{"king","dgey",	"shrew","kans",	"row",	"drill","queen","fairy","pix",	"puff",	"bat",	"oom",	"sect",	"moth"};//tem 14
		int Tamanho = (int)(Math.random()*2 + 1 );
		int index = (int)(Math.random()*23);
		String nome=Iniciais[index];
		
		while ( (Tamanho--)>1 ) {
			index = (int)(Math.random()*14);
			nome=nome + Intermediarias[index];
		}
		index = (int)(Math.random()*14);
		nome+=Finais[index];
		return nome;
	}
	public static String NomeAtaque() {
		String[] Iniciais = 		{"Investida",	"Soco",	"Raio",	"Rugido",	"Tapa",	"Peido",	"Sopro",	"Chute",	"Esfera",	"Apito",	"Lamina",	"Tempestade",	"Tornado",	"Guarda",	"Promessa",	"Danca",	"Sonho",	"Pesadelo",	"Rajada",	"Chicote",	"Bomba",	"Parede",	"Rajada"}; //tem 23
		String[] Finais = 		{"de fogo","de Agua",	"mortal","do infinito",	"de raio",	"do sono","atordoante","de petalas","de folhas",	"de pedra",	"de semente",	"de madeira",	"ofuscante",	"flamejante"};//tem 14
		int index = (int)(Math.random()*23);
		String nome=Iniciais[index];
		index = (int)(Math.random()*14);
		nome+=" " + Finais[index];
		return nome;
	}
	public static String NomeTreinador() {
		String[] Nomes = {"Kaue", "Ricardo", "Marcelo", "Ash", "Joseph", "Luiz", "Marcos", "Rogerinho", " Martha", "Dilma", "Bolsonaro", "Danilo", "Popeye", "Mickey", "Steven", "Steve", "Boris", "Yuri", "Iuri", "Sover", "Mican", "Toucan", "Poe", "Pringles", "Ruffles", "Diamante Negro", "Microsoft", "Andrez", "Coisa", "Eloísa", "Luíza", "Isabella", "Fernanda", "Giovana", "Giovane", "Tuga", "Tuca", "Puca", "Garu", "Scanfenfan", "Scafen", "Nhec"};
		return Nomes[(int)(Math.random()*42)];
		
	}
}
