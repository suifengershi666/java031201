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
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Pie2 {

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
		//设置标签字体
		pieplot.setLabelFont(new Font("黑体",1,12));
		//设置无数据显示
		pieplot.setNoDataMessage("对不起数据加载失败");
		//设置饼状图的标签0--商品名称，1--销量，2--销量占比
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}--{1}--{2}",NumberFormat.getNumberInstance(),NumberFormat.getNumberInstance()));	
		pieplot.setExplodePercent("苹果", 0.2);
		pieplot.setExplodePercent("葡萄", 0.2);
		pieplot.setExplodePercent("梨子", 0.2);
		pieplot.setExplodePercent("榴莲", 0.2);
		//生成图片
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\pie1.jpg"), chart, 700, 500);
		System.out.println("ok");
	}

}
