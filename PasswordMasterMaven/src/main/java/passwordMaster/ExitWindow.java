/*
 * 	https://github.com/nikoskalai/Password-Master
 *
 * 	Copyright (c) 2018 Nikos Kalaitzian
 * 	Licensed under the WTFPL
 * 	You may obtain a copy of the License at
 *
 * 	http://www.wtfpl.net/about/
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package passwordMaster;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Logger;

/**
 *
 * @author Nikos
 */
public class ExitWindow extends javax.swing.JFrame {

    MainWindow mw;

    private final Logger LOG = Logger.getLogger(ExitWindow.class.getName());

    /**
     * Creates new form ExitWindow
     * @param mw
     */
    public ExitWindow(MainWindow mw) {
        initComponents();
        this.mw = mw;
        setLocationRelativeTo(null);
        setResizable(false);
        setEnabled(false);
        setTitle("Exit Password Master?");
        WindowListener windowListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                visible(false);
            }
        };
        addWindowListener(windowListener);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("ic_launcher.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveExitButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        saveExitButton.setText("Save & Exit");
        saveExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExitButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit Without Saving");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveExitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveExitButton)
                    .addComponent(exitButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExitButtonActionPerformed
        new SaveAndExit().start();
    }//GEN-LAST:event_saveExitButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        mw.exitApp();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        visible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * This method toggles the visibility of the ExitWindow.
     * @param visibility The boolean variable that is used to toggle the ExitWindow visibility.
     */
    public void visible(boolean visibility) {
        if (visibility) {
            if (!mw.fileNotSaved) {
                mw.exitApp();
            }
        }
        mw.setEnabled(!visibility);
        setAlwaysOnTop(visibility);
        setVisible(visibility);
        setEnabled(visibility);
    }

    private class SaveAndExit extends Thread {

        @Override
        public void run() {
            if (mw.saveFile()) {
                while (mw.writingFile) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        MainWindow.showError(ex, "Could not pause running thread.");
                    }
                    if (!mw.fileNotSaved) {
                        break;
                    }
                }
                if(!mw.fileNotSaved){
                    dispose();
                    mw.exitApp();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton saveExitButton;
    // End of variables declaration//GEN-END:variables
}
