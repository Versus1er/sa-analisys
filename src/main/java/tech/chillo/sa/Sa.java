package tech.chillo.sa;

public class Sa {
	private Long id;
	private String message;
	private String status;
	
	

	public Sa() {
		super();
	}

	public Sa(Long id, String message, String status) {
		super();
		this.id = id;
		this.message = message;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
