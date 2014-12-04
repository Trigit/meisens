package pojo;

/**
 * @Class Description:留言POJO
 * @author Boki
 * @Date 2014年12月3日 - 上午12:04:21
 */
public class Message {

	// primary key
	private long id;
	private String name;
	private long mobilePhone;
	private String email;
	private long phone;
	private Long about;
	private Long content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(long mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Long getAbout() {
		return about;
	}

	public void setAbout(Long about) {
		this.about = about;
	}

	public Long getContent() {
		return content;
	}

	public void setContent(Long content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", mobilePhone=" + mobilePhone + ", email=" + email + ", phone="
				+ phone + ", about=" + about + ", content=" + content + "]";
	}

}
