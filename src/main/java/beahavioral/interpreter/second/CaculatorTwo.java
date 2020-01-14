package beahavioral.interpreter.second;

import beahavioral.interpreter.first.ValueNode;

import java.util.Stack;

public class CaculatorTwo {
    private String statement;
    private Node node;

    //对算式进行求解
    public void build(String statement) {
        Node left = null, right = null;
        /**
         * 声明一个栈将所求式子中的数计算结果放入栈中用于下次计算
         */
        Stack stack =new Stack();
        /**
         * 声明一个String类型的数组存放,被分割后的算数表达式各个符号
         */
        String[] statementArr = statement.split("");

        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left=(Node)stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNodeTwo(val);
                stack.push(new Mul(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNodeTwo(val);
                stack.push(new Div(left, right));

            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNodeTwo(val);
                stack.push(new Mod(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }



        }
        this.node=(Node)stack.pop();


    }
    public int comput() {
        return node.interpretTwo();
    }

}
