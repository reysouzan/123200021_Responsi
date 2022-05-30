package Responsi_123200021;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class InputBCon {
    ViewInputBarang VIB;
    ModelBarang modelB;

    public InputBCon(ViewInputBarang viewinputbarang, ModelBarang modelbarang) {
        this.VIB = viewinputbarang;
        this.modelB = modelbarang;
        
        viewinputbarang.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewMainMenu viewmainmenu =new ViewMainMenu();
                viewinputbarang.setVisible(false);
                MainMenuCon Start=new MainMenuCon(viewmainmenu);
            }
        });
        
        viewinputbarang.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(viewinputbarang.getTFNama().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTFHarga()==0){
                    JOptionPane.showMessageDialog(null, "Harga Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTFMassa()==0){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTFHarga()<0){
                    JOptionPane.showMessageDialog(null, "Harga Harus Positif");
                }
                else if(viewinputbarang.getTFMassa()<0){
                    JOptionPane.showMessageDialog(null, "Massa Harus Positif");
                }
                else{
                    modelbarang.insertData(viewinputbarang.getTFNama(), viewinputbarang.getTFMassa(), viewinputbarang.getTFHarga());
                }
                
            }
        });
        viewinputbarang.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewinputbarang.tfnama.setText("");
                viewinputbarang.tfmassa.setText("");
                viewinputbarang.tfharga.setText("");
            }
        });
    }
}
