public class MainData
{
	private String temp;
	private String feels_like;
	private String temp_min;
	private String temp_max;
	private String pressure;
	private String humidity;
	public String getTemp(){
		return temp;
		}
	public void setTemp(String temp){
		this.temp = temp;
		}
	public String getFeelsLike(){
		return getFeels_like();
		}
	public void setFeelsLike(String feels_like){
		this.setFeels_like(feels_like);
		}
	public String getTempMin(){
		return getTemp_min();
		}
	public void setTempMin(String temp_min){
		this.setTemp_min(temp_min);
		}
	public String getTempMax(){
		return getTemp_max();
		}
	public void setTempMax(String temp_max){
		this.setTemp_max(temp_max);
		}
	public String getPressure(){
		return pressure;
		}
	public void setPressure(String pressure){
		this.pressure = pressure;
		}
	public String getHumidity(){
		return humidity;
		}
	public void setHumidity(String humidity){
		this.humidity = humidity;
		}

	public String getFeels_like()
	{
		return feels_like;
	}

	public void setFeels_like(String feels_like)
	{
		this.feels_like = feels_like;
	}

	public String getTemp_min()
	{
		return temp_min;
	}

	public void setTemp_min(String temp_min)
	{
		this.temp_min = temp_min;
	}

	public String getTemp_max()
	{
		return temp_max;
	}

	public void setTemp_max(String temp_max)
	{
		this.temp_max = temp_max;
	}
}
