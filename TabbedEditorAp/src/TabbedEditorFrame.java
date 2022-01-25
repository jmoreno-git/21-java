
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ProvenSoft
 */
public class TabbedEditorFrame extends javax.swing.JFrame {

    public TabbedEditorFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Text editor");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tabbedPane.setAutoscrolls(true);
        tabbedPane.setPreferredSize(null);
        getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.setActionCommand("open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAction(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.setActionCommand("save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAction(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setActionCommand("saveas");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAction(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.setActionCommand("exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAction(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * handles user's interaction events.
     *
     * @param evt event to handle
     */
    private void handleAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleAction
        String action = evt.getActionCommand();
        if (action != null) {
            switch (action) {
                case "exit" ->
                    doExit();
                case "open" ->
                    doOpenDoc();
                case "save" ->
                    doSaveDoc();
                case "saveas" ->
                    doSaveDocAs();
                default -> {
                }
            }
        }
    }//GEN-LAST:event_handleAction

    /**
     * handles window closing events
     *
     * @param evt event to handle
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        doExit();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabbedEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabbedEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabbedEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabbedEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabbedEditorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables

    /*  Control methods */
    
    /**
     * exits application
     */
    private void doExit() {
        int option = JOptionPane.showConfirmDialog(
                this, "Sure to exit?", "Exit", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    /**
     * opens a document and adds a new tab with it
     */
    private void doOpenDoc() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            //create a new panel for the document
            DocPanel panel = new DocPanel();
            panel.setFile(selectedFile);
            //tabbedPane.addTab(selectedFile.getName(), panel);
            //get tge name of the file to use it as a title for the new panel
            String title = selectedFile.getName();
            //add the new panel to the tabbed pane
            tabbedPane.add(title, panel);
            //set the new panel as the active one
            tabbedPane.setSelectedComponent(panel);
            //set the component to render the tab for the panel (title+close button)
            tabbedPane.setTabComponentAt(tabbedPane.getSelectedIndex(),
                    new ButtonTabComponent(tabbedPane));
            //read file content into the text area of the document
            try {
                String text = readFile(selectedFile);
                ((DocPanel) tabbedPane.getSelectedComponent()).setText(text);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening", "Open", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * saves document in current tab to a file
     */
    private void doSaveDoc() {
        //get selected panel
        DocPanel panel = (DocPanel) tabbedPane.getSelectedComponent();
        File selectedFile = panel.getFile();
        //get text from the text area of the document
        String text = panel.getText();
        //write file content to the file
        try {
            writeFile(selectedFile, text);
            JOptionPane.showMessageDialog(this, "Document saved", "Save", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving", "Save", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    /**
     * saves document in current tab to a file, allowing choosing of target file
     */
    private void doSaveDocAs() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            //get selected panel
            DocPanel panel = (DocPanel) tabbedPane.getSelectedComponent();
            //get text from the text area of the document
            String text = panel.getText();
            //write file content to the file
            try {
                writeFile(selectedFile, text);
                panel.setFile(selectedFile);
                tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), selectedFile.getName());
                JOptionPane.showMessageDialog(this, "Document saved as", "Save as", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving as", "Save as", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * reads a file and returns its content
     *
     * @param file the file to read
     * @return text from the file
     * @throws FileNotFoundException if file not found
     * @throws IOException in case of input/output error
     */
    public String readFile(File file) throws FileNotFoundException, IOException {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int c;
            while ((c = reader.read()) != -1) {
                text.append((char) c);
            }
        }
        return text.toString();
    }

    /**
     * writes a content to a file
     *
     * @param file the file to write
     * @param text the content to write to file
     * @throws FileNotFoundException if file not found
     * @throws IOException in case of input/output error
     */
    private void writeFile(File file, String text) throws FileNotFoundException, IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
        }
    }
    
}
