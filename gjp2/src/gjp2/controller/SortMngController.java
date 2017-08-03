package gjp2.controller;

import java.util.List;

import javax.swing.JFrame;

import gjp2.domain.Sort;
import gjp2.services.SortService;
import gjp2.view.AbstractSortMngDialog;

public class SortMngController extends AbstractSortMngDialog {
	
	private SortService sortService = new SortService();
	
	public SortMngController(JFrame frame) {
		super(frame);
		refresh();
	}

	@Override
	public void addSort() {
			new AddSortController(this).setVisible(true);
			refresh();
	}

	@Override
	public void editSort() {
			new EditSortController(this).setVisible(true);
			refresh();
	}

	@Override
	public void deleteSort() {

	}
	
	private void refresh(){
		List<Sort> list = sortService.querySortAll();
		super.setTableModel(list);
	}
}
