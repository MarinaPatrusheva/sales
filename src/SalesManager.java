public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int average(){
        int average = 0;
        int max = sales[0];
        int min = sales[0];
        for (int i = 0; i < sales.length; i++ ){
            if(sales[i] > max){
                max = sales[i];
            }
            if(sales[i] < min){
                min = sales[i];
            }
        }
        for (int i = 0; i < sales.length; i++){
            average += sales[i];
        }
        return (average - min - max)/(sales.length - 2);
    }
}
