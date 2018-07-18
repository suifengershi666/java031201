package com.offcn.jfreechant.line;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.data.category.DefaultCategoryDataset;

public class Line3 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.setValue(100, "北京", "苹果");
		dataset.setValue(70, "北京", "葡萄");
		dataset.setValue(80, "北京", "梨子");
		dataset.setValue(150, "北京", "香蕉");
		dataset.setValue(60, "北京", "哈密瓜");
		dataset.setValue(110, "北京", "菠萝");
		
		
		dataset.setValue(80, "上海", "苹果");
		dataset.setValue(50, "上海", "葡萄");
		dataset.setValue(60, "上海", "梨子");
		dataset.setValue(130, "上海", "香蕉");
		dataset.setValue(40, "上海", "哈密瓜");
		dataset.setValue(90, "上海", "菠萝");
		
		JFreeChart chart = ChartFactory.createLineChart3D("水果销量图", "水果类型", "销量", dataset, PlotOrientation.VERTICAL, true,true, false);
		
		CategoryPlot plot = chart.getCategoryPlot();
		
		//LineAndShapeRenderer render = new LineAndShapeRenderer();
		LineRenderer3D render = new LineRenderer3D();
		
		render.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		render.setBaseItemLabelsVisible(true);
		
		plot.setRenderer(render);
		
		ChartUtilities.writeChartAsJPEG(new FileOutputStream("d:\\chart\\line3.jpg"), chart, 700, 500);
		System.out.println("ok");
		
	}
	
	
}



















