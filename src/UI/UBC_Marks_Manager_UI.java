/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Course;
import Classes.Grade;
import Classes.Grades;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hailin
 */
public class UBC_Marks_Manager_UI extends javax.swing.JFrame {

    /**
     * Creates new form UBC_Marks_Manager_UI
     */
    public UBC_Marks_Manager_UI() {
        initComponents();
        updateValues();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Degree = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pasteMarksArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        submitRawText = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        courseWithoutGradeSelect = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        sliderBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showPercent = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        submitGrade = new javax.swing.JButton();
        selectCredits = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Copy-paste SSC data here!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setName(""); // NOI18N

        Degree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSC", "BA", "BASC", "BCOM", "BCS", "BKIN", "BMUS" }));

        jLabel1.setText("First, select your degree program:");

        pasteMarksArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setText("<html>Then, copy-paste the box from \"Your Grades Summary\" on the UBC SSC into the text box on the right, following these instructions: <br> <br><em><u> IMPORTANT INSTRUCTIONS: </u></em> <br><br>1) ONLY copy after the \"Course\" \"Section\"  ... parts! <br>DO NOT include them! <br><br> 2) Paste the copied box into your browser's search bar first, then copy again before pasting here!  ");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setText("<html> <em> Read instructions first! </em> Paste your grades here!</html> ");

        submitRawText.setText("Submit");
        submitRawText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRawTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Degree, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pasteMarksArea, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitRawText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Degree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pasteMarksArea, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitRawText))
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Your cumulative average:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel5.setText("Current course (with no grade on SSC):");

        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setToolTipText("");
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        sliderBox.setEditable(false);
        sliderBox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        showPercent.setEditable(false);
        showPercent.setColumns(1);
        showPercent.setFont(showPercent.getFont().deriveFont(showPercent.getFont().getStyle() | java.awt.Font.BOLD, showPercent.getFont().getSize()+18));
        showPercent.setRows(1);
        showPercent.setText("0.00%");
        showPercent.setToolTipText("");
        showPercent.setAutoscrolls(false);
        jScrollPane1.setViewportView(showPercent);

        jLabel6.setText("Projected Grade from 0% to 100%:");

        submitGrade.setText("Submit");
        submitGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitGradeActionPerformed(evt);
            }
        });

        selectCredits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        jLabel4.setText("Number of Credits:");

        gradeTable.setAutoCreateRowSorter(true);
        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Grade", "Section Average", "Section Difference"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(gradeTable);

        ScrollPane.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sliderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitGrade))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseWithoutGradeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(selectCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(courseWithoutGradeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(selectCredits))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitGrade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        // TODO add your handling code here:
        updateValues();
    }//GEN-LAST:event_sliderStateChanged

    
    //CALLED only when all current courses known
    private void submitGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitGradeActionPerformed
        // TODO add your handling code here:
        Grades instance = Grades.getInstance();
        for(Course course : instance.getCurrent()){
            //find the course
            if((course.getCourseName() + " " + course.getCourseNumber() + " section " + course.getSection()).equals(courseWithoutGradeSelect.getSelectedItem().toString())){
                //update its grade
                Grade currentGrade = new Grade((double) Integer.parseInt(selectCredits.getSelectedItem().toString()), (double) Integer.parseInt(sliderBox.getText()));
                //update its key
                instance.putCourse(course, currentGrade);
            }
        }
        //show average
        updateAverage(instance);
        //update table
        updateTable(instance);
    }//GEN-LAST:event_submitGradeActionPerformed

    private void submitRawTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRawTextActionPerformed
        // TODO add your handling code here:
        Grades instance = Grades.getInstance();
        instance.setFields(pasteMarksArea.getText(), Degree.getSelectedItem().toString());
        instance.parseCoursesAndGrades();
        //show current average
        updateAverage(instance);
        //show unknown courses
        ArrayList<Course> courses = instance.getCurrent();
        String[] courseNames = new String[courses.size()];
        for(int i = 0; i < courses.size(); i++){
            Course curr = courses.get(i);
            courseNames[i] = curr.getCourseName() + " " + curr.getCourseNumber() + " section " + curr.getSection();
        }
        DefaultComboBoxModel mod = new DefaultComboBoxModel(courseNames);
        courseWithoutGradeSelect.setModel(mod);
        //update table
        updateTable(instance);
    }//GEN-LAST:event_submitRawTextActionPerformed

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
            java.util.logging.Logger.getLogger(UBC_Marks_Manager_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UBC_Marks_Manager_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UBC_Marks_Manager_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UBC_Marks_Manager_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UBC_Marks_Manager_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Degree;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JComboBox<String> courseWithoutGradeSelect;
    private javax.swing.JTable gradeTable;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField pasteMarksArea;
    private javax.swing.JComboBox<String> selectCredits;
    private javax.swing.JTextArea showPercent;
    private javax.swing.JSlider slider;
    private javax.swing.JTextField sliderBox;
    private javax.swing.JButton submitGrade;
    private javax.swing.JButton submitRawText;
    // End of variables declaration//GEN-END:variables

    private void updateValues() {
        sliderBox.setText(slider.getValue()+"");
    }

    private double convertFourPointThreeThreeGPA(double avg) {
        int avgInt = (int) Math.round(avg);
        if(avg >= 90.0)
            return 4.33;
        else if(avg <= 50.0)
            return 1.00;
        else{
        switch(avgInt){
            case 89:
                return 4.30;
            case 88:
                return 4.20;
            case 87: 
                return 4.10;
            case 86:
                return 4.00;
            case 85:
                return 3.95;
            case 84: 
                return 3.90;
            case 83:
                return 3.85;
            case 82:
                return 3.80;
            case 81: 
                return 3.75;
            case 80:
                return 3.70;
            case 79:
                return 3.60;
            case 78: 
                return 3.50;
            case 77:
                return 3.40;
            case 76:
                return 3.30;
            case 75: 
                return 3.20;
            case 74:
                return 3.10;
            case 73:
                return 3.00;
            case 72: 
                return 2.95;
            case 71:
                return 2.90;
            case 70:
                return 2.80;
            case 69: 
                return 2.70;
            case 68:
                return 2.65;
            case 67:
                return 2.60;
            case 66: 
                return 2.55;
            case 65: 
                return 2.50;
            case 64:
                return 2.40;
            case 63:
                return 2.30;
            case 62: 
                return 2.20;
            case 61:
                return 2.10;
            case 60:
                return 2.00;
            case 59: 
                return 1.90;
            case 58:
                return 1.80;
            case 57:
                return 1.70;
            case 56: 
                return 1.60;
            case 55:
                return 1.50;
            case 54:
                return 1.40;
            case 53: 
                return 1.30;
            case 52:
                return 1.20;
            case 51:
                return 1.10;
            }
        }
        return 0;
    }

    private void updateTable(Grades instance) {
        DefaultTableModel model = (DefaultTableModel) gradeTable.getModel();
        model.setRowCount(0);
        HashMap courseInfo = instance.getCourses();
        double currentGrade;
        String currentCourse;
        for(Object course : courseInfo.keySet()){
            currentGrade = ((Grade) courseInfo.get(course)).getGrade();
            currentCourse = ((Course) course).getCourseName() + " " + ((Course) course).getCourseNumber() + " section " + ((Course) course).getSection();
            double difference = (twoDecimal(currentGrade) - ((Course) course).getSectionAverage());
            model.addRow( new String[] {currentCourse, twoDecimal(currentGrade) + "", ((Course) course).getSectionAverage() + "", (difference >= 0 ? "+" : "-") + difference  + "" });
        }
    }

    private void updateAverage(Grades instance) {
        double avg = instance.getCumulativeAverage();
        showPercent.setText("Average: " + twoDecimal(avg)+"%"+ "\nAs 4.0 GPA: " + twoDecimal((avg/20)-1) + "\nAs 4.33 GPA: " + convertFourPointThreeThreeGPA(avg));
    }

    private double twoDecimal(double curr) {
       return Math.round(curr*100.0)/100.0;
    }

}
