package proizvodjacAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.AbstractAction;
import constants.WebConstant;
import domain.Proizvodjac;
import persistance.repository.ProizvodjacRepository;

public class FindByIdAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		Long id = Long.parseLong(request.getParameter("findByIdValue"));
		Proizvodjac proizvodjac = ProizvodjacRepository.getByIdProizvodjac(id);
		request.setAttribute("proizvodjac", proizvodjac);
		
		return WebConstant.PAGE_PROIZVODJAC_FINDBYID;
	}

}
