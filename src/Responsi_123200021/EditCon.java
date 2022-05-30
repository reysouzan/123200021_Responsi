package Responsi_123200021;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EditCon {
    ViewInputBarang VIB;
    ModelBarang modelB;
    String id;

    public EditCon(ViewInputBarang vib, ModelBarang mb, String id) {
        this.VIB = vib;
        this.modelB = mb;
        this.id = id;
        
        String detailBarang[]=mb.detailBarang(id);                                
            vib.tfnama.setText(detailBarang[1]);
            vib.tfmassa.setText(detailBarang[2]);
            vib.tfharga.setText(detailBarang[3]);
        vib.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                mb.updateData(id,vib.getTFNama(),vib.getTFMassa(),vib.getTFHarga());   
                ViewLihatBarang vlb=new ViewLihatBarang();
                vib.setVisible(false);
                LihatBCon Start=new LihatBCon(vlb, mb);
            }
        });
    }
    
    
}
