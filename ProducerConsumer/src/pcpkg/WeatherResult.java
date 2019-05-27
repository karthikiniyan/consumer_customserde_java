package pcpkg;


public class WeatherResult {
	
	public double getMxtemp() {
		return mxtemp;
	}
	public void setMxtemp(double mxtemp) {
		this.mxtemp = mxtemp;
	}
	public double getMntemp() {
		return mntemp;
	}
	public void setMntemp(double mntemp) {
		this.mntemp = mntemp;
	}
	public double getAvgtemp() {
		return avgtemp;
	}
	public void setAvgtemp(double avgtemp) {
		this.avgtemp = avgtemp;
	}
	
	private double mxtemp;
	private double mntemp;
	private double avgtemp;
	

}
