/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsi_123200021;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class ViewDetailHarga extends JFrame{
    JLabel lNama = new JLabel("Nama  : ");
    JLabel lMassa = new JLabel("Massa  : ");
    JLabel lHarga = new JLabel("Harga  : ");  
    JLabel lTotal = new JLabel("Total Harga  : ");      
    
    public JLabel l2Nama = new JLabel();
    public JLabel l2Massa = new JLabel();
    public JLabel l2Harga = new JLabel();  
    public JLabel l2tot = new JLabel();
          
    JButton btnKembali = new JButton("Kembali");   
    

    public ViewDetailHarga() {    
        
        setTitle("Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);       
        
        add(lNama);
        lNama.setBounds(60, 60, 90, 20);
        add(l2Nama);
        l2Nama.setBounds(110, 60, 120, 20);
        
        add(lMassa);
        lMassa.setBounds(60, 100, 90, 20);
        add(l2Massa);
        l2Massa.setBounds(110, 100, 120, 20);
        
        add(lHarga);
        lHarga.setBounds(60, 140, 90, 20);
        add(l2Harga);
        l2Harga.setBounds(110, 140, 120, 20);      
        
        add(lTotal);
        lTotal.setBounds(40, 180, 90, 20);
        add(l2tot);
        l2tot.setBounds(120, 180, 120, 20);  
        
        add(btnKembali);
        btnKembali.setBounds(110, 220, 90, 20);
    }
}
