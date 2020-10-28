/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan20.targetsaldotabungan;

/**
 *
@author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Target Saldo Tabungan
 */
public class PBOIF210119060Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double saldoTarget, bunga, saldo, saldoAwal, saldoAkhir;
            
            saldoAwal = 3500000;
            bunga = 8;
            saldoTarget = 6000000;
            saldoAkhir = 0;
            
             for(int i= 1 ; saldoAkhir <= saldoTarget; i++){
                    saldo = saldoAwal * bunga / 100;
                    saldoAkhir = saldo + saldoAwal;
                    System.out.printf(" Saldo di bulan ke- " + i + " Rp.%,1.0f%n ", +saldoAkhir);
                    saldoAwal += saldo;
              }
             }
    
}
