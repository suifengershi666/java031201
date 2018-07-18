package com.offcn.jfreechant.bar;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Bar2 {

	public static void main(String[] args) throws IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	 	dataset.setValue(100, "����", "����");
		dataset.setValue(50, "����", "��֦");
		dataset.setValue(150, "����", "����");
		dataset.setValue(80, "����", "�㽶");
		dataset.setValue(60, "����", "â��");
		dataset.setValue(80, "����", "â��");
		
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ������", "����", dataset, PlotOrientation.VERTICAL, true,true, false);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar2.jpg"), chart, 700, 500);
		System.out.println("ͼ������ok");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
