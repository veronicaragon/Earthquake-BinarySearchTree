public class Earthquake {
  //Private instance variables to store magnitude, date, and place info of the earthquake
  private double magnitude;
  private String date;
  private String place;
	private Earthquake left = null;
  private Earthquake right = null;
		//Constructor to initialize an Earthquake object with given magnitude, date, and place.
    public Earthquake(double magnitude, String date, String place) {
        this.magnitude = magnitude;
        this.date = date;
        this.place = place;
    }
		//Getter methods to access private instance variables
    public double getMagnitude()
    {
        return this.magnitude;
    }
    public String getDate()
    {
        return this.date;
    }
    public String getPlace()
    {
        return this.place;
    }
    public Earthquake getLeft()
    {
        return this.left;
    }
    public Earthquake getRight()
    {
        return this.right;
    }
		//Setter methods to modify private instance variables
    public void setMagnitude(double magnitude)
    {
        this.magnitude = magnitude;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setPlace(String place)
    {
        this.place = place;
    }
    public void setLeft(Earthquake quake)
    {
        this.left = quake;
    }
    public void setRight(Earthquake quake)
    {
        this.right = quake;
    }
		//Override toString method to provide a string representation of the Earthquake object.
    public String toString()
    {
        return "Earthquake (magnitude=" + getMagnitude() + ", place=" + getPlace() + ", date=" + getDate()+")";
    }
}
