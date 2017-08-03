package gjp2.controller;

import javax.swing.JDialog;

import gjp2.view.AbstractOperationSortDialog;

public class EditSortController extends AbstractOperationSortDialog {

	public EditSortController(JDialog dialog) {
		super(dialog);
		titleLabel.setText("编辑分类");
		super.setTitle("编辑分类");
	}

	@Override
	public void confirm() {
		// TODO 自动生成的方法存根

	}

}
