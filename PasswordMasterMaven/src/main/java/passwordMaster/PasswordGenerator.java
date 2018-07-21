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

import Other.Generator;
import Other.Strings;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author nikos
 */
public class PasswordGenerator extends javax.swing.JFrame {
    /**
     * Creates new form PasswordGenerator
     */
    public PasswordGenerator() {
        initComponents();
        initSettings();
        initGenerator();
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

        jPanel1 = new javax.swing.JPanel();
        lowercaseField = new javax.swing.JTextField();
        lowercaseCB = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        uppercaseField = new javax.swing.JTextField();
        uppercaseCB = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        symbolCB = new javax.swing.JCheckBox();
        symbolField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        numberCB = new javax.swing.JCheckBox();
        numberField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        passwordLengthSpinner = new javax.swing.JSpinner();
        passwordField = new javax.swing.JTextField();
        copyButton = new javax.swing.JButton();
        generatePasswordButton = new javax.swing.JButton();
        restoreDefaultsButton = new javax.swing.JButton();
        shufflePasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lowercaseCB.setSelected(true);
        lowercaseCB.setText("Lowercase Letters");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lowercaseCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowercaseField))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowercaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowercaseCB))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        uppercaseCB.setText("Uppercase Letters");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(uppercaseCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uppercaseField))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uppercaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uppercaseCB))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        symbolCB.setText("Symbols");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(symbolCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(symbolField))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symbolCB)
                    .addComponent(symbolField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        numberCB.setSelected(true);
        numberCB.setText("Numbers");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(numberCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberField))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberCB)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Length:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLengthSpinner)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(passwordLengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        copyButton.setText("Copy to clipboard");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        generatePasswordButton.setText("Generate Password");
        generatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePasswordButtonActionPerformed(evt);
            }
        });

        restoreDefaultsButton.setText("Restore Defaults");
        restoreDefaultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDefaultsButtonActionPerformed(evt);
            }
        });

        shufflePasswordButton.setText("Shuffle Password");
        shufflePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shufflePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(restoreDefaultsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shufflePasswordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generatePasswordButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generatePasswordButton)
                    .addComponent(copyButton)
                    .addComponent(restoreDefaultsButton)
                    .addComponent(shufflePasswordButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePasswordButtonActionPerformed
        createPassword();
    }//GEN-LAST:event_generatePasswordButtonActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        String myString = passwordField.getText();
        if(myString.contains("copied to clipboard.")){
            myString = myString.replace("Password ", "");
            myString = myString.replace(" copied to clipboard.", "");
        }
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
        MainWindow.showStatus("Password copied to clipboard.");
    }//GEN-LAST:event_copyButtonActionPerformed

    private void restoreDefaultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDefaultsButtonActionPerformed
        initDefaults();
    }//GEN-LAST:event_restoreDefaultsButtonActionPerformed

    private void shufflePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shufflePasswordButtonActionPerformed
        passwordField.setText(Generator.shufflePassword());
    }//GEN-LAST:event_shufflePasswordButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton copyButton;
    private javax.swing.JButton generatePasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox lowercaseCB;
    private javax.swing.JTextField lowercaseField;
    private javax.swing.JCheckBox numberCB;
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JSpinner passwordLengthSpinner;
    private javax.swing.JButton restoreDefaultsButton;
    private javax.swing.JButton shufflePasswordButton;
    private javax.swing.JCheckBox symbolCB;
    private javax.swing.JTextField symbolField;
    private javax.swing.JCheckBox uppercaseCB;
    private javax.swing.JTextField uppercaseField;
    // End of variables declaration//GEN-END:variables

    private void initSettings() {
        setTitle(Strings.getPasswordGeneratorTitle());
        setLocationRelativeTo(null);
        setResizable(false);
        setAlwaysOnTop(true);
        WindowListener exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveAndDispose();
            }
        };
        addWindowListener(exitListener);
    }

    public void showWindow(boolean status) {
        setVisible(status);
        passwordField.setText("");
    }

    private void initGenerator() {
        initTextFields();
        initCheckBoxes();
        initLength();
    }
    
    private void initTextFields(){
        passwordField.setText("");

        StringBuilder temp = new StringBuilder();
        for (String s : Generator.getLowercase()) {
            temp.append("," + s);
        }
        String tempS = temp.toString();
        lowercaseField.setText(tempS.replaceFirst(",", ""));

        temp = new StringBuilder();
        for (String s : Generator.getUppercase()) {
            temp.append("," + s);
        }
        tempS = temp.toString();
        uppercaseField.setText(tempS.replaceFirst(",", ""));

        temp = new StringBuilder();
        for (String s : Generator.getNumbers()) {
            temp.append("," + s);
        }
        tempS = temp.toString();
        numberField.setText(tempS.replaceFirst(",", ""));

        temp = new StringBuilder();
        for (String s : Generator.getSymbols()) {
            temp.append("," + s);
        }
        tempS = temp.toString();
        symbolField.setText(tempS.replaceFirst(",", ""));
    }
    
    private void initCheckBoxes(){
        lowercaseCB.setSelected(Generator.isLowercaseSelected());
        uppercaseCB.setSelected(Generator.isUppercaseSelected());
        symbolCB.setSelected(Generator.isSymbolsSelected());
        numberCB.setSelected(Generator.isNumbersSelected());
    }
    
    private void initLength(){
        passwordLengthSpinner.setValue(Generator.getLength());
    }

    private void initDefaults() {
        passwordField.setText("");

        StringBuilder temp = new StringBuilder();
        for (String s : Generator.DEFAULT_LOWERCASE) {
            temp.append("," + s);
        }
        String tempS = temp.toString();
        lowercaseField.setText(tempS.replaceFirst(",", ""));

        temp = new StringBuilder();
        for (String s : Generator.DEFAULT_UPPERCASE) {
            temp.append("," + s);
        }
        tempS = temp.toString();
        uppercaseField.setText(tempS.replaceFirst(",", ""));

        temp = new StringBuilder();
        for (String s : Generator.DEFAULT_NUMBERS) {
            temp.append("," + s);
        }
        tempS = temp.toString();
        numberField.setText(tempS.replaceFirst(",", ""));

        temp = new StringBuilder();
        for (String s : Generator.DEFAULT_SYMBOLS) {
            temp.append("," + s);
        }
        tempS = temp.toString();
        symbolField.setText(tempS.replaceFirst(",", ""));
        Generator.setLength(8+"");
        
    }

    private void createPassword() {
        setEverything();
        passwordField.setText(Generator.createPassword());
    }
    
    private void setEverything(){
        setArrays();
        setSelectedArrays();
        setLength();
    }
    
    private void setSelectedArrays(){
        Generator.setLowercaseSelected(lowercaseCB.isSelected());
        Generator.setUppercaseSelected(uppercaseCB.isSelected());
        Generator.setNumbersSelected(numberCB.isSelected());
        Generator.setSymbolsSelected(symbolCB.isSelected());
    }
    
    private void setLength(){
        Generator.setLength((Integer)passwordLengthSpinner.getValue());
    }

    private void setArrays() {
        String lc = lowercaseField.getText();
        Generator.setLowercase(lc.split(","));

        String uc = uppercaseField.getText();
        Generator.setUppercase(uc.split(","));

        String s = symbolField.getText();
        Generator.setSymbols(s.split(","));

        String n = numberField.getText();
        Generator.setNumbers(n.split(","));
    }

    public void saveAndDispose() {
        setArrays();
        setLength();
        setSelectedArrays();
        showWindow(false);
    }
}
