package gjp2.controller;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gjp2.domain.Sort;
import gjp2.services.SortService;
import gjp2.view.AbstractOperationSortDialog;
import gjp2.view.AbstractSortMngDialog;

public class AddSortController extends AbstractOperationSortDialog {

	public AddSortController(JDialog dialog) {
		super(dialog);
		titleLabel.setText("添加分类");
		super.setTitle("添加分类");
	}

	@Override
	public void confirm() {
		String parent = parentBox.getSelectedItem().toString();
		
		String sname = snameTxt.getText().trim();
		
		String sdesc = sdescArea.getText();
		
		if("=请选择=".equals(parent)){
			JOptionPane.showMessageDialog(this, "请选择分类", "错误提示", JOptionPane.ERROR_MESSAGE);
			return ;
		}
		
		if(sname == null || sname.equals("")){
			JOptionPane.showMessageDialog(this, "请填写分类名称");
			return ;
		}
		
		Sort sort = new Sort();
		sort.setParent(parent);
		sort.setSname(sname);
		sort.setSdesc(sdesc);
		
		SortService sortService = new SortService();
		
		sortService.addSort(sort);
		
		JOptionPane.showMessageDialog(this, "添加分类成功", "操作成功", JOptionPane.PLAIN_MESSAGE);
		
		this.dispose();
	}
}
