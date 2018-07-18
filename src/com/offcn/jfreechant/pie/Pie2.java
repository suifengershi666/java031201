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
		//���ñ�ǩ����
		pieplot.setLabelFont(new Font("����",1,12));
		//������������ʾ
		pieplot.setNoDataMessage("�Բ������ݼ���ʧ��");
		//���ñ�״ͼ�ı�ǩ0--��Ʒ���ƣ�1--������2--����ռ��
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}--{1}--{2}",NumberFormat.getNumberInstance(),NumberFormat.getNumberInstance()));	
		pieplot.setExplodePercent("ƻ��", 0.2);
		pieplot.setExplodePercent("����", 0.2);
		pieplot.setExplodePercent("����", 0.2);
		pieplot.setExplodePercent("����", 0.2);
		//����ͼƬ
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\pie1.jpg"), chart, 700, 500);
		System.out.println("ok");
	}

}
