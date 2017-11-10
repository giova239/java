/**
 *
 * @author giovanni.stevanato
 */
public class PuntoMappa {
	protected int stop_id;
	protected String stop_name;
	protected double stop_lat;
	protected double stop_lon; 

	public PuntoMappa(int stop_id, String stop_name, double stop_lat, double stop_lon) {
		this.stop_id = stop_id;
		this.stop_name = stop_name;
		this.stop_lat = stop_lat;
		this.stop_lon = stop_lon;
	}

	public int getStop_id() {
		return stop_id;
	}

	public String getStop_name() {
		return stop_name;
	}

	public double getStop_lat() {
		return stop_lat;
	}

	public double getStop_lon() {
		return stop_lon;
	}

	public void setStop_id(int stop_id) {
		this.stop_id = stop_id;
	}

	public void setStop_name(String stop_name) {
		this.stop_name = stop_name;
	}

	public void setStop_lat(double stop_lat) {
		this.stop_lat = stop_lat;
	}

	public void setStop_lon(double stop_lon) {
		this.stop_lon = stop_lon;
	}
	
	@Override
	public String toString(){
		return "[" + String.valueOf(this.stop_id) + " ; " + this.stop_name + " ; " + String.valueOf(stop_lat) + " ; " + String.valueOf(stop_lon) + "]";
	}
}
