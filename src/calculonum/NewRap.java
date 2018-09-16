
package calculonum;
import static calculonum.CalculoNum.dfuncao;
import static calculonum.CalculoNum.funcao;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.util.ArrayList;


public class NewRap extends javax.swing.JFrame {

   
  public NewRap() {
       initComponents();
  }
  
    public void isolamento(double a){ //Função que recebe um double para calcular o isolamento
     
         for(int x =-20;x<21;x++){   //Testa os valores  -20 a 20 na função                              
            double f=(a*Math.pow(2.71828182846, x))-(4*Math.pow(x, 2));
            PrintNewR.append(String.format("f(%d): %.10f\n",x,f));  //Printa na tela os valores
         } 
    }
   
    public void NewR(double max,double A,double y,double E){
 
        double fA,dfA,dfC;//inicialização de variavel
        fA=funcao(A,y);  //Calcula a função com o valor da variavel A;
        int k=0;
        ArrayList<Double> DF = new ArrayList<Double>();//Cria vetor para armazenar as derivadas 
        ArrayList<Double> ER = new ArrayList<Double>();//Criar vetor dinâmico para receber os valores das raizes para calcular os erros 
        double s1,s2,s3,d1;    //inicialização de variavel
        
        while(Math.abs(fA) > E && k < max) { 
            fA=funcao(A,y); 
            dfA=dfuncao(A);
            DF.add(dfA);  //Adiciona os valores das derivadas no vetor dinâmico DF
            d1=DF.get(DF.size()-1);//Pega o valor da ultima derivada
            
            if(Math.abs(dfA) > 0.00001){//Se |f '(xk )|>λ calcula com f´xk
                A=A-(fA/dfA);}
            else{   //Se não calcula com o resultado da ultima derivada 
                A=A-(fA/d1);
            }
            ER.add(A);  //Adiciona os valores das raizes no vetor dinâmico ER 
            k++;
      
        PrintNewR.append(String.format("\t\tInteração%d\n A=%2f\n fA=%.10f\n ",k,A,fA));    //Printa na tela os valores
        
        PrintNewR.append(String.format("\n Raiz parcial = %.10f\n\n",A));   //Printa na tela os valores 
        }
     
//*****************Calcular erro relativo**************************************
    
        for(int n =ER.size();1!=n;n-- ){
             s1=ER.get(n-2); //Pega os valores dos indices do vetor
             s2=ER.get(ER.size()-1);//Pega o valor do ultimo indice do vetor
             s3=Math.abs(s1-s2)/s2;//Calcula o erro relativo
             PrintNewR.append(String.format("\n %d erro relativo = %.10f \n\n",n,s3));//Printar os valores na tela
         }

        PrintNewR.append(String.format("\n\t\t  Convergiu! %2f ",A));   //Printa na tela os valores 
    }

  //********************Interface gráfica*************************************
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/NewR.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        x3 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        E3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrintNewR = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/seta1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PrintNewR.setColumns(20);
        PrintNewR.setRows(5);
        jScrollPane1.setViewportView(PrintNewR);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/calcular.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("isolamento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(x3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(A3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(E3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double A = Double.parseDouble(x3.getText());//Pega o valor de x0
        double E = Double.parseDouble(E3.getText());//Pega o valor de e
        double y = Double.parseDouble(A3.getText());//Pega o valor de A
        double max = 100;//Máximo de iterções
        NewR(max,A,y,E);//Chama o metodo newton raphson fl
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double y = Double.parseDouble(A3.getText());  //Pega o valor de A
        isolamento(y);  //Chama a funções de isolamento
    }//GEN-LAST:event_jButton3ActionPerformed

   //********************Interface gráfica*************************************
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A3;
    private javax.swing.JTextField E3;
    private javax.swing.JTextArea PrintNewR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField x3;
    // End of variables declaration//GEN-END:variables
}
