
package calculonum;
import static calculonum.CalculoNum.funcao;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.util.ArrayList;

public class Secante extends javax.swing.JFrame {

    public Secante() {
        initComponents();
    }
    
    public void isolamento(double a){ //Função que recebe um double para calcular o isolamento
     
         for(int x =-20;x<21;x++){   //Testa os valores  -20 a 20 na função                              
            double f=(a*Math.pow(2.71828182846, x))-(4*Math.pow(x, 2));
            PrintSecante.append(String.format("f(%d): %.10f\n",x,f));//Printar os valores na tela
         } 
    }
    
    public  void secante(double max,double A,double y,double B,double E){//Metodo da secante
   
      double C = A;   //inicialização de variavel
      double fC,fB,fA;    //inicialização de variavel
      fC=funcao(C,y); //Calcula a função com o valor da variavel C;
      ArrayList<Double> ER = new ArrayList<Double>();//Criar vetor dinâmico para receber os valores das raizes para calcular os erros 
      double s1,s2,s3;
      int k=0;
        while(Math.abs(fC) > E && k < max) { //Loop para calcular as iterações
            fA=funcao(A,y); //Calcula a função com o valor da variavel A;
            fB=funcao(B,y); //Calcula a função com o valor da variavel B;
            fC=funcao(C,y); //Calcula a função com o valor da variavel C;
            C=(A*fB - B*fA)/(fB-fA);//Função de iteração
            A=B;
            B=C;
            k++;
            ER.add(C);  //Adiciona os valores das raizes no vetor dinâmico ER
        
        PrintSecante.append(String.format("\t\t Interação %d\n\n A=%.10f\n B=%.10f\n C=%.10f\n"
                +" fA=%.10f\n fB=%.10f\n fC=%.10f\n ",k,A,B,C,fA,fB,fC)); //Printar os valores na tela
        
        PrintSecante.append(String.format("\n Raiz parcial = %.10f\n\n",C));//Printar os valores na tela
        }

 //*****************Calcular erro relativo**************************************
    
         for(int n =ER.size();1!=n;n-- ){
             s1=ER.get(n-2); //Pega os valores dos indices do vetor
             s2=ER.get(ER.size()-1);//Pega o valor do ultimo indice do vetor
             s3=Math.abs(s1-s2)/s2;//Calcula o erro relativo
             PrintSecante.append(String.format("\n %d erro relativo = %.10f \n\n",n,s3));//Printar os valores na tela
         }
         
         PrintSecante.append(String.format("\n\t\t  Convergiu! %.10f ",C));//Printar os valores na tela
    }
 
 //**********************Interface gráfica************************** 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/secante.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        X0 = new javax.swing.JTextField();
        X1 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();
        E1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PrintSecante = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/seta1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        X0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X0ActionPerformed(evt);
            }
        });

        X1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X1ActionPerformed(evt);
            }
        });

        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/calcular.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PrintSecante.setColumns(20);
        PrintSecante.setRows(5);
        jScrollPane2.setViewportView(PrintSecante);

        jButton3.setText("isolamento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(X0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(X1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(A5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(E1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 233, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton3)))
                .addGap(181, 181, 181))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(X0, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void X0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X0ActionPerformed

    private void X1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X1ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A5ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double A = Double.parseDouble(X0.getText()); //Pega o valor de x0
        double B = Double.parseDouble(X1.getText()); //Pega o valor de x1
        double E = Double.parseDouble(E1.getText()); //Pega o valor de e
        double y = Double.parseDouble(A5.getText()); //Pega o valor de A
        double max = 100; //Máximo de iterções
        
        secante(max,A,y,B,E); //Chama o metodo secante
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         double y = Double.parseDouble(A5.getText()); //Pega o valor de A 
         isolamento(y);//Chama a funções de isolamento 
    }//GEN-LAST:event_jButton3ActionPerformed

    //********************Interface gráfica*************************************
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A5;
    private javax.swing.JTextField E1;
    private javax.swing.JTextArea PrintSecante;
    private javax.swing.JTextField X0;
    private javax.swing.JTextField X1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
