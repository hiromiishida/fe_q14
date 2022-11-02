public class Main {
    public static void main(String[] args) {
        String[] data = reverse(new String[]{"A", "B", "C", "D", "E", "F", "G"});
        for(int i=0 ; i <= data.length - 1; i++){
            System.out.println(data[i]);
        }
    }

    private static String[] reverse(String[] data){
        int i;
        for(i = 0 ; i <= (data.length - 1) / 2; i++){
            int j = data.length - 1 - i;
            String tmp = data[j];
            data[j] = data[i];
            data[i] = tmp;
        }

        return data;
    }
}