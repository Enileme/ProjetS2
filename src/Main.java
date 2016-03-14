/**
 * Class qui lance le jeu
 * @author Simon, Valentin et Emeline
 *
 */
public class Main {

	public static void main(String[] args) {
		String[] img = new String[] {"images/rocher.png","images/mer.png","images/1.navire.png","images/2.navire.png","images/arbre.png"};
		Plateau plateau = new Plateau(img,10);
		Ile ile = new Ile();
		plateau.setJeu(ile.getTableau());
		plateau.affichage();
	}

}
