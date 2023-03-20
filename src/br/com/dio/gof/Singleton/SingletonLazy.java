package br.com.dio.gof.Singleton;

/**
 * Singleton preguiçoso
 * @author Eduardo
 * */

public class SingletonLazy {
	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
