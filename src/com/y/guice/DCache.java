package com.y.guice;



public class DCache implements Cache {

	private String file;

	private String delimiter;

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void populateMemCache() {
		// TODO Auto-generated method stub
		System.err.println("Distributed cache populated");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	public DCache(){

	}

	public DCache(String file, String delimiter){
		this.file = file;
		this.delimiter = delimiter;
	}

	public void setFile(String file){
		this.file = file;
	}

	public void setDelimiter(String delimiter){
		this.delimiter = delimiter;
	}
	
	public String getFile(){
		return file;
	}

	public String getDelimiter(){
		return delimiter;
	}


}
