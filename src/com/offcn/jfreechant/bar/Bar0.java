package com.offcn.jfreechant.bar;

public class Bar0 {
	/*+++++++++++++++++++++++++
	 * -----------------------------
	 */
	 	//1\准备数据集合
		/*DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(150, "北京", "西瓜");
		dataset.addValue(90, "上海", "西瓜");
		dataset.addValue(70, "广州", "西瓜");
		dataset.addValue(60, "深圳", "西瓜");
		
		dataset.addValue(260, "北京", "草莓");
		dataset.addValue(10, "上海", "草莓");
		dataset.addValue(70, "广州", "草莓");
		dataset.addValue(80, "深圳", "草莓");
		
		
		dataset.addValue(70, "北京", "菠萝");
		dataset.addValue(40, "上海", "菠萝");
		dataset.addValue(90, "广州", "菠萝");
		dataset.addValue(120, "深圳", "菠萝");*/
		/*
		double data[][]={{150,260,70},{99,88,89},{60,50,30},{120,110,90}};
		String rowKeys[]={"北京","上海","广州","深圳"};
		String columKeys[]={"菠萝","西瓜","草莓"};
		//创建dataset
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys,columKeys,  data);
		
		
		//2\创建图表对象
		JFreeChart chart = ChartFactory.createBarChart("水果销量", "地区", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);

		//3、生成图片
		ChartUtilities.writeChartAsJPEG(new FileOutputStream("d:\\chart\\bar4.jpg"), chart, 700, 500);
	   System.out.println("ok");
	 */
	
	
/*	//1\准备数据集合
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	dataset.addValue(150, "北京", "西瓜");
	dataset.addValue(90, "上海", "西瓜");
	dataset.addValue(70, "广州", "西瓜");
	dataset.addValue(60, "深圳", "西瓜");
	
	dataset.addValue(260, "北京", "草莓");
	dataset.addValue(10, "上海", "草莓");
	dataset.addValue(70, "广州", "草莓");
	dataset.addValue(80, "深圳", "草莓");
	
	
	dataset.addValue(70, "北京", "菠萝");
	dataset.addValue(40, "上海", "菠萝");
	dataset.addValue(90, "广州", "菠萝");
	dataset.addValue(120, "深圳", "菠萝");
	
	//2\创建图表对象
	  JFreeChart chart = ChartFactory.createBarChart3D("水果销量", "地区", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);

	  //3\设置属性
	  //获取绘图区对象
	 CategoryPlot plot = chart.getCategoryPlot();
	 
	 //设置绘图区的背景色
	 plot.setBackgroundPaint(Color.PINK);
	 //创建一个3d渲染器
	 BarRenderer3D render3d = new BarRenderer3D();
	 //给渲染器设置标签 1\获取销量数据  2、设置数据显示的格式，按照数字格式
	 render3d.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", NumberFormat.getNumberInstance()));
	 //设置渲染器的标签可视化
	 render3d.setBaseItemLabelsVisible(true);
	 //调整标签的位置
	 render3d.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
	
	 //设置标签和柱子的之间的距离
	 render3d.setItemLabelAnchorOffset(10D);
	 
	 //设置柱子之间的距离
	 render3d.setItemMargin(0.5);
	 
	 //关联渲染器和绘图区
	 plot.setRenderer(render3d);
	 
	 //4、保存图片
	 ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar5.jpg"), chart, 700, 500);
System.out.println("ok");
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
