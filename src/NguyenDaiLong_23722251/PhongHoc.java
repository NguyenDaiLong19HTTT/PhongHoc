package NguyenDaiLong_23722251;

public abstract class PhongHoc {
	public abstract boolean datChuan();
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	public String getMaPhong() {
		return maPhong;
	}
	
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	
	public String getDayNha() {
		return dayNha;
	}
	
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	
	public double getDienTich() {
		return dienTich;
	}
	
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	public int getSoBongDen() {
		return soBongDen;
	}
	
	public void setSoBongDen(int so) throws Exception {
		if (so > 0) {
			this.soBongDen = so;

		} else {
			throw new Exception("1");

		}
	}

	public PhongHoc(String maPhong, String dayNha, double dienTich, int so) throws Exception {
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		if (so > 0) {
			this.soBongDen = so;

		} else {
			throw new Exception("1");
		}
	}
	public boolean duSang() {
		if(getDienTich()/ getSoBongDen() <= 10) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		String duSang = duSang()?"du anh sang" :"khong du anh sang";
		String s ="";
		s+=s.format("|%10s|%10s|%10s|%10s|%10s|", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(),duSang);
		return s;
	}	
}