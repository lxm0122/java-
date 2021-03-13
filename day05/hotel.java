package day05;

public class hotel {
    room[][] hotel= new room[5][20];

    public hotel() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                int roomnum = 1000 * (i + 1)  + j+1;
                hotel[i][j]=new room(roomnum);
            }
        }
    }

    public void in(int roomnum, String customername) {
        int i=roomnum/1000-1;
        int j=roomnum%1000-1;
        if (hotel[i][j].customer != null){
            System.out.println("有人");
            return;
        }
        hotel[i][j].customer=new customer(customername);
        System.out.println("d=====(￣▽￣*)b登记成功");
    }

    public void out(int roomnum) {
        int i=roomnum/1000-1;
        int j=roomnum%1000-1;
        if (hotel[i][j].customer == null){
            System.out.println("这房没人");
            return;
        }
        String name=hotel[i][j].customer.customername;
        hotel[i][j].customer=null;
        System.out.println("d=====(￣▽￣*)b退房成功");
    }


    public void show() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                if (hotel[i][j].customer == null){
                }else {
                    System.out.println(hotel[i][j].roomnum+"  "+hotel[i][j].customer.customername);
                }
            }
            }

    }
}

