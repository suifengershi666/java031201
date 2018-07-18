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
		
		//׼�����ݼ���
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100, "����", "����");
		dataset.setValue(120, "�Ϻ�", "����");
		dataset.setValue(140, "����", "����");
		dataset.setValue(150, "����", "����");
		dataset.setValue(100, "����", "����");
		dataset.setValue(120, "�Ϻ�", "����");
		dataset.setValue(140, "����", "����");
		dataset.setValue(150, "����", "����");
		dataset.setValue(200, "����", "����");
		dataset.setValue(20, "�Ϻ�", "����");
		dataset.setValue(70, "����", "����");
		dataset.setValue(80, "����", "����");
		dataset.setValue(10, "����", "����");
		dataset.setValue(140, "�Ϻ�", "����");
		dataset.setValue(190, "����", "����");
		dataset.setValue(230, "����", "����");
	
		//����ͼ�����
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ������", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		
		//��������
		//��ȡ��ͼ������
		CategoryPlot plot =chart.getCategoryPlot();
		
		//���û�ͼ���ı���ɫ
		plot.setBackgroundPaint(Color.PINK);
		
		//����һ��3d��Ⱦ��
		BarRenderer3D renderer3d = new BarRenderer3D();
		//����Ⱦ�����ñ�ǩ��1.��ȡ�������ݣ�2.����������ʾ�ĸ�ʽ���������ָ�ʽ
		renderer3d.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", NumberFormat.getNumberInstance()));
		//���ñ�ǩ�Ŀ��ӻ�
		renderer3d.setBaseItemLabelsVisible(true);
		//������ǩ��λ��
		renderer3d.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
		//���ú����Ӽ�ľ���
		renderer3d.setItemLabelAnchorOffset(10D);
		//��������֮��ľ���
		renderer3d.setItemMargin(0.5);
		
		//������Ⱦ���ͻ�ͼ��
		plot.setRenderer(renderer3d);
		
		//4.����ͼƬ
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\bar4.jpg"), chart, 700, 500);
		
		System.out.println("ok");
	}

}
