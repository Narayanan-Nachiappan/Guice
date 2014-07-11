package com.y.guice.bindings;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.y.guice.Cache;
import com.y.guice.DCache;
import com.y.guice.NDCache;
import com.y.guice.bindings.annotations.DisCache;
import com.y.guice.bindings.annotations.NDisCache;

public class CacheMultiBindingModule implements Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(Cache.class).annotatedWith(DisCache.class).to(DCache.class);
		binder.bind(Cache.class).annotatedWith(NDisCache.class).to(NDCache.class);
		// TODO Auto-generated method stub
		
	}

}
