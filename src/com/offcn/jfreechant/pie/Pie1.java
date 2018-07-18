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
		//׼�����ݼ���
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("ƻ��", 100);
		dataset.setValue("����", 120);
		dataset.setValue("����", 80);
		dataset.setValue("����", 60);
	
		//����ͼ�����
		JFreeChart chart = ChartFactory.createPieChart("ˮ��������״ͼ", dataset, true, true, false);
		
		//��������
		//��ȡ��ͼ������
		PiePlot pieplot = (PiePlot)chart.getPlot();
		//���ñ�״ͼ�ı�ǩ0--��Ʒ���ƣ�1--������2--����ռ��
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}--{1}--{2}",NumberFormat.getNumberInstance(),NumberFormat.getNumberInstance()));	
		
		//3d͸��Ч��
		PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
		//���ÿ�ʼ�Ƕ�
		pieplot3d.setStartAngle(120D);
		//������ת����
		pieplot3d.setDirection(Rotation.ANTICLOCKWISE);
		//���ð�͸��Ч����0-1��0ȫ͸����1��͸��
		pieplot3d.setForegroundAlpha(0.5F);
		
		
		//����ͼƬ
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\pie2.jpg"), chart, 700, 500);
		System.out.println("ok");
	}

}
