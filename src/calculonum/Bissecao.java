
package calculonum;
import static calculonum.CalculoNum.funcao;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.util.ArrayList;


public class Bissecao extends javax.swing.JFrame {

     
    public Bissecao() {
        initComponents();
    }
    
    public void isolamento(double a){ //Função que recebe um double para calcular o isolamento
     
         for(int x =-20;x<21;x++){   //Testa os valores  -20 a 20 na função                              
            double f=(a*Math.pow(2.71828182846, x))-(4*Math.pow(x, 2));
            PrintBissecao.append(String.format("f(%d): %.10f\n",x,f));//Printar os valores na tela
         } 
    }
    
     
    public void bissecao(double max,double A,double y,double B,double E,double fA,double fB){//Metodo da Bisseção
          double C=0;   //inicialização de variavel
          double fC;    //inicialização de variavel
          ArrayList<Double> ER = new ArrayList<Double>();//Criar vetor dinâmico para receber os valores das raizes para calcular os erros 
          double s1,s2,s3;  //inicialização de variavel
          
             if ((fA * fB) > 0) {//Verificando se o intervalo é viável
                PrintBissecao.append(String.format("\nCondicao inicial nao contem raiz!\n"));
                
            }else if(B-A < E){//Se B-A for menor que o erro printa as raizes
                PrintBissecao.append(String.format("\n\n Raiz obtida = [%2f ; %2f]",A,B ));
                
            }else{
                int k=0;
                
                while(Math.abs(A-B) > E && k < max) { //Loop para calcular as iterações
                    C = (A+B)/2;    //Função de iteração
                    fC = funcao(C,y);   //Calcula a função com o valor da variavel C;
                    PrintBissecao.append(String.format("\t\t Interação %d\n\n A=%.10f\n B=%.10f\n C=%.10f\n"
                     +" fA=%.10f\n fB=%.10f\n fC=%.10f\n ",k,A,B,C,fA,fB,fC));//Printar os valores na tela
                    
                     if (fA * fC < 0) { //Substitue o valor de B para C
                        B = C;
                 
                     }else {    //Substitue o valor de A para C
                        if (fB * fC < 0)
                            A = C;
                 
                        else
                            break;}
                    PrintBissecao.append(String.format("\nRaiz parcial = %.10f\n\n",C));//Printar os valores na tela
                    ER.add(C);    //Adiciona os valores das raizes no vetor dinâmico ER
                     k++;
                }       
                
//*****************Calcular erro relativo**************************************
    
         for(int n =ER.size();1!=n;n-- ){
             s1=ER.get(n-2); //Pega os valores dos indices do vetor
             s2=ER.get(ER.size()-1);//Pega o valor do ultimo indice do vetor
             s3=Math.abs(s1-s2)/s2;//Calcula o erro relativo
             PrintBissecao.append(String.format("\n %d erro relativo = %.10f \n\n",n,s3));//Printar os valores na tela
         }
                   
        double D =Math.abs(A-B);
        double F =Math.abs(A-B);
        double G =Math.abs(F-C);
        PrintBissecao.append(String.format("\n\n\t\t Convergiu! %.10f < %.10f ",D,E));//Printar os valores na tela
        PrintBissecao.append(String.format("\n\n\t\t Raiz obtida = [%.10f ; %.10f]",C,G));//Printar os valores na tela
    
    }
    
    }
   
    //********************Interface gráfica*************************************
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/Bissecao.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        B1 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        XA = new javax.swing.JTextField();
        E2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrintBissecao = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/seta1.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(533, 509));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PrintBissecao.setColumns(20);
        PrintBissecao.setRows(5);
        jScrollPane1.setViewportView(PrintBissecao);

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
        jDesktopPane1.setLayer(B1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(A1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(XA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(E2, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(183, 183, 183))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(XA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(11, 11, 11)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double A = Double.parseDouble(A1.getText());//Pega o valor de x0
        double B = Double.parseDouble(B1.getText());//Pega o valor de x1
        double E = Double.parseDouble(E2.getText());//Pega o valor de e
        double y = Double.parseDouble(XA.getText());//Pega o valor de a
        double fA=funcao(A,y);
        double fB=funcao(B,y);
        
        
        double max = 100; //Máximo de iterções
        
       bissecao(max,A,y,B,E,fA,fB);//Chama o metodo da bisseção
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double y = Double.parseDouble(XA.getText());  //Pega o valor de A
        isolamento(y); //Chama a funções de isolamento
    }//GEN-LAST:event_jButton3ActionPerformed

   //********************Interface gráfica*************************************
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bissecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField E2;
    private javax.swing.JTextArea PrintBissecao;
    private javax.swing.JTextField XA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
