package com.y.guice;

import com.google.inject.ImplementedBy;

//@ImplementedBy(NDCache.class)
public interface Cache {
	
	public void init();
	
	public void populateMemCache();
	
	public void destroy();
	
	public void refresh();

}
