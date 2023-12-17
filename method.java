package ihmproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class method {
	protected Connection con;
	public PreparedStatement ps;
	public ResultSet rs;
	public static JTable txtm;
public void connect () {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ihm","root","");
		} catch (Exception e ) {
			e.printStackTrace();
		}
}

public JTable info(String cot,String ti,String encad ) {
        JTable rse=null;
	try {
		connect();
		String [] tete = {"cote", "titre","auteur","resume","annee","encadreur"};
		String [] ligne = new String[7];
		
		DefaultTableModel model= new DefaultTableModel(null,tete);
		txtm = new JTable();
		
		PreparedStatement ps= con.prepareStatement("select cote,titre,auteur,annee,encad,resume  from memoire  where cote= ? OR titre=?OR encad=?");
		ps.setString(1,cot);
		ps.setString(2,ti);
		ps.setString(3,encad);
		ResultSet rs = ps.executeQuery();
		
	
		while(rs.next()) {
			ligne[0] = rs.getString("cote");
			ligne[1] = rs.getString("titre");
			ligne[2] = rs.getString("auteur");
			ligne[3] = rs.getString("resume");
			ligne[4] = rs.getString("annee");
			ligne[5] = rs.getString("encad");
			
			model.addRow(ligne);
		}

		txtm.setModel(model);
		rse=txtm;
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return rse;
  
}
public JTable infoProf(String id,String no,String dep) {
    JTable rse=null;
try {
	connect();
	String [] tete = {"nom", "prenom","departement"};
	
	
	DefaultTableModel model= new DefaultTableModel(null,tete);
	
	
	PreparedStatement ps= con.prepareStatement("select nom,prenom,departement from enseignant  where id= ? OR nom=? OR departement=?");
	ps.setString(1,id);
	ps.setString(2,no);
	ps.setString(3,dep);
	ResultSet rs = ps.executeQuery();
	
	
	while(rs.next()) {
		String [] ligne = new String[3];
		ligne[0] = rs.getString("nom");
		ligne[1] = rs.getString("prenom");
		ligne[2] = rs.getString("departement");
		
		model.addRow(ligne);
	}
	rse = new JTable(model);
	

	con.close();
}catch(Exception e) {
	e.printStackTrace();
}

return rse;

}
public void insert(String co,String ti,String aut,int an,String resum,String encad ) {
try {
	connect();
	PreparedStatement ps= con.prepareStatement("insert into memoire (cote,titre,auteur,annee,resume,encad)values (?,?,?,?,?,?)");
	ps.setString(1,co);
	ps.setString(2,ti);
	ps.setString(3,aut);
	ps.setInt(4,an);
	ps.setString(5,resum);
	ps.setString(6,encad);
	int rowsAffected=ps.executeUpdate();
	if(rowsAffected>0) {
	JOptionPane.showMessageDialog(null, "Memoire Ajouté !!");}
	con.close();
}catch(Exception e) {
	e.printStackTrace();
	JOptionPane.showMessageDialog(null, "le cote doit etre unique et n'est pas associé deja a une autre memoire");
}


}
public void supp_mem(String cot,String ti,String encad) {
	try {
		connect();
		PreparedStatement ps= con.prepareStatement("delete from memoire  where cote= ? OR titre=?OR encad=?");
		ps.setString(1,cot);
		ps.setString(2,ti);
		ps.setString(3,encad);
		
		int rowsAffected=ps.executeUpdate();
		if(rowsAffected>0) {
		JOptionPane.showMessageDialog(null," memoire Supprimé avec success");}
		con.close();
		
	}catch(Exception e){
		e.printStackTrace();
		JOptionPane.showMessageDialog(null,"erreur!! memoire non Supprimé");	
	}
}
public void supp_prof(String mat,String no,String dep) {
	try {
		connect();
		PreparedStatement ps= con.prepareStatement("delete from enseignant  where id= ? OR nom=? OR departement=?");
		ps.setString(1,mat);
		ps.setString(2,no);
		ps.setString(3,dep);
		
		int rowsAffected=ps.executeUpdate();
		if(rowsAffected>0){ 
		JOptionPane.showMessageDialog(null," professeur Supprimé avec success");}
		con.close();
		
	}catch(Exception e){
		e.printStackTrace();
		JOptionPane.showMessageDialog(null,"erreur!! professeur non Supprimé");	
	}
}


public void modif_mem(String co,String tit,String aut,int an,String resum,String encad, String cot ) {
	try {
		connect();
		PreparedStatement ps = con.prepareStatement("UPDATE memoire SET cote = ? ,titre=?,auteur=?,annee=?,resume=?,encad=? where cote=? ");
		ps.setString(1,co);
		ps.setString(2,tit);
		ps.setString(3,aut);
		ps.setInt(4,an);
		ps.setString(5,resum);
		ps.setString(6,encad);
		ps.setString(7,cot);
		
		
		int rowsAffected=ps.executeUpdate();
		if(rowsAffected>0){ 
		JOptionPane.showMessageDialog(null, " Mise a jour reussé");}
		else {JOptionPane.showMessageDialog(null, "erreur du modification,Aucun enregistrement trouvé pour le code " + cot );}
		con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}

public String[] recuperer(String cot) {
	String [] tab = new String[6];
	
try {
	
	       connect();
           PreparedStatement ps= con.prepareStatement("select cote,titre,auteur,annee,encad,resume  from memoire  where (cote=?)");
	ps.setString(1,cot);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
        tab[0] = rs.getString("cote");
        tab[1] = rs.getString("titre");
        tab[2] = rs.getString("auteur");
        tab[3] = rs.getString("annee");
        tab[4] = rs.getString("encad");
        tab[5] = rs.getString("resume");
    } else {
        // Aucun résultat trouvé
        JOptionPane.showMessageDialog(null, "Aucun enregistrement trouvé pour le code " + cot);
    }
	
	
	con.close();}catch(Exception e){
		JOptionPane.showMessageDialog(null, "erreur du recuperation");
		e.printStackTrace();
	}

	return tab;
}
public String[] recupererP(String cot) {
	String [] tab = new String[3];
	
try {
	
	       connect();
           PreparedStatement ps= con.prepareStatement("select nom,prenom,departement  from enseignant  where (id=?)");
	ps.setString(1,cot);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
        tab[0] = rs.getString("nom");
        tab[1] = rs.getString("prenom");
        tab[2] = rs.getString("departement");
      
    } else {
        // Aucun résultat trouvé
        JOptionPane.showMessageDialog(null, "Aucun enregistrement trouvé pour la matricule " + cot);
    }
	
	
	con.close();}catch(Exception e){
		JOptionPane.showMessageDialog(null, "erreur du recuperation");
		e.printStackTrace();
	}

	return tab;
}
public void modif_prof(String no,String pre,String dep, String cot ) {
	try {
		connect();
		PreparedStatement ps = con.prepareStatement("UPDATE enseignant SET nom = ? ,prenom=?,departement=? where id=? ");
		ps.setString(1,no);
		ps.setString(2,pre);
		ps.setString(3,dep);
		ps.setString(4,cot);
		
		int rowsAffected=ps.executeUpdate();
		if(rowsAffected>0){ 
		JOptionPane.showMessageDialog(null, " Mise a jour reussé");}
		else {JOptionPane.showMessageDialog(null, "erreur du modification,Aucun enregistrement trouvé pour la matricule " + cot );}
		con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}


}

