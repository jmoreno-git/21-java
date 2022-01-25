
import java.io.File;

/**
 *
 * @author ProvenSoft
 */
public class DocPanel extends javax.swing.JPanel {
 
    public DocPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        jTextArea.setColumns(25);
        jTextArea.setRows(10);
        jScrollPane.setViewportView(jTextArea);

        add(jScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
    
    /**
     * the file whose content is shown in this panel
     */
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    /**
     * gets the text in the text area
     * @return the text from the text area
     */
    public String getText() {
        return jTextArea.getText();
    }
    
    /**
     * sets the text to the text area
     * @param text the text to set
     */
    public void setText(String text) {
        jTextArea.setText(text);
    }
    
}
