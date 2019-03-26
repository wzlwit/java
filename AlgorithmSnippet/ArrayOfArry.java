    public static void main(String[] args) {
       int[] num = {1,2,3,4};
       String[] txt={"a","b","c","d","e","f","h"};
       ArrayList<Object> mat =new ArrayList<>();
       mat.add(txt);
       mat.add(num);
       System.out.println(mat.get(1));       
    }
    