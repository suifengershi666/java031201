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
import org.jfree.data.category.DefaultCategoryDataset;

public class Line1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100,"����","����");
		dataset.setValue(45,"����","ƻ��");
		dataset.setValue(67,"����","����");
		dataset.setValue(37,"����","��֦");
		dataset.setValue(79,"����","â��");
		dataset.setValue(58,"����","����");
		
		JFreeChart chart = ChartFactory.createLineChart("ˮ������ͼ", "ˮ������", "����", dataset, PlotOrientation.VERTICAL, true,true, false);
		
		CategoryPlot plot = chart.getCategoryPlot();
		
		LineAndShapeRenderer render = new LineAndShapeRenderer();
		render.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		render.setBaseItemLabelsVisible(true);
		
		plot.setRenderer(render);
		
		ChartUtilities.writeChartAsJPEG(new FileOutputStream("d:\\chart\\line2.jpg"), chart, 700, 500);
		System.out.println("ok");
		
	}
	
	
}



















