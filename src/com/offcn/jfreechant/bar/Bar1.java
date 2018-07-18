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
	 	dataset.setValue(100, "北京", "桃子");
		dataset.setValue(50, "北京", "荔枝");
		dataset.setValue(150, "北京", "西瓜");
		dataset.setValue(80, "北京", "香蕉");
		
	
	 	dataset.setValue(66, "上海", "桃子");
		dataset.setValue(36, "上海", "荔枝");
		dataset.setValue(90, "上海", "西瓜");
		dataset.setValue(120, "上海", "香蕉");
		
		
	 	dataset.setValue(30, "广州", "桃子");
		dataset.setValue(99, "广州", "荔枝");
		dataset.setValue(88, "广州", "西瓜");
		dataset.setValue(130, "广州", "香蕉");
		*/
	
		double data[][] = {{100,20,30},{30,60,40},{60,80,100},{50,70,90}};
		String rowKeys[] ={"北京","上海","广州","深圳"};
		String columnKeys[] ={"苹果","桃子","香蕉"};
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
		
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果类型", "销量", dataset, PlotOrientation.VERTICAL, true,true, false);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar3.jpg"), chart, 700, 500);
		System.out.println("ok");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
