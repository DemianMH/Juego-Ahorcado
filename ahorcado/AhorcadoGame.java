//Gerardo Demian Mora Hernandez
//29/04/2021
//Topicos Avanzados
//Práctica 2.4 Ahorcado en Java
package ahorcado;

import java.net.URL;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class AhorcadoGame extends javax.swing.JFrame {
    private String [][] lista = {{"Manzana", "Piña", "Pera", "Sandia"},{"Panduro", "Jacobo", "Demian", "Octavio"}};
    int categoria =-1,life =5,win =0;
    String wordGen;
    char arr[];
  
    
    public AhorcadoGame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        secret = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado Game");

        jLabel1.setText("Select the Category");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select....", "Frutas", "Nombres" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Secret word");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Letter");

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        secret.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                secretKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secretKeyTyped(evt);
            }
        });

        jButton4.setText("Evalue");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Help");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(secret, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secret, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   Random r = new Random();
   if (categoria == -1){
          JOptionPane.showMessageDialog(this, "Select a category");
          
       }else
       {
           int pos = r.nextInt() % 4; //Pos = Posicion 
           if (pos < 0 ) 
               pos = pos * -1;
      
           wordGen = lista[categoria][pos];
           JOptionPane.showMessageDialog(this,wordGen);
           String nsecretWord =nsecret(wordGen);
           arr=guioneschar(wordGen);
           secret.setText(nsecretWord);
           win=wordGen.length();
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      //Icon eti1 = ImageIcon(getClass().getResource("cabeza1.JPG"));
        String correct =jTextField1.getText(),help="";
     char opc=correct.charAt(0);
     char [] latter=wordGen.toCharArray();
     boolean latter2=false;
     
     for(int i=0;i<latter.length;i++){
         if(wordGen.charAt(i)==opc){
         arr [i]=opc;
         win--;
         latter2=true;
         }
     }
     if(latter2==true){
         if(win!=0){
         String print=charstring(arr);
         secret.setText(print);
         }else{
         String print=charstring(arr);
         secret.setText(print);
         JOptionPane.showMessageDialog(this, "--Winner--");
         }
     }else{
         life--;
         if(life==4){
            JOptionPane.showMessageDialog(null, "Lost a life: ","Warning",
                    JOptionPane.PLAIN_MESSAGE,image("/imagenes/cabeza1.JPG",40,40) );
               //JOptionPane.showMessageDialog(this, "Lost a life : "+life);
         
         }if(life==3){
              JOptionPane.showMessageDialog(null, "Lost a life: ","Warning",
                    JOptionPane.PLAIN_MESSAGE,image("/imagenes/cabeza2.JPG",40,40) );
         }if(life==2){
              JOptionPane.showMessageDialog(null, "Lost a life: ","Warning",
                    JOptionPane.PLAIN_MESSAGE,image("/imagenes/cabeza3.JPG",40,40) );
         }if(life==1){
              JOptionPane.showMessageDialog(null, "Lost a life: ","Warning",
                    JOptionPane.PLAIN_MESSAGE,image("/imagenes/cabeza4.JPG",40,40) );
         }if(life==0){
              JOptionPane.showMessageDialog(null, "Lost a life: ","Warning",
                    JOptionPane.PLAIN_MESSAGE,image("/imagenes/cabeza5.JPG",40,40) );
         }if(life==-1){
               JOptionPane.showMessageDialog(null, "Game Over","Warning",
                    JOptionPane.PLAIN_MESSAGE,image("/imagenes/gameover.JPG",40,40) );
               life=5;
         }
         
        
     }
     jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        categoria = jComboBox1.getSelectedIndex()-1;
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void secretKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secretKeyTyped
       
    }//GEN-LAST:event_secretKeyTyped

    private void secretKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secretKeyPressed
      
    }//GEN-LAST:event_secretKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       JOptionPane.showMessageDialog(this, "Se escoje una categoria y presionar iniciar. \n "
               + "Una vez iniciado poner una letra y presionar evaluar.\n"
               + "Tienes 5 Intentos.  ");
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AhorcadoGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel secret;
    // End of variables declaration//GEN-END:variables

//Metodos
    //-----------------------------------
    static String nsecret(String nword){
    int tam = nword.length();
    String sum="";
    for(int i=0;i<tam;i++){
    sum+=" _ ";
    }
    return sum;
    }
   //------------------------------------
    static char[] guioneschar(String palabra){
      char[] guiones = new char[palabra.length()];
      for(int i=0; i<guiones.length;i++){
          guiones[i]='_';
      } 
        return guiones;
}
    //------------------------------------
static String charstring(char [] palabra){
        String sumador="";
        for(int i=0;i<palabra.length;i++){
          sumador+=Character.toString(palabra[i]);
        }
        return sumador;
    }

//---------------------------------------
    public  Icon image(String path,int width,int heigth){
        Icon img = new  ImageIcon (new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_AREA_AVERAGING));
    return img;
    }
}
