package test.ikbel.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.ikbel.entities.Ascenseur;
import test.ikbel.services.Impl.ImplAscenseur;

/**
 * On peut exposer ces APIS pour utliser nos Ascenseurs Il faut impérativement
 * Exposer l'intialisation des Ascenceurs
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class AscenseurController {

	@Autowired
	ImplAscenseur ImpAsc;

	/**
	 * Ce service permet l'initialisation de tous les ascenseurs au premier étage
	 */

	@PostMapping("/Ascenseurs")

	public Ascenseur[] InitialiserAsecenceurs() {

		return ImpAsc.IntialiserSysteme();

	}

	/**
	 * Ce service affiche la liste des Ascenseurs
	 * 
	 */

	@GetMapping("/Ascenseurs")
	public Ascenseur[] AfficherAsecenceurs() {

		return ImpAsc.AfficherLesAscenseur();

	}

	/**
	 * Ce Méthode service nous retourne l'étage actuel
	 */
	
	@GetMapping("/Ascenseurs/{IdAscenseur}")

	public int AfficherEtageAsecenseur(@PathVariable("IdAscenseur") int IdAscenceur) {

		System.out.println(ImpAsc.AfficherEtageActuel(IdAscenceur));
		return ImpAsc.AfficherEtageActuel(IdAscenceur);

	}

	/**
	 * Cette méthode retourne : True si l'assenceur peut encore monter (on
	 * incrumente le numero de l'étage) False si l'assenceur atteint la limite
	 */

	@PostMapping("/Ascenseurs/GoUp/{IdAscenseur}")

	public boolean GoUp(@PathVariable("IdAscenseur") int IdAscenceur) {

		return ImpAsc.GoUp(IdAscenceur);

	}

	/**
	 * Ce service retourne : True si l'ascenseur peut encore descendre (on
	 * décrémenter le numero de l'étage) False si l'ascenseur atteint la limite
	 */
	
	@PostMapping("/Ascenseurs/GoDown/{IdAscenseur}")

	public boolean GoDown(@PathVariable("IdAscenseur") int IdAscenceur) {

		return ImpAsc.GoDown(IdAscenceur);

	}

}
