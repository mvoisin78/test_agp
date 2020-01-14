package data;

public abstract class AbstractSite {
	private String name;
	private int price;
	private String description;
	protected SiteEnum type;
	private Coordinates coordinates;
//	private int id_site;
	
	public AbstractSite() {
	}

	public String getType() {
		return type.name().toLowerCase();
	}

	public void setType(SiteEnum type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

//	public int getId_site() {
//		return id_site;
//	}
//
//	public void setId_site(int id_site) {
//		this.id_site = id_site;
//	}

}
