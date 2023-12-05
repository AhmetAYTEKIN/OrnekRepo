
package ahmetaytekin;

//Ahmet Aytekin 02205076014 3.sınıf (iö)


public class AhmetAytekin {

    
   
    public static void main(String[] args) {
        //
        String metin = "ADCCBCBA";            //A,B,C ve D harflerinden oluşan 8 elemanlı metin
        char karakter1 = 'A';
        char karakter2 = 'B';
        char karakter3 = 'C';
        char karakter4 = 'D';
        int Atane = 0;
        int Btane = 0;
        int Ctane = 0;
        int Dtane = 0;
        char[] harf = new char[4];
        harf[0] = 'A';
        harf[1] = 'B';
        harf[2] = 'C';
        harf[3] = 'D';
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter1 == metin.charAt(i)) {
                ++Atane;
            }
            if(karakter2 == metin.charAt(i)) {
                ++Btane;
            }
            if(karakter3 == metin.charAt(i)) {
                ++Ctane;
            }
            if(karakter4 == metin.charAt(i)) {
                ++Dtane;
            }
        }
        
        int[] frekans = new int[4];
        frekans[0] = Atane;
        frekans[1] = Btane;
        frekans[2] = Ctane;
        frekans[3] = Dtane;
        
        
        for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                if(frekans[i]>frekans[j]){
                    int sayi = frekans[i];
                    frekans[i]=frekans[j];
                    frekans[j] = sayi;
                    
                    char hd = harf[i];
                    harf[i]=harf[j];
                    harf[j] = hd;
                }
            }
        }
        
        int[] kod = new int[4];    //Frekansın büyüklüğüne göre eşleşen hazır Huffman kodu
        kod[0] = 111 ;
        kod[1] = 110 ;
        kod[2] = 10 ;
        kod[3] = 0 ;
        
        karakter1= harf[0];
        karakter2= harf[1];
        karakter3= harf[2];
        karakter4= harf[3];
        
        System.out.println("Harf     Frekans    Kod  ");
        for(int i=0; i<4; i++){
            System.out.print(harf[i]);
            System.out.print("           " + frekans[i]);
            System.out.println("        " + kod[i]);
        }
        //-----------------HUFFMAN--------------------------------
        int[] huffman = new int[8];
        for(int i = 0; i < metin.length(); i++) {
            if(karakter1 == metin.charAt(i)) {
                huffman[i] = 111;
            }
            if(karakter2 == metin.charAt(i)) {
                huffman[i] = 110;
            }
            if(karakter3 == metin.charAt(i)) {
                huffman[i] = 10;
            }
            if(karakter4 == metin.charAt(i)) {
                huffman[i] = 0;
            }
        }
        System.out.print("Hoffman: ");
        for(int i=0; i<8; i++){
            System.out.print(huffman[i]);
            
        }
        System.out.println(" ");
    }
}