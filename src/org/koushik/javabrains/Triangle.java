package org.koushik.javabrains;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Triangle {

private Point pointA;
private Point pointB;
private Point pointC;

	public Point getPointA() {
	return pointA;
}

public void setPointA(Point pointA) {
	this.pointA = pointA;
}

public Point getPointB() {
	return pointB;
}

public void setPointB(Point pointB) {
	this.pointB = pointB;
}

public Point getPointC() {
	return pointC;
}

public void setPointC(Point pointC) {
	this.pointC = pointC;
}

	public void draw() {
		System.out.println("This is A::"+getPointA().getX()+"B::"+getPointA().getY());
		System.out.println("This is A::"+getPointB().getX()+"B::"+getPointB().getY());
		System.out.println("This is A::"+getPointC().getX()+"B::"+getPointC().getY());
	}
}
