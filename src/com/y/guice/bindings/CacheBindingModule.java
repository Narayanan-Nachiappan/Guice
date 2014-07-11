package com.y.guice.bindings;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.y.guice.Cache;
import com.y.guice.DCache;

public class CacheBindingModule implements Module {

	@Override
	public void configure(Binder binder) {
		// TODO Auto-generated method stub
		//Binding at class level. You can also bind at instance level.
		binder.bind(Cache.class).to(DCache.class);
	}
	

}
