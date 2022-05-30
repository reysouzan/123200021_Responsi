package Responsi_123200021;
import javax.swing.*;
public class ViewInputBarang extends JFrame{
  
    JLabel ljudul = new JLabel("Input Barang");
    JLabel lnama = new JLabel("Nama");
    JLabel lmassa = new JLabel("Massa(gr)");
    JLabel lharga = new JLabel("Harga Satuan");
    public JTextField tfnama = new JTextField();
    public JTextField tfmassa = new JTextField();
    public JTextField tfharga = new JTextField();
    public JButton btnSubmit = new JButton("Submit");
    public JButton btnReset = new JButton("Reset");
    public JButton btnKembali = new JButton("Kembali");

    public ViewInputBarang() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(200,200);
        
        add(ljudul);
        ljudul.setBounds(10, 10, 80, 20);
        
        add(lnama);
        lnama.setBounds(10, 30, 80, 20);
        add(tfnama);
        tfnama.setBounds(90, 30, 80, 20);
        
        add(lmassa);
        lmassa.setBounds(10, 50, 80, 20);
        add(tfmassa);
        tfmassa.setBounds(90, 50, 80, 20);
        
        add(lharga);
        lharga.setBounds(10, 70, 80, 20);
        add(tfharga);
        tfharga.setBounds(90, 70, 80, 20);
        
        add(btnSubmit);
        btnSubmit.setBounds(10, 100, 80, 20);
        
        add(btnReset);
        btnReset.setBounds(90, 100, 80, 20);
        
        add(btnKembali);
        btnKembali.setBounds(10, 130, 160, 20);
    }
    public String getTFNama() {
        String nama = tfnama.getText();
        return nama;
    }

    public Double getTFMassa() {
        if(tfmassa.getText().isEmpty()){
            double massa = 0;
            return massa;
        }
        else{
            double massa = Double.parseDouble(tfmassa.getText());
            return massa;
        }
    }

    public Double getTFHarga() {
        if(tfharga.getText().isEmpty()){
            double harga = 0;
            return harga;
        }
        else{
            double harga = Double.parseDouble(tfharga.getText());
            return harga;
        }
        
    }
}
