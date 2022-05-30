package Responsi_123200021;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class LihatBCon {
    ViewLihatBarang viewIB;
    ModelBarang modelB;
    public LihatBCon(ViewLihatBarang vlb, ModelBarang mb) {
        this.viewIB = vlb;
        this.modelB = mb;
        if (mb.getBanyakData()!=0) {
            String dataBarang[][] = mb.readBarang();
            vlb.tabel.setModel((new JTable(dataBarang, vlb.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
        
        
        vlb.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewMainMenu vmm=new ViewMainMenu();
                vlb.setVisible(false);
                MainMenuCon mmc=new MainMenuCon(vmm);
            }
        });
        
        vlb.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = vlb.tabel.getSelectedRow();                

                String dataterpilih = vlb.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                ViewBanyakBarang vbb=new ViewBanyakBarang();
                vlb.setVisible(false);
                BanyakBControl bbc=new BanyakBControl(vbb,dataterpilih,mb);                                                               
            }
        }
        );
    }
}
