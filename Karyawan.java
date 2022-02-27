import java.util.Scanner;

public class Karyawan {
Scanner sc = new Scanner (System.in);
	//Properties
		String kode = " ";
		String nama = " ";
		String jk = " ";
		String jabatan = " ";
		double gaji = 0;
	
	public Karyawan () {
		//Constuctor
		this.kode = kode;
		this.nama = nama;
		this.jk = jk;
		this.jabatan = jabatan;
		this.gaji = gaji; 
	}
	
	public static void main(String[] args) {
		new Karyawan ();

	}

}
