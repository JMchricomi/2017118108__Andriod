### 整个过程一直点击按钮跳转生产app入栈顺序分别是第一个Hello1、第一个Hello2、第一个Hello3、第二个Hello2、第二个Hello3，然后按返回的时候就是app停下来并且销毁，直到栈内无app即任务结束。具体Logcat截图如下

#### 这是图片一
##### 首先启动项目后onCreate执行生成第一个Hello1入栈
##### 在第一个Hello1 app界面点击Hello2的按钮就创建了第一个Hello2 入栈并执行，则第一个Hello1 app停止
![image](https://github.com/JMchricomi/2017118108__Andriod/blob/master/HelloWorld%E7%9A%84%E5%85%A5%E6%A0%88%E3%80%81%E9%94%80%E6%AF%81/11.png)
#### 这是图片二（过程细节如下图里面的文字）
![image](https://github.com/JMchricomi/2017118108__Andriod/blob/master/HelloWorld%E7%9A%84%E5%85%A5%E6%A0%88%E3%80%81%E9%94%80%E6%AF%81/22.png)
#### 这是图片三（过程细节如下图里面的文字）
![image](https://github.com/JMchricomi/2017118108__Andriod/blob/master/HelloWorld%E7%9A%84%E5%85%A5%E6%A0%88%E3%80%81%E9%94%80%E6%AF%81/33.png)
#### 这是图片四（过程细节如下图里面的文字）
![image](https://github.com/JMchricomi/2017118108__Andriod/blob/master/HelloWorld%E7%9A%84%E5%85%A5%E6%A0%88%E3%80%81%E9%94%80%E6%AF%81/44.png)
