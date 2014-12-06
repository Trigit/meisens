package pojo;

import java.math.BigDecimal;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8563652622145240311L;

	// Fields
	private String id;
	private String name;
	private BigDecimal mobilePhone;
	private String email;
	private BigDecimal phone;
	private String about;
	private String content;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(String name, BigDecimal mobilePhone, String email, BigDecimal phone, String about, String content) {
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.phone = phone;
		this.about = about;
		this.content = content;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(BigDecimal mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getPhone() {
		return this.phone;
	}

	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}

	public String getAbout() {
		return this.about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", mobilePhone=" + mobilePhone + ", email=" + email + ", phone="
				+ phone + ", about=" + about + ", content=" + content + "]";
	}

}