package com.billpoon.generics;

public class GenericsClass<T> implements GenericsInterface<T> {

	private T t;
	
	@Override
	public T outputSomething() {
		return t;
	}

	public GenericsClass(T t) {
		this.t = t;
	}

}
