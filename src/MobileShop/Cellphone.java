package MobileShop;

public class Cellphone {
		private int mobileid;
		private String brandname, modelname,ram,rom,processor,buydate, selldate;
		private String currentstatus;
	    private double priceofcellphone;
		public double getPriceofcellphone() {
			return priceofcellphone;
		}
		public void setPriceofcellphone(double priceofcellphone) {
			this.priceofcellphone = priceofcellphone;
		}
		public int getMobileid() {
			return mobileid;
		}
		public void setMobileid(int mobileid) {
			this.mobileid = mobileid;
		}
		public String getBrandname() {
			return brandname;
		}
		public void setBrandname(String brandname) {
			this.brandname = brandname;
		}
		public String getModelname() {
			return modelname;
		}
		public void setModelname(String modelname) {
			this.modelname = modelname;
		}
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
		public String getRom() {
			return rom;
		}
		public void setRom(String rom) {
			this.rom = rom;
		}
		public String getProcessor() {
			return processor;
		}
		public void setProcessor(String processor) {
			this.processor = processor;
		}
		public String getBuydate() {
			return buydate;
		}
		public void setBuydate(String buydate) {
			this.buydate = buydate;
		}
		public String getSelldate() {
			return selldate;
		}
		public void setSelldate(String selldate) {
			this.selldate = selldate;
		}
		
		public String getCurrentstatus() {
			return currentstatus;
		}
		public void setCurrentstatus(String currentstatus) {
			this.currentstatus = currentstatus;
		}
		public Cellphone() {
		}
		public Cellphone(int mobileid, String brandname,String modelname,
				String ram,String rom,String processor,String buydate, String selldate,
				String currentstatus,double priceofcellphone) {
		        this.mobileid=mobileid;
		        this.brandname=brandname;
		        this.modelname=modelname;
		        this.ram=ram;
		        this.rom=rom;
		        this.processor=processor;
		        this.buydate=buydate;
		        this.selldate=selldate;
		        this.currentstatus=currentstatus;
		        this.priceofcellphone=priceofcellphone;        
		}
}
