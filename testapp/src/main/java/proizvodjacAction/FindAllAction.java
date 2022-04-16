package proizvodjacAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.AbstractAction;
import constants.WebConstant;
import domain.Proizvodjac;
import persistance.repository.ProizvodjacRepository;

public class FindAllAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		List<Proizvodjac> listaProizvodjaca = ProizvodjacRepository.getAllProizvodjac();
		request.setAttribute("listaProizvodjaca", listaProizvodjaca);
		return WebConstant.PAGE_PROIZVODJAC_FINDALL;
	}

}
