enum CabNo {
    TN72CE3452,TN65BH5579,TN34KL9214;
}
enum CabName{
    TATA, TOYOTA, MAHINDRA;
}
 class Cab{
     CabName cabName;
    CabNo cabNo;
   final  int seat;
   final double cost;
    Cab(CabName c,CabNo a,final int b,final double d){
        cabName = c;
        cabNo = a;
        seat = b;
        cost = d;
    }

    public String getCab(){
        return "cabName : "+ cabName+"\ncabNo : "+cabNo+"\nseat : "+seat +"\ncost : "+cost;
    }


}











