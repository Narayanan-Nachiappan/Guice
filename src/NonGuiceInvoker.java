import com.y.guice.Cache;
import com.y.guice.DCache;
import com.y.guice.NDCache;


public class NonGuiceInvoker {


	public static void main (String a[]){

		Cache dCache = new DCache("file", "xx");
		Cache ndCache = new NDCache("file","xx");
		System.err.println();;
		dCache.populateMemCache();
		System.err.println();
		ndCache.populateMemCache();
	}

}
