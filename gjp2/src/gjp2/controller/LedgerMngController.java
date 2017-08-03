package gjp2.controller;

import javax.swing.JFrame;

import gjp2.view.AbstractLedgerMngDialog;

public class LedgerMngController extends AbstractLedgerMngDialog {

	public LedgerMngController(JFrame frame) {
		super(frame);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void addLedger() {
		new AddLedgerController(this).setVisible(true);

	}

	@Override
	public void editLedger() {
		new EditLedgerController(this).setVisible(true);

	}

	@Override
	public void deleteLedger() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void queryLedger() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void parentChange() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void pie() {
			new ShapeController(this).setVisible(true);
	}

}
