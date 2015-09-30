public class Triangle extends GeometricObject {
		    
	//this class extends geometric object creating a new triangle with the sides put in.
	// the file calculates the area and perimeter using respective formulas and returns the values of each
	//
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	//creates new triangle object and prepares for construction
	Triangle triangle = new Triangle(side1, side2, side3);
		    
	public Triangle() {
		    }
		    
	public Triangle(double side1, double side2, double side3) {
		
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
		    }
//getters and setters for each method, gets all the information and sets it for this instance
    public double getArea() {
		    	
    	    double p = getPerimeter() / 2;
    	    return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
		    	
		    }
//adds sides to get the perimeter of the triangle
    public double getPerimeter() {
    	
	        return side1 + side2 + side3;
		    }

    // gets and sets each side from input
    public double getSide1() {
    	
	        return side1;
		    }

    public double getSide2() {
    	
	        return side2;
	    }

    public double getSide3() {
    	
	        return side3;
		    }
    public void setSide1(double side1) {
    	
	        this.side1 = side1;
		    }

    public void setSide2(double side2) {
    	
	        this.side2 = side2;
		    }

    public void setSide3(double side3) {
    	
	        this.side3 = side2;
		    }
// returns string stating the side information of the triangle
    public String toString() {
		    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
		           + " Side 3 = " + side3;
		    }
		
		
		
	
	}


