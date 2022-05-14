package hashTable;

public class Main {

	public static void main(String[] args) {
		
		TabelaHash tabelaHash = new TabelaHash(10);
		
		tabelaHash.inserir("542.443.545-00", "João");
		tabelaHash.inserir("999.999.999-99", "Maria");
		tabelaHash.inserir("123.435.655-00", "Pedro");
		
		//tabelaHash.inserir("123.435.655-00", "Pedro2");
		
		System.out.println(tabelaHash.recuperar("542.443.545-00"));
		System.out.println(tabelaHash.recuperar("999.999.999-99"));
		System.out.println(tabelaHash.recuperar("123.435.655-00"));
		
		TabelaHash3 tabelaHash3 = new TabelaHash3(10);
		
		System.out.println("--------------");
		tabelaHash3.inserir("542.443.545-00", "João");
		tabelaHash3.inserir("999.999.999-99", "Maria");
		tabelaHash3.inserir("123.435.655-00", "Pedro");
		System.out.println();
		  
		tabelaHash3.deletarChave("999.999.999-99");
		System.out.println(tabelaHash3.recuperar("542.443.545-00"));
		System.out.println(tabelaHash3.recuperar("999.999.999-99"));
		System.out.println(tabelaHash3.recuperar("123.435.655-00"));
		
		
	}

}
