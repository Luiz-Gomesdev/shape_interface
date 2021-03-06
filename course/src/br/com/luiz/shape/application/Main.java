package br.com.luiz.shape.application;


import java.util.Locale;

import br.com.luiz.shape.entitie.AbstractShape;
import br.com.luiz.shape.entitie.Circle;
import br.com.luiz.shape.entitie.Rectangle;
import br.com.luiz.shape.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
