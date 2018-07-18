package com.offcn.jfreechant.pie;

public class Pie0 {

	public static void main(String[] args) {
	/*	//准备数据集合
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("苹果", 100);
		dataset.setValue("葡萄", 120);
		dataset.setValue("梨子", 80);
		dataset.setValue("榴莲", 60);
		//创建图表对象
		JFreeChart chart = ChartFactory.createPieChart("水果销量图", dataset, true, true, false);
		

		//获取绘图区对象
		PiePlot pieplot=(PiePlot) chart.getPlot();
		//设置标签字体
		pieplot.setLabelFont(new Font("黑体",1,12));
		//设置无数据提示
		pieplot.setNoDataMessage("对不起数据加载失败");
		//设定饼状图的标签 0--商品名称  1销量  2销量占比
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}--{1}--{2}", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()));
	//设定2d切开效果 1\要切开的key 2、切开的距离
		pieplot.setExplodePercent("苹果", 0.2);
		pieplot.setExplodePercent("葡萄", 0.2);
		pieplot.setExplodePercent("梨子", 0.2);
		pieplot.setExplodePercent("榴莲", 0.2);
		
		//生成图片
		ChartUtilities.saveChartAsPNG(new File("d:\\chart\\pie4.png"), chart, 700, 500);
		System.out.println("ok");
	}*/
		
		
		
		
		
		
		
		/*//准备数据集合
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("苹果", 100);
		dataset.setValue("葡萄", 120);
		dataset.setValue("梨子", 80);
		dataset.setValue("榴莲", 60);
		//创建图表对象
		JFreeChart chart = ChartFactory.createPieChart3D("水果销量图", dataset, true, true, false);
		
		//绘图区对象
		PiePlot pieplot=(PiePlot) chart.getPlot();
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:{1}:{2}", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()));

		//3d透明效果
		PiePlot3D pieplot3d=(PiePlot3D) chart.getPlot();
		//设置开始角度
		pieplot3d.setStartAngle(120D);
		//设置旋转方向
		pieplot3d.setDirection(Rotation.ANTICLOCKWISE);
		//设置半透明效果0-1  0全透明  1不透明
		pieplot3d.setForegroundAlpha(0.5F);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\pie5.jpg"), chart, 700, 500);
		System.out.println("ok");
		*/
		
	}

}
