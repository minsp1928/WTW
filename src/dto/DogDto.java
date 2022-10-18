package dto;

import java.sql.Date;

public class DogDto {
	private int dog_num;
	private String id;
	private String dog_size;
	private String dog_name;
	private String dog_gen;
	private String dog_breed;
	private int dog_age;
	private Date dog_hi;
	private Date dog_bye;
	private Date dog_update_date;
	
	public DogDto() {
		// TODO Auto-generated constructor stub
	}

	public DogDto(int dog_num, String id, String dog_size, String dog_name, String dog_gen, String dog_breed,
			int dog_age, Date dog_hi, Date dog_bye, Date dog_update_date) {
		super();
		this.dog_num = dog_num;
		this.id = id;
		this.dog_size = dog_size;
		this.dog_name = dog_name;
		this.dog_gen = dog_gen;
		this.dog_breed = dog_breed;
		this.dog_age = dog_age;
		this.dog_hi = dog_hi;
		this.dog_bye = dog_bye;
		this.dog_update_date = dog_update_date;
	}

	public int getDog_num() {
		return dog_num;
	}

	public void setDog_num(int dog_num) {
		this.dog_num = dog_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDog_size() {
		return dog_size;
	}

	public void setDog_size(String dog_size) {
		this.dog_size = dog_size;
	}

	public String getDog_name() {
		return dog_name;
	}

	public void setDog_name(String dog_name) {
		this.dog_name = dog_name;
	}

	public String getDog_gen() {
		return dog_gen;
	}

	public void setDog_gen(String dog_gen) {
		this.dog_gen = dog_gen;
	}

	public String getDog_breed() {
		return dog_breed;
	}

	public void setDog_breed(String dog_breed) {
		this.dog_breed = dog_breed;
	}

	public int getDog_age() {
		return dog_age;
	}

	public void setDog_age(int dog_age) {
		this.dog_age = dog_age;
	}

	public Date getDog_hi() {
		return dog_hi;
	}

	public void setDog_hi(Date dog_hi) {
		this.dog_hi = dog_hi;
	}

	public Date getDog_bye() {
		return dog_bye;
	}

	public void setDog_bye(Date dog_bye) {
		this.dog_bye = dog_bye;
	}

	public Date getDog_update_date() {
		return dog_update_date;
	}

	public void setDog_update_date(Date dog_update_date) {
		this.dog_update_date = dog_update_date;
	}
	
}