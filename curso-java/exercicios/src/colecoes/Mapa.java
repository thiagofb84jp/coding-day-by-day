package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Maria");
		usuarios.put(4, "Rebecca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20)); //true
		System.out.println(usuarios.containsValue("Rebecca")); //true
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui"));
		
		//for para percorrer os valores
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//for para percorrer os valores/nomes dos usuários dentro do Map
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//for para percorrer chave/valor
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "===>");
			System.out.println(registro.getValue());
		}
	}
}