package gjp2.controller;

import gjp2.view.AbstractMainFrame;

public class MainFrameContrller extends AbstractMainFrame {
	/*
	 * 账务
	 */
	@Override
	public void ledgerMng() {
			new LedgerMngController(this).setVisible(true);
	}
	/*
	 * 分类
	 */
	@Override
	public void sortMng() {
			new SortMngController(this).setVisible(true);
	}

}
