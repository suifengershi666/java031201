package com.offcn.jfreechant.bar;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

public class Bar3 {

	public static void main(String[] args) throws IOException {
		
		//准备数据集合
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100, "北京", "桃子");
		dataset.setValue(120, "上海", "桃子");
		dataset.setValue(140, "广州", "桃子");
		dataset.setValue(150, "深圳", "桃子");
		dataset.setValue(100, "北京", "桃子");
		dataset.setValue(120, "上海", "桃子");
		dataset.setValue(140, "广州", "桃子");
		dataset.setValue(150, "深圳", "桃子");
		dataset.setValue(200, "北京", "西瓜");
		dataset.setValue(20, "上海", "西瓜");
		dataset.setValue(70, "广州", "西瓜");
		dataset.setValue(80, "深圳", "西瓜");
		dataset.setValue(10, "北京", "榴莲");
		dataset.setValue(140, "上海", "榴莲");
		dataset.setValue(190, "广州", "榴莲");
		dataset.setValue(230, "深圳", "榴莲");
	
		//创建图表对象
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果类型", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		
		//设置属性
		//获取绘图区对象
		CategoryPlot plot =chart.getCategoryPlot();
		
		//设置绘图区的背景色
		plot.setBackgroundPaint(Color.PINK);
		
		//创建一个3d渲染器
		BarRenderer3D renderer3d = new BarRenderer3D();
		//给渲染器设置标签：1.获取销量数据，2.设置数据显示的格式，按照数字格式
		renderer3d.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", NumberFormat.getNumberInstance()));
		//设置标签的可视化
		renderer3d.setBaseItemLabelsVisible(true);
		//调整标签的位置
		renderer3d.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
		//设置和柱子间的距离
		renderer3d.setItemLabelAnchorOffset(10D);
		//设置柱子之间的距离
		renderer3d.setItemMargin(0.5);
		
		//关联渲染器和绘图区
		plot.setRenderer(renderer3d);
		
		//4.保存图片
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar4.jpg"), chart, 700, 500);
		
		System.out.println("ok");
	}

}
