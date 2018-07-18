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
	 	dataset.setValue(100, "北京", "桃子");
		dataset.setValue(50, "北京", "荔枝");
		dataset.setValue(150, "北京", "西瓜");
		dataset.setValue(80, "北京", "香蕉");
		dataset.setValue(60, "北京", "芒果");
		dataset.setValue(80, "北京", "芒果");
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果类型", "销量", dataset, PlotOrientation.VERTICAL, true,true, false);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar2.jpg"), chart, 700, 500);
		System.out.println("图表生成ok");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
