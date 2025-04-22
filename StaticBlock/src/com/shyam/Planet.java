package com.shyam;

public class Planet {
	public String name;
	public int moons;

	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}

	public static void main(String[] args) {
		Planet planet[] = { new Planet("Venus", 0), new Planet("Mercury", 0), new Planet("Earth", 1),
				new Planet("Mars", 2) };

		System.out.println(planet);
		System.out.println(planet[2].name);
		System.out.println(planet[2].moons);
	}
}
