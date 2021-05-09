
package konstruktorparameter;


class KonstruktorParameter {
    
     //nama konstruktor = nama kelas

 String nama;
 int umur;
 
 konstruktor_paramater(String x, int y) {
     
  nama = x;
  umur = y;
 }

 void tampil(){
     
  System.out.println("Nama = " + nama );
  System.out.println("Umur = " + umur );
 }

 public static void main(String[] args) {
  
                System.out.println("Konstruktor dan Parameter");
                System.out.println("===========================================");
  konstruktor_paramater demoConstructor = new konstruktor_paramater("Yusuf",25);
  demoConstructor.tampil();

 }
}

        
   }
    

