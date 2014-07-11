package com.y.guice.bindings;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.y.guice.Cache;
import com.y.guice.DCache;
import com.y.guice.NDCache;

public class CacheNamedMultiBinding implements Module {
	@Override
	public void configure(Binder binder) {
//		binder.bind(new TypeLiteral<Cache>(){}).annotatedWith(Names.named("nondistributed")).to(NDCache.class);
//		binder.bind(new TypeLiteral<Cache>(){}).annotatedWith(Names.named("distributed")).to(DCache.class);
		binder.bind(Cache.class).annotatedWith(Names.named("nondistributed")).to(NDCache.class);
		binder.bind(Cache.class).annotatedWith(Names.named("distributed")).to(DCache.class);

	}

}
