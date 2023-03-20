package br.com.dio.gof.Singleton;

/**
 * Singleton apressado
 * @author Eduardo
 * */
public class SingletonEager {
	

	
		private static SingletonEager instancia = new SingletonEager();

		private  SingletonEager() {
			super();
		} 
			
		
		
		public static SingletonEager getInstancia() {
					return instancia;
		}
}
