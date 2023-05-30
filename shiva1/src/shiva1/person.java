package shiva1;

public class person {
	private int id;
	private String fname;
	private String lname;
	private String emailid;
	private long  phnumber;
	public int getid() {
		return id;
	}
	public void setid( int id) {
		this.id=id;
		
	}
	public String getfname() {
		return fname;
	}
	public void setFname( String fname) {
		this.fname=fname;
		
	}
	public String getlname() {
		return lname;
	}
	public void setLname( String lname) {
		this.lname=lname;
		
	}
	public String getemailid() {
		return emailid;
	}
	public void setemailid( String emailid) {
		this.emailid=emailid;
		
	}
	public long getphnumber() {
		return phnumber;
		
	}
	public void setPhnumber(long phnumber) {
		this .phnumber=phnumber;
	}
	public person(int id, String fname, String lname, String emailid, long phnumber) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.phnumber = phnumber;
	}
	@Override
	public String toString() {
		
		return "person[id="+id+"fname="+fname+"laname="+lname+"emailid="+emailid+"phnumber="+phnumber+"]";
	}
	
	
	}
		
	
	
	
	
	
		
	


