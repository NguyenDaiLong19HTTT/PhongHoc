package NguyenDaiLong_23722251;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

public class ListPhong {
	List<PhongHoc> ls;
	public ListPhong() {
		ls = new ArrayList<PhongHoc>(2);
	}
	
	public boolean themPhong(PhongHoc p) {
		if (ls.contains(p)) {
			return false;
		} else {
			return ls.add(p);
		}
	}
	
	public void sapXep() {
		Collections.sort(ls, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				String x = new String(o1.getMaPhong());
				String y = new String(o2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}
		});
	}
	public List<PhongHoc> xuatDS(){
		return ls;
	}
	public List<PhongHoc> dsPhongDatChuan(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for(PhongHoc ph : ls) {
			if(ph.datChuan())
				dsDC.add(ph);
			return dsDC;
		}
		return null;
	}
}
