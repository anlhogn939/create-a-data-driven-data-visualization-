import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class DataVisualizationGenerator {

    private static final Random random = new Random();

    public static void main(String[] args) {
        String chartTitle = "Data Visualization Example";
        String xAxisLabel = "X Axis";
        String yAxisLabel = "Y Axis";

        // Generate sample data
        List<Double> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            xValues.add(random.nextDouble() * 10);
            yValues.add(random.nextDouble() * 10);
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < xValues.size(); i++) {
            dataset.addValue(yValues.get(i), "Series 1", String.valueOf(xValues.get(i)));
        }

        // Create the chart
        JFreeChart chart = ChartFactory.createLineChart(
                chartTitle, xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, false, true, false);

        // Display the chart
        ChartFrame frame = new ChartFrame("Data Visualization", chart);
        frame.pack();
        frame.setVisible(true);
    }
}