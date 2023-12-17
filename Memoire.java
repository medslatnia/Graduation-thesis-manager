package ihmproj;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Memoire extends method  {
	
    public static void main(String[] args) {
    	final method method=new method();


        //Frame
        JFrame frame = new JFrame("Gestionnaire de mémoires");
        frame.setBounds(200, 170, 900, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Panel principal */
        final JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(new java.awt.Color(204, 204, 204));

        /* Premier Panel */
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.GRAY);

        JButton ACCUEIL = new JButton("Accueil");
        ACCUEIL.setPreferredSize(new Dimension(120, 40));
        ACCUEIL.setBackground(Color.WHITE);
        ACCUEIL.setForeground(Color.BLACK);
        p1.add(ACCUEIL);

        JButton RECHERCHER = new JButton("Rechercher");
        RECHERCHER.setPreferredSize(new Dimension(120, 40));
        RECHERCHER.setBackground(Color.WHITE);
        RECHERCHER.setForeground(Color.BLACK);
        p1.add(RECHERCHER);

        JButton AJOUTER = new JButton("Ajouter");
        AJOUTER.setBackground(Color.WHITE);
        AJOUTER.setForeground(Color.BLACK);
        AJOUTER.setPreferredSize(new Dimension(120, 40));
        p1.add(AJOUTER);

        JButton ENSEIGNANT = new JButton("Enseignants");
        ENSEIGNANT.setBackground(Color.WHITE);
        ENSEIGNANT.setForeground(Color.BLACK);
        ENSEIGNANT.setPreferredSize(new Dimension(120, 40));
        p1.add(ENSEIGNANT);
        JButton btnNewButton_5 = new JButton("Quitter");
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setPreferredSize(new Dimension(120, 40));
        p1.add(btnNewButton_5);
        p.add(p1, BorderLayout.NORTH);

        /*
         * =============================================================================
         * ==
         */
        // Panel Accueil

        // Panel "Gestionnaire de Mémoire"
        final JPanel pA1 = new JPanel(new GridBagLayout());

        p.add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel Gestionnaire = new JLabel("Gestionnaire de Mémoire");
        Gestionnaire.setPreferredSize(new Dimension(300, 40));
        Gestionnaire.setFont(new Font("Arial", Font.BOLD, 24));
        pA1.add(Gestionnaire);

        // Panel East
        final JPanel pA2 = new JPanel();
        pA2.setLayout((new FlowLayout(FlowLayout.CENTER)));
        pA2.setPreferredSize(new Dimension(p.getWidth(), 80));

        JPanel pA3 = new JPanel();
        pA3.setLayout((new BoxLayout(pA3, BoxLayout.Y_AXIS)));

        JPanel pA4 = new JPanel();
        pA4.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel pA5 = new JPanel();

        JLabel JL = new JLabel("Réalisé par : ");
        JLabel JL1 = new JLabel("   SLATNIA Mohammed El Amine");
        JLabel JL2 = new JLabel("   TOUAM Wissam");
       
		
        JL.setFont(new Font("Arial", Font.BOLD, 16));
        JL1.setFont(new Font("Arial", Font.ITALIC, 16));
        JL2.setFont(new Font("Arial", Font.ITALIC, 16));

        pA2.add(JL);
        pA3.add(JL1);
        pA3.add(JL2);
        pA2.add(pA1);
        pA4.add(pA3);
        pA4.add(pA5);

        pA2.add(pA4);

        /*
         * =============================================================================
         * ==
         */

        final JPanel PR = new JPanel();
        PR.setLayout((new BorderLayout()));
        JPanel PR1 = new JPanel();

        String labelText = "<html>Effectuer une <br>Recherche <br> de mémoire :</html>";
        JLabel JLRech = new JLabel(labelText);

        JLRech.setPreferredSize(new Dimension(150, 400));
        JLRech.setFont(new Font("Arial", Font.BOLD, 21));

        PR1.add(JLRech);
        PR.add(PR1, BorderLayout.WEST);

        JPanel PR2 = new JPanel();
        PR2.setLayout(new BoxLayout(PR2, BoxLayout.Y_AXIS));

        JPanel PR2H = new JPanel();
        PR2H.setLayout(new GridLayout(4, 2));

        JLabel CodeL = new JLabel("Par cote : ");
        
			final JTextField CodeTF = new JTextField(15);
		
        CodeL.setFont(new Font("Arial", Font.PLAIN, 20));
        PR2H.add(CodeL);
        PR2H.add(CodeTF);

        JLabel TitreL = new JLabel("Par titre : ");
         final JTextField TitreTF = new JTextField(15);
        TitreL.setFont(new Font("Arial", Font.PLAIN, 20));
        PR2H.add(TitreL);
        PR2H.add(TitreTF);

        JLabel EncadreurL = new JLabel("Par Encadreur : ");
         final JTextField EncadreurTF = new JTextField(15);
        EncadreurL.setFont(new Font("Arial", Font.PLAIN, 20));
        PR2H.add(EncadreurL);
        PR2H.add(EncadreurTF);

        final JPanel vide = new JPanel();
        PR2H.add(vide);
       
        
        JButton BtnRecherche = new JButton("Search");
        BtnRecherche.setBackground(Color.BLACK);
        BtnRecherche.setForeground(Color.WHITE);
        BtnRecherche.setPreferredSize(new Dimension(10, 40));
        PR2H.add(BtnRecherche);

        final JPanel PR2S = new JPanel();
        PR2S.setBackground(Color.WHITE);
        PR2S.setPreferredSize(new Dimension(200, 200));
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 1);
        PR2S.setBorder(border2);

        JPanel PR2Btn = new JPanel();
        PR2Btn.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton BtnModifier = new JButton("Modifier");
        BtnModifier.setBackground(Color.BLACK);
        BtnModifier.setForeground(Color.WHITE);
        BtnModifier.setPreferredSize(new Dimension(10, 40));
        BtnModifier.setPreferredSize(new Dimension(200, BtnModifier.getPreferredSize().height));
        PR2Btn.add(BtnModifier);

        JButton BtnSupprimer = new JButton("Supprimer");
        BtnSupprimer.setBackground(Color.BLACK);
        BtnSupprimer.setForeground(Color.WHITE);
        BtnSupprimer.setPreferredSize(new Dimension(10, 40));
        BtnSupprimer.setPreferredSize(new Dimension(200, BtnSupprimer.getPreferredSize().height));
        PR2Btn.add(BtnSupprimer);

        PR2.add(PR2H);
        PR2.add(PR2S);
        PR2.add(PR2Btn);

        PR.add(PR2, BorderLayout.CENTER);
        /*-------------------------------------------------------------------*/
        final JPanel PanelModifier = new JPanel();
        PanelModifier.setLayout((new BorderLayout()));
        JPanel PanelModifierWest = new JPanel();

        String ModifierLabel = "<html>Effectuer des <br>modifications sur<br>les mémoires :</html>";
        JLabel ModifierLabel2 = new JLabel(ModifierLabel);

        ModifierLabel2.setPreferredSize(new Dimension(150, 400));
        ModifierLabel2.setFont(new Font("Arial", Font.BOLD, 21));

        PanelModifierWest.add(ModifierLabel2);
        PanelModifier.add(PanelModifierWest, BorderLayout.WEST);
        JPanel PanelModifierCENTER = new JPanel();
        PanelModifierCENTER.setLayout(new GridLayout(4, 4));

        JLabel TitreLabelM = new JLabel("Titre :");
        PanelModifierCENTER.add(TitreLabelM);
        final JTextField TitreLTFM = new JTextField(10);
        PanelModifierCENTER.add(TitreLTFM);

        JLabel AuteurLabelM = new JLabel("Auteur :");
        PanelModifierCENTER.add(AuteurLabelM);
        final JTextField AuteurTFM = new JTextField(10);
        PanelModifierCENTER.add(AuteurTFM);

        JLabel AnneeLabelM = new JLabel("Année :");
        PanelModifierCENTER.add(AnneeLabelM);
        final JTextField AnneeTFM = new JTextField(10);
        PanelModifierCENTER.add(AnneeTFM);

        JLabel EncadreurLabelM = new JLabel("Résumé :");
        PanelModifierCENTER.add(EncadreurLabelM);
        final JTextField EncadrerTFM = new JTextField(10);
        PanelModifierCENTER.add(EncadrerTFM);

        JLabel coteLabelM = new JLabel("Côte :");
        PanelModifierCENTER.add(coteLabelM);
        final JTextField coteTFM = new JTextField(10);
        PanelModifierCENTER.add(coteTFM);

        JLabel resumeLabelM = new JLabel("Encadreur :");
        PanelModifierCENTER.add(resumeLabelM);
        final JTextField resumeTFM = new JTextField(100);
        PanelModifierCENTER.add(resumeTFM);

        
       
        JButton BtnRecuperer = new JButton("Recuperer");
        BtnRecuperer.setBackground(Color.BLACK);
        BtnRecuperer.setForeground(Color.WHITE);
        BtnRecuperer.setPreferredSize(new Dimension(10, 40));
        PanelModifierCENTER.add(BtnRecuperer);

       
        
        JButton BtnHome = new JButton("home");
        BtnHome.setBackground(Color.BLACK);
        BtnHome.setForeground(Color.WHITE);
        BtnHome.setPreferredSize(new Dimension(10, 40));
        PanelModifierCENTER.add(BtnHome);

        PanelModifier.add(PanelModifierCENTER);
        JButton BtnModifierr = new JButton("Modifier");
        BtnModifierr.setBackground(Color.BLACK);
        BtnModifierr.setForeground(Color.WHITE);
        BtnModifierr.setPreferredSize(new Dimension(10, 40));
        PanelModifierCENTER.add(BtnModifierr);

        PanelModifier.add(PanelModifierCENTER);

        /* ======== PANEL BOUTON AJOUTER ================ */
        // PR.setVisible(false);

        final JPanel PanelAjouter = new JPanel();
        PanelAjouter.setLayout((new BorderLayout()));
        JPanel PanelAjouterWest = new JPanel();

        String AjouterLabel = "<html>Effectuer un <br>ajout de<br>mémoire :</html>";
        JLabel AjouterLabel2 = new JLabel(AjouterLabel);

        AjouterLabel2.setPreferredSize(new Dimension(150, 400));
        AjouterLabel2.setFont(new Font("Arial", Font.BOLD, 21));

        PanelAjouterWest.add(AjouterLabel2);
        PanelAjouter.add(PanelAjouterWest, BorderLayout.WEST);

        JPanel PanelAjouterCENTER = new JPanel();
        PanelAjouterCENTER.setLayout(new GridLayout(4, 4));

        JLabel TitreLabel = new JLabel("Titre :");
        PanelAjouterCENTER.add(TitreLabel);
        final JTextField TitreLTF = new JTextField(10);
        PanelAjouterCENTER.add(TitreLTF);

        JLabel AuteurLabel = new JLabel("Auteur :");
        PanelAjouterCENTER.add(AuteurLabel);
        final JTextField AuteurTF = new JTextField(10);
        PanelAjouterCENTER.add(AuteurTF);

        JLabel AnneeLabel = new JLabel("Année :");
        PanelAjouterCENTER.add(AnneeLabel);
        final JTextField AnneeTF = new JTextField(10);
        PanelAjouterCENTER.add(AnneeTF);

        JLabel EncadreurLabel = new JLabel("Résumé :");
        PanelAjouterCENTER.add(EncadreurLabel);
        final JTextField EncadrerTF = new JTextField(10);
        PanelAjouterCENTER.add(EncadrerTF);

        JLabel coteLabel = new JLabel("Côte :");
        PanelAjouterCENTER.add(coteLabel);
        final JTextField coteTF = new JTextField(10);
        PanelAjouterCENTER.add(coteTF);

        JLabel resumeLabel = new JLabel("Encadreur :");
        PanelAjouterCENTER.add(resumeLabel);
        final JTextField resumeTF = new JTextField(100);
        PanelAjouterCENTER.add(resumeTF);

        JLabel resumevide = new JLabel("");
        PanelAjouterCENTER.add(resumevide);
        JLabel resumeviide = new JLabel("");
        PanelAjouterCENTER.add(resumeviide);
        JLabel resumeviiide = new JLabel("");
        PanelAjouterCENTER.add(resumeviiide);

        JButton BtnAjouter = new JButton("Ajouter");
        BtnAjouter.setBackground(Color.BLACK);
        BtnAjouter.setForeground(Color.WHITE);
        BtnAjouter.setPreferredSize(new Dimension(10, 40));
        PanelAjouterCENTER.add(BtnAjouter);

        PanelAjouter.add(PanelAjouterCENTER);

        /* ================================= */

        /* ====================================================== */

        final JPanel PanelEns = new JPanel();
        PanelEns.setLayout(new BorderLayout());
        JLabel EnsLabel = new JLabel("Bienvenue dans la partie Enseignants");
        EnsLabel.setPreferredSize(new Dimension(370, 40));
        EnsLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel PanelEnsLabel = new JPanel();

        PanelEnsLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
        PanelEnsLabel.add(EnsLabel);
        PanelEns.add(PanelEnsLabel, BorderLayout.NORTH);
 
        /* =========================================== */

        JPanel EnsPanelAdd = new JPanel();
        EnsPanelAdd.setLayout((new BorderLayout()));
        JPanel EnsPanelAddWest = new JPanel();


        EnsPanelAdd.add(EnsPanelAddWest, BorderLayout.WEST);

        JPanel EnsPR = new JPanel();
        EnsPR.setLayout((new BorderLayout()));
        JPanel EnsPR1 = new JPanel();

       
        EnsPR.add(EnsPR1, BorderLayout.WEST);

        JPanel EnsPR2 = new JPanel();
        EnsPR2.setLayout(new BoxLayout(EnsPR2, BoxLayout.Y_AXIS));

        JPanel EnsPR2H = new JPanel();
        EnsPR2H.setLayout(new GridLayout(4, 2));

        JLabel EnsCodeL = new JLabel("Par Nom : ");
        final JTextField EnsCodeTF = new JTextField(15);
        EnsCodeL.setFont(new Font("Arial", Font.PLAIN, 20));
        EnsPR2H.add(EnsCodeL);
        EnsPR2H.add(EnsCodeTF);

        JLabel EnsTitreL = new JLabel("Par Matricule : ");
        final JTextField EnsTitreTF = new JTextField(15);
        EnsTitreL.setFont(new Font("Arial", Font.PLAIN, 20));
        EnsPR2H.add(EnsTitreL);
        EnsPR2H.add(EnsTitreTF);

        JLabel EnsEncadreurL = new JLabel("Par Département : ");
        final JTextField EnsEncadreurTF = new JTextField(15);
        EnsEncadreurL.setFont(new Font("Arial", Font.PLAIN, 20));
        EnsPR2H.add(EnsEncadreurL);
        EnsPR2H.add(EnsEncadreurTF);

        JPanel EnsVide = new JPanel();
        EnsPR2H.add(EnsVide);

        JButton EnsBtnRechercher = new JButton("Search");
        EnsBtnRechercher.setBackground(Color.BLACK);
        EnsBtnRechercher.setForeground(Color.WHITE);
        EnsBtnRechercher.setPreferredSize(new Dimension(10, 40));
        EnsPR2H.add(EnsBtnRechercher);

        final JPanel EnsPR2S = new JPanel();
        EnsPR2S.setBackground(Color.WHITE);
        EnsPR2S.setPreferredSize(new Dimension(200, 200));
        Border EnsBorder2 = BorderFactory.createLineBorder(Color.BLACK, 1);
        EnsPR2S.setBorder(EnsBorder2);

        JPanel EnsPR2Btn = new JPanel();
        EnsPR2Btn.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton EnsBtnModifier = new JButton("Modifier");
        EnsBtnModifier.setBackground(Color.BLACK);
        EnsBtnModifier.setForeground(Color.WHITE);
        EnsBtnModifier.setPreferredSize(new Dimension(10, 40));
        EnsBtnModifier.setPreferredSize(new Dimension(200, EnsBtnModifier.getPreferredSize().height));
        EnsPR2Btn.add(EnsBtnModifier);

        JButton EnsBtnSupprimer = new JButton("Supprimer");
        EnsBtnSupprimer.setBackground(Color.BLACK);
        EnsBtnSupprimer.setForeground(Color.WHITE);
        EnsBtnSupprimer.setPreferredSize(new Dimension(10, 40));
        EnsBtnSupprimer.setPreferredSize(new Dimension(200, EnsBtnSupprimer.getPreferredSize().height));
        EnsPR2Btn.add(EnsBtnSupprimer);

        EnsPR2.add(EnsPR2H);
        EnsPR2.add(EnsPR2S);
        EnsPR2.add(EnsPR2Btn);

        EnsPR.add(EnsPR2, BorderLayout.CENTER);

        PanelEns.add(EnsPR, BorderLayout.CENTER);

        /* ================================= */
        final JPanel PanelEnsM = new JPanel();
        PanelEnsM.setLayout(new BorderLayout());
        JLabel EnsLabelM = new JLabel("Effectuer des modifications");
        EnsLabelM.setPreferredSize(new Dimension(370, 40));
        EnsLabelM.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel PanelEnsLabelM = new JPanel();

        PanelEnsLabelM.setLayout(new FlowLayout(FlowLayout.CENTER));
        PanelEnsLabelM.add(EnsLabelM);
        PanelEnsM.add(PanelEnsLabelM, BorderLayout.NORTH);
 
        /* =========================================== */

        JPanel EnsPanelAddM = new JPanel();
        EnsPanelAddM.setLayout(new BorderLayout());

        JPanel EnsPanelAddWestM = new JPanel();

        EnsPanelAddM.add(EnsPanelAddWestM,BorderLayout.WEST);

        JPanel EnsPRM = new JPanel();
        EnsPRM.setLayout(new BorderLayout());

        JPanel EnsPR1M = new JPanel();
        EnsPRM.add(EnsPR1M, BorderLayout.WEST);

        JPanel EnsPR2M = new JPanel();
        EnsPR2.setLayout(new BoxLayout(EnsPR2, BoxLayout.Y_AXIS));

        JPanel EnsPR2HM = new JPanel();
        EnsPR2HM.setLayout(new GridLayout(4, 2));

        JLabel EnsCodeLM = new JLabel("NOM : ");
        final JTextField EnsCodeTFM = new JTextField(15);
        EnsCodeLM.setFont(new Font("Arial", Font.PLAIN, 50));
        EnsPR2HM.add(EnsCodeLM);
        EnsPR2HM.add(EnsCodeTFM);

        JLabel EnsTitreLM = new JLabel("PRENOM  : ");
        final JTextField EnsTitreTFM = new JTextField(15);
        EnsTitreLM.setFont(new Font("Arial", Font.PLAIN, 50));
        EnsPR2HM.add(EnsTitreLM);
        EnsPR2HM.add(EnsTitreTFM);

        JLabel EnsEncadreurLM = new JLabel("Département : ");
        final JTextField EnsEncadreurTFM = new JTextField(15);
        EnsEncadreurLM.setFont(new Font("Arial", Font.PLAIN, 50));
        EnsPR2HM.add(EnsEncadreurLM);
        EnsPR2HM.add(EnsEncadreurTFM);

        
        
        JButton EnsBtnModifierM = new JButton("MODIFIER/Quitter");
        EnsBtnModifierM.setBackground(Color.BLACK);
        EnsBtnModifierM.setForeground(Color.WHITE);
        EnsBtnModifierM.setPreferredSize(new Dimension(10, 40)); // Ajustez les dimensions ici
        EnsPR2HM.add(EnsBtnModifierM);

       
        JButton EnsBtnRecupererM = new JButton("RECUPERER");
        EnsBtnRecupererM.setBackground(Color.BLACK);
        EnsBtnRecupererM.setForeground(Color.WHITE);
        EnsBtnRecupererM.setPreferredSize(new Dimension(10, 40)); // Ajustez les dimensions ici
        EnsPR2HM.add(EnsBtnRecupererM);
       
       
        EnsPR2M.add(EnsPR2HM);
       
        EnsPRM.add(EnsPR2M, BorderLayout.CENTER);

        EnsPanelAddM.add(EnsPRM, BorderLayout.CENTER);
        EnsPanelAddM.add(EnsPanelAddWestM, BorderLayout.WEST);

        PanelEnsM.add(EnsPanelAddM, BorderLayout.CENTER);
        /* ============================================== */
        pA2.setBackground(Color.GRAY);
        p.add(pA1, BorderLayout.CENTER);
        p.add(pA2, BorderLayout.SOUTH);
        /* ==================================================== */
        ENSEIGNANT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.remove(PR);
                p.remove(PanelAjouter);
                
                p.add(PanelAjouter);
                p.add(PR);
                p.add(PanelEns);

                pA2.setVisible(false);
                pA1.setVisible(false);
                PR.setVisible(false);
                PanelAjouter.setVisible(false);
                PanelEns.setVisible(true);
            }
        });

        ACCUEIL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pA1.setVisible(true);
                pA2.setVisible(true);

                PR.setVisible(false);
                PanelAjouter.setVisible(false);
            }
        });

        RECHERCHER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.remove(PanelEns);
                p.remove(PanelAjouter);

                p.add(PanelEns);
                p.add(PanelAjouter);
                p.add(PR);

                pA2.setVisible(false);
                pA1.setVisible(false);
                PanelEns.setVisible(false);
                PR.setVisible(true);
                PanelAjouter.setVisible(false);
         
				
            }
        });

        AJOUTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.remove(PanelEns);
                p.remove(PR);

                p.add(PR);
                p.add(PanelAjouter);

                pA2.setVisible(false);
                pA1.setVisible(false);
                PR.setVisible(false);
                PanelAjouter.setVisible(true);
            }
        });
        BtnRecherche.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 
				String cot = CodeTF.getText();
				String ti = TitreTF.getText();
				String enc =EncadreurTF.getText();
				if(!cot.isEmpty() || !ti.isEmpty() || !enc.isEmpty()) {
				JTable result=method.info(cot,ti,enc);
				
				PR2S.removeAll();
				PR2S.add(new JScrollPane(result));
				PR2S.revalidate();
				PR2S.repaint();
				 }else {
						JOptionPane.showMessageDialog(null," Veiullez remplir un des champs de saisie!","",JOptionPane.WARNING_MESSAGE);
					}
			}
        });
        EnsBtnRechercher.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				
				String idd=	EnsTitreTF.getText();	
				String no = EnsCodeTF.getText();
				String dep =EnsEncadreurTF.getText();
				if(!idd.isEmpty() || !no.isEmpty() || !dep.isEmpty()) {
				JTable taresult=method.infoProf(idd,no,dep);
				EnsPR2S.removeAll();
				EnsPR2S.add(new JScrollPane(taresult));
				EnsPR2S.revalidate();
				EnsPR2S.repaint();
				 }else {
						JOptionPane.showMessageDialog(null," Veiullez remplir un des champs de saisie!","",JOptionPane.WARNING_MESSAGE);
					}
				
			}
        });
        BtnAjouter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String co=coteTF.getText();
				String ti=TitreLTF.getText();
				String aut=AuteurTF.getText();
				String ann =AnneeTF.getText(); 
				
			   
				String resume=EncadrerTF.getText();
				String encad=resumeTF.getText();
				if(!co.isEmpty() && !ti.isEmpty() && !aut.isEmpty() && !ann.isEmpty() && !resume.isEmpty() && !encad.isEmpty() ) {
				 int an=Integer.parseInt(ann);	
				method.insert(co,ti,aut,an,resume,encad);
				coteTF.setText(null);
				TitreLTF.setText(null);
				AuteurTF.setText(null);
				AnneeTF.setText(null);
				EncadrerTF.setText(null);
				resumeTF.setText(null);
				 }else {
						JOptionPane.showMessageDialog(null," Veiullez remplir tout les champs de saisie!","",JOptionPane.WARNING_MESSAGE);
					}}catch(Exception n) {
						JOptionPane.showMessageDialog(null,"l'annee doit etre un nombre entier","",JOptionPane.WARNING_MESSAGE);
					}
       
			}
			});
        BtnSupprimer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String cot = CodeTF.getText();
				String ti = TitreTF.getText();
				String enc =EncadreurTF.getText();
				 if(!cot.isEmpty() || !ti.isEmpty() || !enc.isEmpty()) {
				method.supp_mem(cot,ti,enc);
				PR2S.removeAll();
				PR2S.revalidate();
				PR2S.repaint();
				CodeTF.setText(null);
				TitreTF.setText(null);
				EncadreurTF.setText(null);
			}else {
				JOptionPane.showMessageDialog(null," Veiullez remplir un des champs de saisie!","",JOptionPane.WARNING_MESSAGE);
			}
				 }
        });
        	
        EnsBtnSupprimer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String idd=	EnsTitreTF.getText();	
				String no = EnsCodeTF.getText();
				String dep =EnsEncadreurTF.getText();
				if(!idd.isEmpty() || !no.isEmpty() || !dep.isEmpty()) {
				method.supp_prof(idd,no,dep);
				EnsPR2S.removeAll();
				EnsPR2S.revalidate();
				EnsPR2S.repaint();
				EnsTitreTF.setText(null);
				EnsCodeTF.setText(null);
				EnsEncadreurTF.setText(null);
				 }else {
						JOptionPane.showMessageDialog(null," Veiullez remplir un des champs de saisie!","",JOptionPane.WARNING_MESSAGE);
					}
			}
        }); 
        BtnModifier.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		 if(!CodeTF.getText().isEmpty()) {
        			 
        		p.remove(PanelEns);
                 p.remove(PR);

                 p.add(PR);
                 p.add(PanelModifier);

                 pA2.setVisible(false);
                 pA1.setVisible(false);
                 PR.setVisible(false);
                 PanelAjouter.setVisible(false);
                 PanelModifier.setVisible(true);
                 }
        		 else {
        			 JOptionPane.showMessageDialog(null," Veiullez donner le cote de memoire souhaiter a recuperer!","",JOptionPane.WARNING_MESSAGE);
        		 }
        		
        	}
        });
        
	   

        BtnModifierr.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String cot=	CodeTF.getText();
				String co=coteTFM.getText();
				String tit=TitreLTFM.getText();
				String aut=AuteurTFM.getText();
				int an = Integer.parseInt(AnneeTFM.getText());	
				 
			   
				String resume=EncadrerTFM.getText();
				String encad=resumeTFM.getText();
				
				method.modif_mem(co,tit,aut,an,resume,encad,cot);
				CodeTF.setText(null);
 				TitreTF.setText(null);
 				EncadreurTF.setText(null);
				 p.remove(PanelEns);
	                p.remove(PanelAjouter);
                    p.remove(PanelModifier);
	                p.add(PanelEns);
	                p.add(PanelAjouter);
	                p.add(PR);

	                pA2.setVisible(false);
	                pA1.setVisible(false);
	                PanelEns.setVisible(false);
	                PR.setVisible(true);
	                PanelAjouter.setVisible(false);
                 PanelModifier.setVisible(false);
			}catch(Exception E) {
				 JOptionPane.showMessageDialog(null," Veiullez remplir tout les champs de saisie! et l'annee doit etre un nombre!!","",JOptionPane.WARNING_MESSAGE);
    		}
                
			}
        });
        BtnRecuperer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	  
                String cot=CodeTF.getText();
		String[] recup=method.recuperer(cot);
		
	
		
			
			        coteTFM.setText(recup[0]);
				TitreLTFM.setText(recup[1]);
				AuteurTFM.setText(recup[2]);
				AnneeTFM.setText(recup[3]);
				EncadrerTFM.setText(recup[5]);
				resumeTFM.setText(recup[4]);
                            
			
		
        }});
        BtnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	  
				 p.remove(PanelEns);
	                p.remove(PanelAjouter);
                 p.remove(PanelModifier);
	                p.add(PanelEns);
	                p.add(PanelAjouter);
	                p.add(PR);

	                pA2.setVisible(false);
	                pA1.setVisible(false);
	                PanelEns.setVisible(false);
	                PR.setVisible(true);
	                PanelAjouter.setVisible(false);
              PanelModifier.setVisible(false);
				
			  }});
        EnsBtnModifier.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String idd=	EnsTitreTF.getText();
        		if(!idd.isEmpty()) {
        			 p.remove(PR);
                     p.remove(PanelAjouter);
                     
                     p.add(PanelAjouter);
                     p.add(PR);
                     p.add(PanelEns);
                     p.add(PanelEnsM);
                     pA2.setVisible(false);
                     pA1.setVisible(false);
                     PR.setVisible(false);
                     PanelAjouter.setVisible(false);
                     PanelEns.setVisible(false);
                     PanelEnsM.setVisible(true);
        		}else {
        			 JOptionPane.showMessageDialog(null," Veiullez donner la matricule du prof!!","",JOptionPane.WARNING_MESSAGE);
        		}
        		
        		
        	}
        });
        EnsBtnRecupererM.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 String cot=EnsTitreTF.getText();
        			String[] recup=method.recupererP(cot);
        			  EnsCodeTFM.setText(recup[0]);
      				EnsTitreTFM.setText(recup[1]);
      				EnsEncadreurTFM.setText(recup[2]);
      				
                                  
        
        	} });
        EnsBtnModifierM.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
    				String cot=	EnsTitreTF.getText();
    				String no=EnsCodeTFM.getText();
    				String pre=EnsTitreTFM.getText();
    				String dep=EnsEncadreurTFM.getText();	
    				 
    			   
    				
    				
    				method.modif_prof(no,pre,dep,cot);
    				CodeTF.setText(null);
     				TitreTF.setText(null);
     				EncadreurTF.setText(null);
     				  p.remove(PR);
     	                p.remove(PanelAjouter);
     	                
     	                p.add(PanelAjouter);
     	                p.add(PR);
     	                p.add(PanelEns);
     	               p.add(PanelEnsM);
     	                pA2.setVisible(false);
     	                pA1.setVisible(false);
     	                PR.setVisible(false);
     	                PanelAjouter.setVisible(false);
     	                PanelEns.setVisible(true);
     	               PanelEnsM.setVisible(false);
    			}catch(Exception E) {
    				 JOptionPane.showMessageDialog(null," Veiullez remplir tout les champs de saisie!","",JOptionPane.WARNING_MESSAGE);
        		}
                    
        	}
        });
        frame.getContentPane().add(p);
        frame.setVisible(true);

  }  
    
    }		
	


