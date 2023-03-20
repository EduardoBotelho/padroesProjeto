import br.com.dio.gof.Singleton.SingletonEager;
import br.com.dio.gof.Singleton.SingletonLazy;
import br.com.dio.gof.Singleton.SingletonLazyHolder;
import br.com.dio.gof.startegy.Robo;
import br.com.dio.gof.startegy.comportamentoAgressivo;
import br.com.dio.gof.startegy.comportamentoDefensivo;
import br.com.dio.gof.startegy.comportamentoNormal;
import facade.Facede;

public class Test {

	public static void main(String[] args) {
		
		
		
		//Singleton
				SingletonLazy lazy =  SingletonLazy.getInstancia();
				System.out.println(lazy);
				lazy = SingletonLazy.getInstancia();
				System.out.println(lazy);
				
				
				SingletonEager eager =  SingletonEager.getInstancia();
				System.out.println(eager);
				eager = SingletonEager.getInstancia();
				System.out.println(eager);
				
				SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
				System.out.println(lazyHolder);
				lazyHolder = SingletonLazyHolder.getInstancia();
				System.out.println(lazyHolder);
				
				//Strategy
					comportamentoNormal normal = new  comportamentoNormal();
					comportamentoDefensivo defensivo = new comportamentoDefensivo();
					comportamentoAgressivo agressivo = new comportamentoAgressivo();
					
					Robo robo = new Robo();
					robo.setComportamento(normal);
					
					robo.mover();
					robo.mover();
				
					robo.setComportamento(defensivo);
					
					robo.mover();
					
					robo.setComportamento(agressivo);
					
					robo.mover();
					robo.mover();
					robo.mover();
					
					//Facede
					
					Facede facede = new Facede();
					facede.migrarCliente("Eduardo", "1234567");
					
				

	}

}
