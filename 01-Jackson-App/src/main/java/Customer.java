
public class Customer {
	private  Integer cid;
	private String cname;
	private String cemails;
	
	public Customer() {
		
	}
	
	public Customer(Integer cid, String cname, String cemails) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemails = cemails;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemails() {
		return cemails;
	}
	public void setCemails(String cemails) {
		this.cemails = cemails;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemails=" + cemails + "]";
	}
	
	
	
	

}
