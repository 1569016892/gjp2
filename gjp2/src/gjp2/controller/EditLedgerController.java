package gjp2.controller;

import javax.swing.JDialog;

import gjp2.view.AbstractOperationLedgerDialog;
import javafx.animation.SequentialTransitionBuilder;

public class EditLedgerController extends AbstractOperationLedgerDialog {

	public EditLedgerController(JDialog dialog) {
		super(dialog);
		titleLabel.setText("编辑账务");
		setTitle("编辑账务");
	}

	@Override
	public void changeParent() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void confirm() {
		// TODO 自动生成的方法存根

	}

}
