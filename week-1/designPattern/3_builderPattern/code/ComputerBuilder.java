package com.builder;

public class ComputerBuilder {
	private int ram = 4;
	private String cpu = "Intel";
	private int storage = 64;
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	public ComputerBuilder setStorage(int storage) {
		this.storage = storage;
		return this;
	}
	
	public Computer buildComputer() {
		return new Computer(ram, cpu, storage);
	}
	
	
}
