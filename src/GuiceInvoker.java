

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.y.guice.Cache;
import com.y.guice.bindings.CacheNamedMultiBinding;


public class GuiceInvoker {
	
	@Inject @Named("disrtibuted") static Cache cache4 ;
	@Inject @Named("nondisrtibuted") static Cache cache5;
	
	Cache sampCach;
	
	@Inject
	public  GuiceInvoker(@Named("nondistributed") Cache c) {
		// TODO Auto-generated constructor stub
		sampCach = c;
	}


	public static void main (String a[]){


//		//1. Using simple injector, no binding classes. Interface annotated with @implementedBy 
//		Injector injector = Guice.createInjector();
//		//Gives new instance every time. Use @Singleton at class level to avoid that
//		Cache cache = injector.getInstance(Cache.class);
//		System.err.println();	;
//		cache.populateMemCache();
//		System.err.println();


		//2.Using binding class and then injecting
//
//		Injector injector1 = Guice.createInjector(new CacheBindingModule());
//		Cache cache1 = injector1.getInstance(Cache.class);
//		System.err.println();	;
//		cache1.populateMemCache();
//		System.err.println();
//		
//		//3. Using annotation to decide between two bindings for the same interface implementation.
//		Injector injector2 = Guice.createInjector(new CacheMultiBindingModule());
//		@DisCache Cache cache2 = injector2.getInstance(Cache.class);
//		@NDisCache Cache cache3 = injector2.getInstance(Cache.class);
//		System.err.println();	;
//		cache2.populateMemCache();
//		System.err.println();
//		cache3.populateMemCache();
		
		//3 to do 3 using constructor and inject
//		@Inject
//		  public RealBillingService(@PayPal CreditCardProcessor processor,
//		      TransactionLog transactionLog) {

		
		//Cant create annotation for every class implementation.
		
		//4. Use Names , more configurable
//		Injector injector3 = Guice.createInjector(new CacheNamedMultiBinding());
//		//injector3.get((Key.get(Cache.class, Names.named("distributed"))));
//		cache4 = (Cache)injector3.getInstance(Cache.class);
//		cache5 = (Cache)injector3.getInstance(Cache.class);
//		
//		System.err.println();	;
//		cache4.populateMemCache();
//		System.err.println();
//		cache5.populateMemCache();
//		
		
		//5. Figure out getinstance to call parameterized constructor
		
		//6. .class use new class() within binding and @singleton
		
		
		//7. @Provider
		
		Injector ij = Guice.createInjector(new CacheNamedMultiBinding());
		ij.getInstance(GuiceInvoker.class).sampCach.populateMemCache();
		//cache4 = ij.getInstance(Cache.class);
		//cache4.populateMemCache();
		//cache4.populateMemCache();
		
	}

}
