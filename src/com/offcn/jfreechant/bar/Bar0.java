package com.offcn.jfreechant.bar;

public class Bar0 {
	/*+++++++++++++++++++++++++
	 * -----------------------------
	 */
	 	//1\׼�����ݼ���
		/*DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(150, "����", "����");
		dataset.addValue(90, "�Ϻ�", "����");
		dataset.addValue(70, "����", "����");
		dataset.addValue(60, "����", "����");
		
		dataset.addValue(260, "����", "��ݮ");
		dataset.addValue(10, "�Ϻ�", "��ݮ");
		dataset.addValue(70, "����", "��ݮ");
		dataset.addValue(80, "����", "��ݮ");
		
		
		dataset.addValue(70, "����", "����");
		dataset.addValue(40, "�Ϻ�", "����");
		dataset.addValue(90, "����", "����");
		dataset.addValue(120, "����", "����");*/
		/*
		double data[][]={{150,260,70},{99,88,89},{60,50,30},{120,110,90}};
		String rowKeys[]={"����","�Ϻ�","����","����"};
		String columKeys[]={"����","����","��ݮ"};
		//����dataset
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys,columKeys,  data);
		
		
		//2\����ͼ�����
		JFreeChart chart = ChartFactory.createBarChart("ˮ������", "����", "����", dataset, PlotOrientation.VERTICAL, true, true, false);

		//3������ͼƬ
		ChartUtilities.writeChartAsJPEG(new FileOutputStream("d:\\chart\\bar4.jpg"), chart, 700, 500);
	   System.out.println("ok");
	 */
	
	
/*	//1\׼�����ݼ���
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	dataset.addValue(150, "����", "����");
	dataset.addValue(90, "�Ϻ�", "����");
	dataset.addValue(70, "����", "����");
	dataset.addValue(60, "����", "����");
	
	dataset.addValue(260, "����", "��ݮ");
	dataset.addValue(10, "�Ϻ�", "��ݮ");
	dataset.addValue(70, "����", "��ݮ");
	dataset.addValue(80, "����", "��ݮ");
	
	
	dataset.addValue(70, "����", "����");
	dataset.addValue(40, "�Ϻ�", "����");
	dataset.addValue(90, "����", "����");
	dataset.addValue(120, "����", "����");
	
	//2\����ͼ�����
	  JFreeChart chart = ChartFactory.createBarChart3D("ˮ������", "����", "����", dataset, PlotOrientation.VERTICAL, true, true, false);

	  //3\��������
	  //��ȡ��ͼ������
	 CategoryPlot plot = chart.getCategoryPlot();
	 
	 //���û�ͼ���ı���ɫ
	 plot.setBackgroundPaint(Color.PINK);
	 //����һ��3d��Ⱦ��
	 BarRenderer3D render3d = new BarRenderer3D();
	 //����Ⱦ�����ñ�ǩ 1\��ȡ��������  2������������ʾ�ĸ�ʽ���������ָ�ʽ
	 render3d.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", NumberFormat.getNumberInstance()));
	 //������Ⱦ���ı�ǩ���ӻ�
	 render3d.setBaseItemLabelsVisible(true);
	 //������ǩ��λ��
	 render3d.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
	
	 //���ñ�ǩ�����ӵ�֮��ľ���
	 render3d.setItemLabelAnchorOffset(10D);
	 
	 //��������֮��ľ���
	 render3d.setItemMargin(0.5);
	 
	 //������Ⱦ���ͻ�ͼ��
	 plot.setRenderer(render3d);
	 
	 //4������ͼƬ
	 ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar5.jpg"), chart, 700, 500);
System.out.println("ok");
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
