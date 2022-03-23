package com.java.project.abstraction.interfce;

import com.java.project.accessspecifiers.Test;

public class Owner {
	public static void main(String[] args) {
		Calculator c = new Casio();
		System.out.println(c.add(3, 4));
		System.out.println(c.sub(4, 3));
		System.out.println(c.mul(2, 3));
		System.out.println(c.div(9, 3));
	}

}
