package beahavioral.chain.first;

public class Client {
    public static void main(String[] args) {
        /**
         *
         */
        Leader objDirector,objManger,objGeneralMannager;

        LeaveRequest lr1,lr2,lr3,lr4;

        objDirector = new Director("黎明");
        objManger = new Manager("刘德华");
        objGeneralMannager = new GenreaManger("李小龙");

        objManger.setSucceessor(objDirector);
        objDirector.setSucceessor(objGeneralMannager);

        //员工的请求
        lr1 = new LeaveRequest("李娜", 2);
        //处理请假
        objManger.handleRequest(lr1);

        lr2 = new LeaveRequest("张明慧", 5);
        objManger.handleRequest(lr2);

        lr3 = new LeaveRequest("王小波", 25);
        objManger.handleRequest(lr3);

        lr4 = new LeaveRequest("白靖", 90);
        objManger.handleRequest(lr4);
    }
}
