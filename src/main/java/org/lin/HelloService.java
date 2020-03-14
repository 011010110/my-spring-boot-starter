package org.lin;


import org.lin.HelloProperties;

/**
 * @Description TODO
 * @Author li.linhua
 * @Date 2019/12/29
 * @Version 1.0
 */

public class HelloService {

    private HelloProperties helloProperties;

    public HelloService(){}

    public HelloService(HelloProperties helloProperties){
        this.helloProperties = helloProperties;
    }

    public void testMethod(){
        System.out.println(helloProperties.toString());
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
