package com.offcn.jfreechant.pie;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class Pie1 {

	public static void main(String[] args) throws IOException {
		//准备数据集合
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("苹果", 100);
		dataset.setValue("葡萄", 120);
		dataset.setValue("梨子", 80);
		dataset.setValue("榴莲", 60);
	
		//创建图表对象
		JFreeChart chart = ChartFactory.createPieChart("水果销量饼状图", dataset, true, true, false);
		
		//设置属性
		//获取绘图区对象
		PiePlot pieplot = (PiePlot)chart.getPlot();
		//设置饼状图的标签0--商品名称，1--销量，2--销量占比
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}--{1}--{2}",NumberFormat.getNumberInstance(),NumberFormat.getNumberInstance()));	
		
		//3d透明效果
		PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
		//设置开始角度
		pieplot3d.setStartAngle(120D);
		//设置旋转方向
		pieplot3d.setDirection(Rotation.ANTICLOCKWISE);
		//设置半透明效果，0-1，0全透明，1不透明
		pieplot3d.setForegroundAlpha(0.5F);
		
		
		//生成图片
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\pie2.jpg"), chart, 700, 500);
		System.out.println("ok");
	}

}
