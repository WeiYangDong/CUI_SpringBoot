# Spring Boot基础项目构建
# 系统要求 #

- Java 7及以上
- IntelliJ IDEA
# 构建项目 #
通过SPRING INITIALIZR工具生成基础项目

1. 访问：http://start.spring.io/
2. 选择构建工具Maven Project/Gradle Project、Spring Boot版本以及一些工程基本信息，如图：![](https://i.imgur.com/rP4SbyG.png)
3. 点击Generate Project下载项目压缩包
4. 解压项目压缩包，并用IDEA以Maven项目导入
5. 菜单中选择File–>New–>Project from Existing Sources...
6. 选择解压后的项目文件夹，点击OK
7. 点击Import project from external model并选择Maven，点击Next到底为止
8. 项目构建完成，如图：![](https://i.imgur.com/divnLdk.png)

Spring Boot的基础结构共三个文件夹：

- src/main/java下的程序入口：UndeadApplication
- src/main/resources下的配置文件：application.properties
- src/test/下的测试入口：UndeadApplicationTests

生成的UndeadApplication和UndeadApplicationTests类都可以直接运行来启动当前创建的项目，由于目前该项目未配合任何数据访问或Web模块，程序会在加载完Spring之后结束运行。
# 引入Web模块 #
当前的pom.xml内容如下，仅引入了两个模块：

- spring-boot-starter：核心模块，包括自动配置支持、日志和YAML
- spring-boot-starter-test：测试模块，包括JUnit、Hamcrest、Mockito
 
![](https://i.imgur.com/Pw39LER.png)

引入Web模块，需添加spring-boot-starter-web模块：

    <!--Web模块-->
    <dependency>
    	<groupId>org.springframework.boot</groupId>
    	<artifactId>spring-boot-starter-web</artifactId>
    </dependency>
