package com.example.demo;

public class Greeting {
	
	private final long id; //final garante a imutabilidade
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
}