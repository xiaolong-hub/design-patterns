package beahavioral.interpreter.PK;

import beahavioral.interpreter.first.ValueNode;
import beahavioral.interpreter.second.Node;

import java.util.Stack;

public class CalculatorPK {

    private String statement;
    private Node node;


    public void buile() {
        NodePK left=null,right=null;
        String[] statementArr = statement.split("");
        Stack stack=new Stack();
        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                //左边的数是栈顶的元素
                left = (NodePK) stack.pop();
                //向后移动一位并取出其值
                int val = Integer.parseInt(statementArr[++i]);
                //将上一步取到的值赋值给右边的值
                right = new ValueNodePk(val);
                //将计算结果放入栈中

            } else if (statementArr[i].equalsIgnoreCase("/")) {

            } else if (statementArr[i].equalsIgnoreCase("%")) {

            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }

        }
        this.node = (Node) stack.pop();

    }
    public int compute() {
        return node.interpretTwo();

    }


}
