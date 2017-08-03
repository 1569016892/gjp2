package gjp2.controller;

import javax.swing.JDialog;

import gjp2.view.AbstractOperationLedgerDialog;

public class AddLedgerController extends AbstractOperationLedgerDialog {

	public AddLedgerController(JDialog dialog) {
		super(dialog);
		titleLabel.setText("添加账务");
		super.setTitle("添加账务");
	}

	@Override
	public void changeParent() {

	}

	@Override
	public void confirm() {
		// TODO 自动生成的方法存根

	}

}
