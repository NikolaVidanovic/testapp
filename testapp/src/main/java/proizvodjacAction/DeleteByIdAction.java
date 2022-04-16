package proizvodjacAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.AbstractAction;
import constants.WebConstant;
import persistance.repository.ProizvodjacRepository;

public class DeleteByIdAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		Long id = Long.parseLong(request.getParameter("proizvodjacId"));
		
		boolean isDeleted = ProizvodjacRepository.deleteByIdProizvodjac(id);
		
		if(isDeleted) {
			return WebConstant.PAGE_PROIZVODJAC_DELETE;
		}
		else {
			request.setAttribute("deleteByIdError", "Proizvodjac pod id-"+id+" nije pronadjen");
			return WebConstant.PAGE_HOME;
		}
	}

}
