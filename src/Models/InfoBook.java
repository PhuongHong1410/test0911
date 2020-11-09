package Models;



import javafx.beans.property.DoubleProperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InfoBook {
	private StringProperty MaSach ;
	private StringProperty TenSach;
	private StringProperty LoaiSach;
	private StringProperty TacGia;
	private DoubleProperty DonGia;
	private IntegerProperty SoLuong;
	private StringProperty NhaXuatBan;
	private StringProperty QuocGia;
	

	public String getMaSach() {
		return MaSach.get();
	}

	public void setMaSach (String MaSach) {
		this.MaSach = new SimpleStringProperty(MaSach);
	}

	public String getTenSach() {
		return TenSach.get();
	}

	public void setTenSach(String TenSach) {
		this.TenSach = new SimpleStringProperty(TenSach);
	}

	public String getLoaiSach() {
		return LoaiSach.get();
	}

	public void setLoaiSach(String LoaiSach) {
		this.LoaiSach = new SimpleStringProperty(LoaiSach);
	}

	public String getTacGia() {
		return TacGia.get();
	}

	public void setTacGia(String TacGia) {
		this.TacGia = new SimpleStringProperty(TacGia);
	}

	public Double getDonGia() {
		return DonGia.get();
	}

	public void setDonGia(Double DonGia) {
		this.DonGia = new SimpleDoubleProperty(DonGia);
	}

	public Integer getSoLuong() {
		return SoLuong.get();
	}

	public void setSoLuong(Integer SoLuong) {
		this.SoLuong = new SimpleIntegerProperty(SoLuong);
	}

	public String getNhaXuatBan() {
		return NhaXuatBan.get();
	}
	public void setNhaXuatBan(String NhaXuatBan) {
		this.NhaXuatBan = new SimpleStringProperty(NhaXuatBan);
	}
	
	public void setQuocGia(String QuocGia) {
		this.QuocGia = new SimpleStringProperty(QuocGia);
	}
	public String getQuocGia() {
		return QuocGia.get();
	}

	

	public InfoBook() {
	}
	public InfoBook(String MaSach,String TenSach, String LoaiSach, String TacGia,Double DonGia,
			 Integer SoLuong,	String NhaXuatBan, String QuocGia) {
		this.MaSach = new SimpleStringProperty(MaSach);
		this.TenSach = new SimpleStringProperty(TenSach);
		this. LoaiSach = new SimpleStringProperty( LoaiSach);
		this.TacGia = new SimpleStringProperty(TacGia);
		this.DonGia=new SimpleDoubleProperty(DonGia);
		this.SoLuong = new SimpleIntegerProperty(SoLuong);
		this.NhaXuatBan = new SimpleStringProperty(NhaXuatBan);
		this.QuocGia = new SimpleStringProperty(QuocGia);
		
		
	}
}


