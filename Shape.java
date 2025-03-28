package sd_Worksheet_3_3119655;

public abstract class Shape {

	    private String name;

	    public Shape(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public abstract double area();
	    public abstract double perimeter();

	    @Override
	    public String toString() {
	        return name;
	    
	}
}
