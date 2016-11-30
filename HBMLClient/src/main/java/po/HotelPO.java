package po;

import java.awt.Image;
import java.io.Serializable;
import java.util.List;

public class HotelPO implements Serializable{
	String name;
	int id;
	int star;
	String address;
	int region;
	String introduction;
	String facility;
	List<Image> environment;
	int score;
	
	

	public HotelPO(String name, int id, int star, String address, int region, String introduction, String facility,
			List<Image> environment, int score) {
		super();
		this.name = name;
		this.id = id;
		this.star = star;
		this.address = address;
		this.region = region;
		this.introduction = introduction;
		this.facility = facility;
		this.environment = environment;
		this.score = score;
	}

	public HotelPO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public List<Image> getEnvironment() {
		return environment;
	}

	public void setEnvironment(List<Image> environment) {
		this.environment = environment;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
	
}
