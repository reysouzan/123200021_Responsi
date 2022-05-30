package Responsi_123200021;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainMenuCon {
    ViewMainMenu ViewMM;

    public MainMenuCon(ViewMainMenu vmm) {
        this.ViewMM = vmm;
        
        ViewMM.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ModelBarang modelbarang = new ModelBarang();
                ViewInputBarang inputbarang= new ViewInputBarang();
                ViewMM.setVisible(false);
                InputBCon inputbarangController=new InputBCon(inputbarang,modelbarang);
            }
        });
        
        ViewMM.btnLihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) { 
                ViewLihatBarang lihatbarang= new ViewLihatBarang();
                ModelBarang modelbarang = new ModelBarang();
                ViewMM.setVisible(false);
                LihatBCon lihatbarangController =new LihatBCon(lihatbarang,modelbarang);
            }
        });
    }
}
