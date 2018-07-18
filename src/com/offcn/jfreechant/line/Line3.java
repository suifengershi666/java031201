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
		
		dataset.setValue(100, "����", "ƻ��");
		dataset.setValue(70, "����", "����");
		dataset.setValue(80, "����", "����");
		dataset.setValue(150, "����", "�㽶");
		dataset.setValue(60, "����", "���ܹ�");
		dataset.setValue(110, "����", "����");
		
		
		dataset.setValue(80, "�Ϻ�", "ƻ��");
		dataset.setValue(50, "�Ϻ�", "����");
		dataset.setValue(60, "�Ϻ�", "����");
		dataset.setValue(130, "�Ϻ�", "�㽶");
		dataset.setValue(40, "�Ϻ�", "���ܹ�");
		dataset.setValue(90, "�Ϻ�", "����");
		
		JFreeChart chart = ChartFactory.createLineChart3D("ˮ������ͼ", "ˮ������", "����", dataset, PlotOrientation.VERTICAL, true,true, false);
		
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



















