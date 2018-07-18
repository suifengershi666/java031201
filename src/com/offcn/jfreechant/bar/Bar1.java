package com.offcn.jfreechant.bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class Bar1 {

	public static void main(String[] args) throws IOException {
		/*DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	 	dataset.setValue(100, "����", "����");
		dataset.setValue(50, "����", "��֦");
		dataset.setValue(150, "����", "����");
		dataset.setValue(80, "����", "�㽶");
		
	
	 	dataset.setValue(66, "�Ϻ�", "����");
		dataset.setValue(36, "�Ϻ�", "��֦");
		dataset.setValue(90, "�Ϻ�", "����");
		dataset.setValue(120, "�Ϻ�", "�㽶");
		
		
	 	dataset.setValue(30, "����", "����");
		dataset.setValue(99, "����", "��֦");
		dataset.setValue(88, "����", "����");
		dataset.setValue(130, "����", "�㽶");
		*/
	
		double data[][] = {{100,20,30},{30,60,40},{60,80,100},{50,70,90}};
		String rowKeys[] ={"����","�Ϻ�","����","����"};
		String columnKeys[] ={"ƻ��","����","�㽶"};
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
		
		
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ������", "����", dataset, PlotOrientation.VERTICAL, true,true, false);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar3.jpg"), chart, 700, 500);
		System.out.println("ok");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
