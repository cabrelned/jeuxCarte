/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package vue;

import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class Regle6 extends javax.swing.JDialog {

    /** Creates new form Regle6 */
    public Regle6(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        URL url_tmp = getClass().getResource("/images/logo 6QuiPrend.png");
	if(url_tmp!=null) setIconImage(new ImageIcon(url_tmp).getImage()); 
        setLayout(new BorderLayout());
	setLocationRelativeTo(null);
        
        url_tmp = getClass().getResource("/images/fond 6QuiPrend.png");
        ImageIcon img = new ImageIcon(url_tmp);
        JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1080,720);
        add(background);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("______________Principe de jeu____________________________\n\n-Les cartes de « 6 qui prend » ont 2 valeurs : une valeur numérique \n(de 1 à 104) qui indique leur future position dans le jeu, et une valeur\nde 1 à 7 « têtes de boeufs » ,qui correspond à des points de pénalité.\n\n-Le but est de récolter le moins possible de têtes de boeufs. Le\ngagnant est celui qui en comptabilise le moins à la fin du jeu.\n\n______________Préparation_______________________________\n\n-Préparez du papier et un crayon, mélangez les cartes et distribuez \n10 cartes à chacun. Chaque joueur prend ses cartes en main .\n\n-Former quatre rangées et Déposez 4 cartes situées sur le dessus de\nla pile des cartes non distribuées sur la table, faces visibles. \nChaque carte représente le début d’une série, qui, ne doit pas\ncomporter plus de 5 cartes en tout. La pile des cartes restantes ne\nsera plus utile avant la prochaine manche.\n\n______________Déroulement du jeu\n\n-Tous les joueurs prennent 1 carte de leur jeu pour la déposer face \ncachée devant eux sur la table. Une fois que le dernier s’est décidé, \non retourne ces cartes. Celui qui a déposé la carte la plus faible est\nle premier à jouer sa carte dans une des quatre rangées, puis vient le\ntour de celui qui a déposé la deuxième carte la plus faible et ainsi de \nsuite jusqu’à ce que celui qui a déposé la carte la plus forte de ce tour\n-Les cartes d’une série sont toujours déposées les unes à côté des\nautres. On répète le même processus jusqu’à ce que les 10 cartes\ndes joueurs soient épuisées.\n\n______________Encaissement des cartes\n\n- Que se passe-t-il lorsqu’une série est terminée ou lorsqu’une carte ne\nva dans aucune série ? Dans les deux cas, le joueur qui joue une telle\n\n- Règle n°1: „Valeurs croissantes“\nLes cartes d’une série doivent toujours se succéder dans l’ordre \ncroissant de leurs valeurs.\n\n-Règle n°2: „La plus petite différence“\nUne carte doit toujours être déposée dans la série où la différence \nentre la dernière carte déposée et la nouvelle est la plus faible.\n\n-Règle n°3: „Série terminée“\nUne série est terminée lorsqu’elle compte 5 cartes. Lorsque, d’après \nla règle n°2, une sixième carte doit y être déposée, le joueur qui joue \ncette carte doit ramasser les 5 cartes de la série. Sa sixième carte \nforme alors le début d’une nouvelle série\n\n-Règle n°4: „La carte la plus faible“\nLe joueur qui joue une carte si faible qu’elle ne peut aller dans aucune\ndes séries doit ramasser toutes les cartes d’une série de son choix. \nSa carte „faible“ représente alors la première carte d’une nouvelle série.\n\n______________Fin de manche\n\n-Une manche prend fi n lorsque les 10 cartes sont jouées. Chaque \njoueur compte alors ses points négatifs dans sa pile de têtes de boeuf.\nOn note le résultat de chacun des joueurs sur une feuille de papier, \npuis on commence une nouvelle manche. On joue plusieurs manches \njusqu’à ce que l’un des joueurs ait réuni en tout plus de 66 têtes de \nboeuf. Le vainqueur de la partie est alors le joueur qui a le moins de \ntêtes de boeuf. Avant le début du jeu, il est bien sûr possible de convenir\nd’un autre total de points ou d’un nombre de manches maximum.\n\nQue le meuilleure gagne.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regle6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Regle6 dialog = new Regle6(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
