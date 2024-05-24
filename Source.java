import javax.swing.event.AncestorListener;
import java.awt.event.ActionListener;

public class Source extends JFrame implements ActionListener
{
 
 
 private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        JFrame_TextFiled frameText = new JFrame_TextFiled();
        frameText.setVisible(true);
        frameText.pack();
        frameText.setLocationRelativeTo(null);
        frameText.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }                                           


// function to add row
    public static void AddRowToJTable(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(dataRow);
    }                                           



//************** in the jtextfields jframe **************//

// Button to add row
private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
        JFRAME_JTABLE.AddRowToJTable(new Object[]{
                                                  jTextField1.getText(),
                                                  jTextField2.getText(),
                                                  jTextField3.getText(),
                                           });
        
    }
}