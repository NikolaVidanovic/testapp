package proizvodjacAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.AbstractAction;
import constants.WebConstant;
import domain.Proizvodjac;
import persistance.repository.ProizvodjacRepository;

public class CreateActionProizvodjac extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		Long pib = Long.parseLong(request.getParameter("pib"));
		String maticniBroj = request.getParameter("maticniBroj");
		String adresa = request.getParameter("adresa");
		Long pttBroj = Long.parseLong(request.getParameter("pttBroj"));
		
		Proizvodjac proizvodjac = ProizvodjacRepository.saveOrUpdateProizvodjac(pib, maticniBroj, adresa, pttBroj);
		
		request.setAttribute("proizvodjac", proizvodjac);
		
		return WebConstant.PAGE_PROIZVODJAC_CREATE;
	}

}
