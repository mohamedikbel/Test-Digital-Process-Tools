package test.ikbel.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.ikbel.entities.Ascenseur;
import test.ikbel.services.Impl.ImplAscenceur;

/**
 * On peut exposer ces APIS pour utliser nos Ascenceurs Il faut impérativement
 * Exposer l'intialisation des Ascenceurs
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class AscenceurController {

	@Autowired
	ImplAscenceur ImpAsc;

	/**
	 * Ce service permet l'initialisation de tous les ascencurs au premier étage
	 */

	@PostMapping("/Ascenceurs")

	public Ascenseur[] InitialiserAsecenceurs() {

		return ImpAsc.IntialiserSysteme();

	}

	/**
	 * Ce service affiche la liste des Ascenceurs
	 * 
	 */

	@GetMapping("/Ascenceurs")
	public Ascenseur[] AfficherAsecenceurs() {

		return ImpAsc.AfficherLesAscenceur();

	}

	/**
	 * Ce Méthode service nous retourne l'étage actuel
	 */
	
	@GetMapping("/Ascenceurs/{IdAscenceur}")

	public int AfficherEtageAsecenceur(@PathVariable("IdAscenceur") int IdAscenceur) {

		System.out.println(ImpAsc.AfficherEtageActuel(IdAscenceur));
		return ImpAsc.AfficherEtageActuel(IdAscenceur);

	}

	/**
	 * Cette méthode retourne : True si l'assenceur peut encore monter (on
	 * incrumente le numero de l'étage) False si l'assenceur atteint la limite
	 */

	@PostMapping("/Ascenceurs/GoUp/{IdAscenceur}")

	public boolean GoUp(@PathVariable("IdAscenceur") int IdAscenceur) {

		return ImpAsc.GoUp(IdAscenceur);

	}

	/**
	 * Ce service retourne : True si l'assenceur peut encore descendre (on
	 * décrémenter le numero de l'étage) False si l'assenceur atteint la limite
	 */
	
	@PostMapping("/Ascenceurs/GoDown/{IdAscenceur}")

	public boolean GoDown(@PathVariable("IdAscenceur") int IdAscenceur) {

		return ImpAsc.GoDown(IdAscenceur);

	}

}
